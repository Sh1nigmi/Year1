package javaapplication1;

import java.util.Scanner;
public class FinalOutput1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		EnterNum();
	}
	
	static void EnterNum() {
		System.out.println("(Note: The number should be greater than or equal to 1.)");
		System.out.print("Enter a number: ");
		String num = sc.nextLine().trim();
		if (num.isEmpty() || num.equals(" ")) {
			System.out.println("Input is required!");
			System.out.println();
			EnterNum();
		} else if (num.matches("-?\\d+(\\.\\d+)?")){
			int numInt = Integer.parseInt(num);
			if (numInt > 1) {
				Print(numInt);
			} else {
				System.out.println("Invalid number! Try again!");
				System.out.println();
				EnterNum();
			}
		} else {
			System.out.println("Invalid input!");
			System.out.println();
			EnterNum();
		}
	}
	
	static void Print (int num) {
			for (int r = 0; r < num ; r++) {
				if (r % 2 == 0) {
				for (int c = 0; c < num; c++) {
					if (c % 2 == 0) {
						//Pattern1(num);
						System.out.print("1 ");
					} else {
						System.out.print("2 ");
						//Pattern2(num);
					}
				}
				System.out.println();
				} else {
					for (int c = 0; c < num; c++) {
					if (c % 2 == 0) {
						//Pattern2(num);
						System.out.print("2 ");
					} else {
						//Pattern1(num);
						System.out.print("1 ");
					}
				}
				System.out.println();
				}	
			}
	}
		
	
	static void Box (int numInt) {
		int boxLength = numInt * (numInt - 1) + 1;
		System.out.println(boxLength);
		for (int r = 0; r < boxLength; r++) {
			for (int c = 0; c < boxLength; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		Pattern1(numInt);
	}
	
	static void Pattern1 (int numInt) {
		if (numInt % 2 == 0) { //num = even
			int center = numInt / 2;
				for (int r = 0; r <= numInt; r++) {
					if (r == 1 || r == numInt) {
						for (int c = 0; c < numInt; c++) {
						System.out.print("* ");
						}
					} else if (r == center) {
						System.out.print("^ ");
					} else {
						for (int c = 0; c < numInt; c++) {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
		} else { //num = odd
			int center = (numInt / 2) + 1;
			for (int r = 0; r <= numInt; r++) {
				if (r == 1 || r == numInt) {
					for (int c = 0; c < numInt; c++) {
					System.out.print("* ");
					}
				} else if (r == center) {
					for (int c = 1; c <= numInt; c++) {
						if (c == 1 || c == numInt) {
							System.out.print("* ");
						} else if (c == center) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}
				} else if (r == center - 1 || r == center + 1){
					for (int c = 1; c <= numInt; c++) {
						if (c == 1 || r == numInt) {
							System.out.print("* ");
						} else if (c == center) {
							System.out.print("  ");
						} else {
							System.out.print("* ");
						}
					}
				}
				System.out.println();
			}
		}
	}
	
	static void Pattern2 (int numInt) {
		for (int r = 0; r < numInt; r++) {
			for (int c = 0; c < numInt; c++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
