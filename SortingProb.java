
public class SortingProb {

	SortingProb(){
		
	}
	
	public void sort(int[] a){
		
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp;
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
	}
	
	public int[] sortnew (){
		int[]a ={ -3,-1,-2,20,3};
		sort(a);
		
		return a;
		
	}
}
