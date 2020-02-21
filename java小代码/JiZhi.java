public class JiZhi{
	public static void main(String[] args){
		int[] arr={23,56,47,87};
		System.out.println(max(arr));
	}
	
	public static int max(int[] arr){
		int maxValue=-1;
		if(arr != null && arr.length != 0){
			for(int i=0;i<arr.length;i++){
				if(arr[i]>maxValue){
					maxValue=arr[i];
				}
			}
		}
		return maxValue;
	}
}