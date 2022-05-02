import java.util.Scanner;

public class MidtermOutput2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array;
		int sum = 0;
		int difference = 0;
		int product =1;
		
		System.out.println("Enter the number of numbers you want to process:");
		int x = input.nextInt();
		array = new int[x];
		
		if (x >=1){
			for (int a = 0; a < array.length; a++){
					System.out.println("Enter number " + (a + 1) + ":");
					array [a] = input.nextInt();
			}
			System.out.println("--------------------ALL NUMBERS--------------------");
			for (int b = 0; b < array.length; b++){
					System.out.println(" => " + array[b]);
					sum =sum + array[b];
					difference =   difference - array[b];
					product = product * array[b];
					}
	
			System.out.print("Sum: " + "\t" + "\t");
			for (int c = 0; c < array.length; c++){
				if (c == 0){
					System.out.print(array[c]);
				}else{
					System.out.print(" + " + array[c]);
				}
			}
					System.out.println(" = " + sum);
					
			System.out.print("Difference: " + "\t");
			for (int d = 0; d < array.length; d++){
				if (d == 0){
					System.out.print(array[d]);
				}else{
					System.out.print(" - " + array[d]);
				}
			}
					System.out.println(" = " + difference);
			System.out.print("Product: " + "\t");
			for (int e = 0; e < array.length; e++){
				if (e == 0){
					System.out.print(array[e]);
				}else{
					System.out.print(" * " + array[e]);
				}
			}
					System.out.println(" = " + product);
					
			System.out.println("--------------------EVEN NUMBERS-------------------");	
			
			int sumE = 0;
			int differenceE = 0;
			int productE = 1;
			
			for (int f = 0; f < array.length; f++){
					if ( array[f] % 2 == 0){
						System.out.println(" => " + array[f]);
						sumE = sumE + array[f];
						differenceE =   differenceE - array[f];
						productE = productE * array[f];
					}
			}
			
			System.out.print("Sum: " + "\t" + "\t");
			for (int fp = 0; fp < array.length; fp++){
				if (fp == 0){
					System.out.print(array[fp]);
				}else{
					System.out.print(" + " + array[fp]);
				}
			}
					System.out.println(" = " + sum);
					
			System.out.print("Difference: " + "\t");
			for (int fd = 0; fd < array.length; fd++){
				if (fd == 0){
					System.out.print(array[fd]);
				}else{
					System.out.print(" - " + array[fd]);
				}
			}
					System.out.println(" = " + difference);
			System.out.print("Product: " + "\t");
			for (int fp = 0; fp < array.length; fp++){
				if (fp == 0){
					System.out.print(array[fp]);
				}else{
					System.out.print(" * " + array[fp]);
				}
			}
					System.out.println(" = " + product);		
			
			System.out.println("--------------------ODD NUMBERS--------------------");	
			for (int g = 0; g< array.length; g++){
					if ( array[g] % 2 == 1){
						System.out.println(" => " + array[g]);
					}
				}
			}else{
			System.out.println("Invalid Input!");
			}
	}
}