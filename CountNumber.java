import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class CountNumber {
	
	public static void main(String[] args){

	int []number ={1,1,2,3,3,3,4,5,5,6,7,7,8,8,8,9};
	
	
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	for(int i=0;i<number.length;i++){
		Integer key=number[i];
		
		if(hm.containsKey(key)){
			int count =hm.get(key);
			count++;
			hm.put(key, count);
	
		}
		else{
			
			hm.put(key, 1);
		}
	}
	
	
	Set<Integer>keys =hm.keySet();
	for(Integer key: keys){
		int value = hm.get(key);
		System.out.println("key is : " + key+ " "+ "value :"+ value) ;
		
	}
  }
}


