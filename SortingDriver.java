
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []num =new int[]{5,1,-3,6,8,-10};
		SortingProb obj = new SortingProb();
		obj.sort(num);
		System.out.print("sorted array elements : ");
		
		for(int i=0; i<num.length;i++){
			System.out.print( " " +num[i]);			
		}
		System.out.println();
		int[] result=obj.sortnew();
		System.out.print("sorted array elements : ");
		for(int i=0; i<result.length;i++){
			System.out.print( " " +result[i]);
		}
		
	}
	
		
}


