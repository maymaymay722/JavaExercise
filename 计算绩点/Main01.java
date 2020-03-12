import java.util.*;

public class Main01 {
    public static double result(int[] fx,int[] xf){
        double GPA=0;
        double all=0;
        for(int i=0;i<fx.length;i++){
            all += xf[i];
        }
        for(int i=0;i<fx.length;i++){
            if(fx[i]>=90 && fx[i]<=100){
                GPA += 4.0*xf[i];
            }
            if(fx[i]>=85 && fx[i]<=89){
                GPA += 3.7*xf[i];
            }
            if(fx[i]>=82 && fx[i]<=84){
                GPA += 3.3*xf[i];
            }
            if(fx[i]>=78 && fx[i]<=81){
                GPA += 3.0*xf[i];
            }
            if(fx[i]>=75 && fx[i]<=77){
                GPA += 2.7*xf[i];
            }
            if(fx[i]>=72 && fx[i]<=74){
                GPA += 2.3*xf[i];
            }
            if(fx[i]>=68 && fx[i]<=71){
                GPA += 2.0*xf[i];
            }
            if(fx[i]>=64 && fx[i]<=67){
                GPA += 1.5*xf[i];
            }
            if(fx[i]>=60 && fx[i]<=63){
                GPA += 1.0*xf[i];
            }
            if(fx[i]<60){
                GPA += 0*xf[i];
            }
        }
        GPA /= all;
        System.out.printf("%.2f",GPA);
        return GPA;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] xf=new int[n];
        for(int i=0;i<n;i++){
            xf[i]=sc.nextInt();
        }
        int[] fx=new int[n];
        for(int i=0;i<n;i++){
            fx[i]=sc.nextInt();
        }
        result(fx,xf);
    }
}