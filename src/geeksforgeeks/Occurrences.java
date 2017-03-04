package geeksforgeeks;

public class Occurrences {
	public static int getFirstOccurrence (int[] arr, int input) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == input) return i;
		}
		// no value found, return -1
		return -1;
	}
	
	public static int getLastOccurrence (int[] arr, int input) {
		int lastOccurrence = -1;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == input) lastOccurrence = i;
		}
		// no value found, return -1
		return lastOccurrence;
	}
	public static void main(String[] args) {
		int A[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125};
		int x=5;
		System.out.println(Occurrences.getFirstOccurrence(A, x));
		System.out.println(Occurrences.getLastOccurrence(A, x));
	}
}
