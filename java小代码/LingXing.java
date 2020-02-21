import java.util.*;
public class LingXing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int z=1;z<= 2*i-1;z++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1;i>=1;i--){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int z=1;z<= 2*i-1;z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}