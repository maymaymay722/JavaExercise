import java.util.*;
public class Oop1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int guess=sc.nextInt();
		A a=new A();
		if(guess==a.v){
			System.out.println("猜测成功");
		}
		if(guess<a.v){
			System.out.println("猜小了");
		}
		if(guess>a.v){
			System.out.println("猜大了");
		}
	}
}
class A{
	int v=100;
}