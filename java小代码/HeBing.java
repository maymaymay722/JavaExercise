public class HeBing{
	public static void main(String[] args){
		int[] arr1={1,2,5,7,4,21,44};
		int[] arr2={13,21,35,27,41,31};
		int[] arr=getValue(arr1,arr2);
		print(arr);
		sortArr(arr);
		print(arr);
	}
	
	public static int[] getValue(int[] arr1,int[] arr2){
		int[] arr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			arr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr[arr1.length+i]=arr2[i];
		}
		return arr;
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public static void sortArr(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j+1]<arr[j]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}  
}