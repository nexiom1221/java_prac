package ch20;

public class array {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		int num = 0;
		
		for(int i=0; i< arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(int i=0; i< arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println(total);
		
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(char alpha : alpahbets) {
			System.out.println(alpha +","+ (int)alpha);
		}

	}
	
	


	}

