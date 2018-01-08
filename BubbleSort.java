
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a ={5,1,-3,6,8};
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
		System.out.print("Sorted elements are :");
		for(int k=0; k<a.length;k++ ){
			System.out.print(" "+a[k]);
		}
	}

}
