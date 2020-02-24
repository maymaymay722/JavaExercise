import java.util.Scanner;

public class HuiWen {
	public static boolean isHuiWen(String str){
		int i=0;
		int j=str.length()-1;
		while(i<j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入str1：");
		String str1=sc.nextLine();
		System.out.println("请输入str2：");
		String str2=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str1.length();i++){
			StringBuffer sb=new StringBuffer(str1);
			sb.index(i,str2);
			if(isHuiWen(sb.toString)){
				count++;
			}
		}
		System.out.println(count);
    }
}
