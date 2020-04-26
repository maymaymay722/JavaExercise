import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n=sc.nextInt();
            System.out.println(drink(n));
        }
    }

    private static int drink(int n) {
        int total=0;  //总共可以喝到多少瓶
        while(n>2){
            total =total+n/3;    // n/3 代表 n 瓶可以换的多少瓶
            n=n/3+n%3;    // n%3 上次换饮料剩下的空瓶数 + n/3 喝完换回的饮料后的空瓶数
        }
        if(n==2){
            total =total+1;   // 哈哈，还剩两个空瓶，问老板借一个空瓶，换一瓶饮料，喝完再还给老板
        }
        return total;
    }
}
