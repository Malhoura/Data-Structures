
public class MergeApp {

	public static void main(String[] args) {
		int[] array1 = {23, 47, 81, 95};
		int[] array2 = {7, 14, 39, 55, 62, 74};
		int[] array3 = new int[10];
		
		merge(array1, 4, array2, 6, array3);
		display(array3, 10);

	}
	
	//merge function has five arguments passed to it
	public static void merge(int[] arrayA, int sizeA, int [] arrayB, int sizeB, int [] arrayC){
		
		int i=0;
		int j=0;
		int k=0;
		
		//when both arrays A and B are not empty
		while(i<sizeA && j<sizeB){
			//if value at arrayA is smaller that the value at arrayB
			if(arrayA[i] < arrayB[j]){
				//merge this value to the new array (arrayC)
				arrayC[k] = arrayA[i];
			i++;
			}else{
				//otherwise merge the value at arrayB to the new arrayC
				arrayC[k] = arrayB[j];
				
				j++;
			}
			//increment arrayC index when finished merging
			k++;
		}
		//when the two arrays are not equal in length
		//and arrayA larger than arrayB
		//merge the rest of the sorted elements of arrayA to the new arrayC and increment both indexes
		while(i < sizeA){
			arrayC[k] = arrayA[i];
			i++;
			k++;
		}
		
		//when the two arrays are not equal in length
		//and arrayB larger than arrayA
		//merge the rest of the sorted elements of arrayB to the new arrayC and increment both indexes
		while(j < sizeB){
			arrayC[k] = arrayB[j];
			j++;
			k++;
		}
	}
	
	// displaying sorted array's elements
	public static void display(int [] theArray, int num){
		
		for(int i=0; i < num; i++){
		System.out.print(theArray[i]+ " ");	
		System.out.println("");
		
		}		
	}

}
