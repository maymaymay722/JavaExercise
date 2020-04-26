/*
class Base {
    Base() {
        System.out.print("Base");
    }
}
public class Alpha extends Base {
    public static void main( String[] args ) {
        new Alpha(); //调用父类无参的构造方法
        new Base();
    }
}*/
public class Alpha {
    static int i = 0;    //static 只能定义在这

    public int aMethod(){
        i++;
        return i;
    }
    public static void main(String args[]){
        Alpha test = new Alpha();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}