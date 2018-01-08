
public class BinarySearchProblem {
	
	public static int binSearch (int[] a, int key){
		int start =0;
		int end = a.length-1;
		
		while(start<=end){
			int mid = (start+end)/2;
			if(a[mid]==key){
				return mid;
			}
			if(key<a[mid]){
				end = mid-1;
				
			}
			else
				start = mid+1;
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,9};
		int index = binSearch(a,8);	
		if(index==-1){
			System.out.println("key not found");
		}
		else{
		System.out.println("key found and the index is : " +index);
		}
		
	
	}

}
