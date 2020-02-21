public class Demo{
	public static void main(String[] args){
		int[] arr={23,45,-2,89,-90};
		maoPao(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void maoPao(int[] arr){
		if(arr !=null && arr.length != 0){
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j+1]>arr[j]){
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
}