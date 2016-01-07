
public class MergeApp {

	public static void main(String[] args) {
		int[] array1 = {23, 47, 81, 95};
		int[] array2 = {7, 14, 39, 55, 62, 74};
		int[] array3 = new int[10];
		
		merge(array1, 4, array2, 6, array3);
		display(array3, 10);

	}
	
	public static void merge(int[] arrayA, int sizeA, int [] arrayB, int sizeB, int [] arrayC){
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<sizeA && j<sizeB){
			if(arrayA[i] < arrayB[j]){
				arrayC[k] = arrayA[i];
			i++;
			}else{
				arrayC[k] = arrayB[j];
				
				j++;
			}
			k++;
		}
		while(i < sizeA){
			arrayC[k] = arrayA[i];
			i++;
			k++;
		}
			
		while(j < sizeB){
			arrayC[k] = arrayB[j];
			j++;
			k++;
		}
	}
	
	public static void display(int [] theArray, int num){
		
		for(int i=0; i < num; i++){
		System.out.print(theArray[i]+ " ");	
		System.out.println("");
		
		}		
	}

}
