public class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        System.out.println(sb);

    }

    private static void fun(StringBuffer temp) {
        temp.append("\n").append("我的世界！");
    }
}
