import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

public class UdpServer{
    // 定义 udp 端口号
    public static final int PORT=30000;
    // 每个数据报最大为 4k
    private static final int DATA_LEN=4096;
    // 接收网络数据的字节数组
    byte[] buff_in=new byte[DATA_LEN];
    // 以指定字节数组创建准备接受数据的 DatagramPacket 对象
    private DatagramPacket packet_in=new DatagramPacket(buff_in,buff_in.length);
    // 定义一个用于发送的 DatagramPacket 对象
    private DatagramPacket packet_out=null;

    // 定义 map 集合，用来存放需要翻译的单词
    private static Map<String,String> maps=new HashMap<>();
    // 向 map 中添加数据
    static{
        maps.put("dog","狗");
        maps.put("cat","猫");
        maps.put("fish","鱼");
        maps.put("bird","鸟");
        maps.put("pig","猪");
    }

    public void start() throws IOException {
        try(DatagramSocket socket=new DatagramSocket(PORT)){
            // 客户端输入的英文单词
            String key=null;
            // 服务端翻译的中文内容
            String value=null;
            // 获取客户端对象，通过该对象将数据写给对方，否则没有目的地
            SocketAddress address=null;
            // 返回给客户端的数据
            byte[] reviceData=null;
            System.out.println("英译汉服务器启动了......");

            while(true){
                // 读取 socket 中的数据，然后将数据封装到 packet_in 中
                socket.receive(packet_in);
                // 获取客户端输入的数据
                buff_in=packet_in.getData();
                // 将 byte 数组转换为字符串，需要去掉后面的空格
                key=new String(buff_in,0,buff_in.length).trim();

                // 根据 map 的 key 获取 value
                value=maps.get(key);
                if(null==value){
                    value="默认值";
                }
                address=packet_in.getSocketAddress();
                // 检查退出条件
                if("down".equals(key)){
                    System.out.println("客户端输入 的是："+key);
                    reviceData="服务器关闭了，请重试".getBytes();
                    packet_out=new DatagramPacket(reviceData,reviceData
                    .length,address);
                    socket.send(packet_out);
                    break;
                }else{
                    System.out.println("客户端输入的是："+key+"，翻译后的结果是"+value);
                    // 构建服务端发送给客户端的数据
                    reviceData=("你输入的英文单词翻译成中文是："+value).getBytes();
                    // 构建 packet_out 发送数据
                    packet_out=new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
            System.out.println("=====服务端关闭=====");
        }
    }

    public static void main(String[] args) throws IOException {
        new UdpServer().start();
    }
}

// 实现一个简单的服务端接收客户端输入的信息然后在服务端显示
/*
public class UdpServer{
    // 定义 udp 端口号
    public static final int PORT=30000;
    // 每个数据报最大为 4k
    private static final int DATA_LEN=4096;
    // 接收网络数据的字节数组
    byte[] buff_in=new byte[DATA_LEN];
    // 以指定字节数组创建准备接受数据的 DatagramPacket 对象
    private DatagramPacket packet_in=new DatagramPacket(buff_in,buff_in.length);

    // 定义一个用于发送的 DatagramPacket 对象
    private DatagramPacket packet_out;

    public void start() throws SocketException {
        try(DatagramSocket socket=new DatagramSocket(PORT)){
            // 客户端输入的英文单词
            String word=null;
            // 获取客户端对象，通过该对象将数据写给对方，否则没有目的地
            SocketAddress address=null;
            // 返回给客户端的数据
            byte[] reviceData=null;
            System.out.println("服务端启动了......");

            while(true){
                // 获取 socket 中的数据，然后将数据封装到 packet_in 中
                socket.receive(packet_in);
                // 获取客户端输入的数据
                buff_in=packet_in.getData();
                // 将 byte数组转换为字符串，需要去掉后面的空格
                word=new String(buff_in,0,buff_in.length).trim();
                System.out.println("客户端输入的是："+word);
                address=packet_in.getSocketAddress();
                // 检查退出条件
                if("down".equals(word)){
                    reviceData="服务器关闭了，请重试".getBytes();
                    packet_out=new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                    break;
                }else{
                    // 构建服务端发送给客户端的数据
                    reviceData=("你输入的英文单词是："+word).getBytes();
                    // 构建 packet_out 发送数据
                    packet_out=new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("=====服务端关闭=====");
        }
    }

    public static void main(String[] args) throws SocketException {
        new UdpServer().start();
    }
}
*/