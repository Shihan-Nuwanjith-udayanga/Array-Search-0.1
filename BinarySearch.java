import java.util.*;
class BinarySearch{
	public static void main(String args[]){
		int[] x={12,34,54,43,2,5,55,96,78,59,1,2,47,87,66};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		int index;
		index=Arrays.binarySearch(x,54);
		System.out.println("Index of 54 :"+ index);
		
		index=Arrays.binarySearch(x,12);
		System.out.println("Index of 12 :"+ index);
	}
}
		
		
