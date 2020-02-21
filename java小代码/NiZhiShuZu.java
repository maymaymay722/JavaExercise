class NiZhiShuZu{
	public static void main(String[] args){
		int[] arr={12,90,36,93,88,78,37,-1,-3,33,88};
		swap(arr);
		for(int i=0;i<arr.length;i++){
			System.out.printf(arr[i]+"\t");
		}
	}
	
	public static void swap(int[] arr){
		int mid=arr.length/2;
		for(int i=0;i<mid;i++){
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;
		}
	}
}