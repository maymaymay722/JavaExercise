public class Demo2 {
    private static String firstUpper(String str) {
        if("".equals(str)||str==null){
            return str;
        }
        if(str.length()>0){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str.toUpperCase();

    }

    public static void main(String[] args) {

        //首字母大写
        System.out.println(firstUpper("hello"));
        System.out.println(firstUpper("a"));

//        String str="  Hello World  ";
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        System.out.println("["+str+"]");
//        System.out.println("["+str.trim()+"]");

        //System.out.println(str.substring(5));
        //System.out.println(str.substring(0,5));

        /*//拆分 Ip 地址
        String str="192.168.1.1";
        String[] result=str.split("\\.");
        for (String s:result){
            System.out.println(s);
        }*/

       /* String str1 = "name=zhangsan&age=18" ;
        String[] res=str1.split("\\&");
        for (int i = 0; i < res.length; i++) {
            String[] tmp=res[i].split("\\=");
            System.out.println(tmp[0]+"="+tmp[1]);

        }*/


//        String str="hello world hello china";
//        String[] result=str.split(" ");
//        String[] res=str.split(" ",2);
//        for(String s:res){
//            System.out.println(s);
//        }

//        String str1="hello";
//        String str2="Hello";
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println("A".compareTo("a"));
//        System.out.println("A".compareTo("A"));
//        System.out.println("a".compareTo("A"));
//
//        System.out.println(str1.indexOf("world"));
//        System.out.println(str2.indexOf("llo"));
//        if(str1.indexOf("hello") != -1){
//            System.out.println("找到了");
//        }

//        System.out.println(str1.replace("hello","world"));
    }


}
