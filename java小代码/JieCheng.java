public class JieCheng{
	public static void main(String[] args){
		int total=0;
		for(int i=0;i<=10;i++){
			total += fn(i);
		}
		System.out.print(total);
	}
	
	public static int fn(int num){
		/*
		int result=1;
		for(int i=num;i>0;i--){
			result *= i;
		}
		return result;
		*/
		int result=1;
		if(num>1){
			result=num*fn(num-1);
		}
		return result;
	}
}