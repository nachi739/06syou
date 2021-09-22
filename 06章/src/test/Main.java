package test;

public class Main {
	public static void main (String[] args) {
		int input = 0;
		int total = 0;
		while(input >= 0) {
			input = new java.util.Scanner(System.in).nextInt();
			if(input >= 0) {
				total += input;
			}
		}
		System.out.println(total);
			}


	}



