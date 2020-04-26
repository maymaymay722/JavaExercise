import java.util.Scanner;

public class Solution01{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int count=0;
        for (int i = 0; i < A.length(); i++) {
            StringBuilder sb=new StringBuilder(A);
            sb.insert(i,B);
            if(isHuiwen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isHuiwen(String s) {
         int i=0;
         int j=s.length()-1;
         while(i<j){
             if(s.charAt(i) != s.charAt(j)){
                 return false;
             }
         }
         return true;
    }
}