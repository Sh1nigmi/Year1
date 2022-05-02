package javaapplication1;
import javax.swing.JOptionPane;

public class Prelim {

	public static void main(String[] args) {
		Choices();
	}

	static void Choices() {
		
		JOptionPane.showMessageDialog(null, "Welcome! This calculator will help you find the Area of Square, \n Rectangle, Triangle, Parallelogram, Trapezoid, and Circle.");
		String choice = JOptionPane.showInputDialog("SELECT FROM THE CHOICES -- \n1 - Square \n2 - Rectangle \n3 - Triangle \n4 - Parallelogram \n5 - Trapezoid \n6 - Circle \n7 - Exit");
		if (choice.equals("1")) {
//square
			aSquare();
		} else if (choice.equals("2")) {
//rectangle			
			aRectangleL();
		} else if (choice.equals("3")) {
//triangle		
							aTriangleB();
		} else if (choice.equals("4")) {
//parallelogram		
							aParallelogramB();
		} else if (choice.equals("5")) {
//trapezoid		
							aTrapezoidB1();
		} else if (choice.equals("6")) {
//circle	
							aCircle();
		} else if (choice.equals("7")) {
//exit	
							JOptionPane.showMessageDialog(null, "Thank you.");
		} else if (choice.isEmpty() || choice.equals(" ")) {
//empty			
		JOptionPane.showMessageDialog(null, "Input is required! Select from the choices again.");
			Choices();
		} else {
//invalid input!
		JOptionPane.showMessageDialog(null, "Invalid input! Select from the choices again .");
			Choices();
		}
	}
	
	static void aSquare() {
		String string1 = JOptionPane.showInputDialog("Enter the length(l) of the side of the Square: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null, "Input is required! Enter the length(l) again.");
				aSquare();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null, "Input is below 0! Enter the length(l) again.");
						aSquare();
					} else {
//results				
						double aSquare = double1 * double1;
						JOptionPane.showMessageDialog(null, "Square -- Length(l) of the side: " + double1 + " -- Area = " + aSquare);
						EndSelection();
					}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input! Enter the length(l) again.");
				aSquare();
			}
	}
	
	static void aRectangleL () {
		String string1 = JOptionPane.showInputDialog("Enter the length(l) of the Rectangle: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the length(l) again.");
				aRectangleL();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the length(l) again.");
						aRectangleL();
					} else {	
							aRectangleW(double1);
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the length(l) again.");
				aRectangleL();
			}
	}
	
	static void aRectangleW (double double1) {
		String string2 = JOptionPane.showInputDialog("Enter the width(w) of the Rectangle: ");
//validation			
			if (string2.isEmpty() || string2.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the width(w) again.");
				aRectangleW(double1);
			} else if (string2.matches("-?\\d+(\\.\\d+)?")) {
				double double2 = Double.parseDouble(string2);
					if (double2 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the width(w) again.");
						aRectangleW(double1);
					} else {
//results										
						double aRectangle = double1 * double2;
						JOptionPane.showMessageDialog(null, "Rectangle -- Length(l): " + double1 + " -- Width(w): " + double2 +" -- Area = " + aRectangle);
						EndSelection();
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the width(w) again.");
				aRectangleW(double1);
			}
	}
	
	static void aTriangleB () {
		String string1 = JOptionPane.showInputDialog("Enter the base(b) of the Triangle: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the base(b) again.");
				aTriangleB();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the base(b) again.");
						aTriangleB();
					} else {	
						aTriangleH(double1);
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the base(b) again.");
				aTriangleB();
			}
	}
	
	static void aTriangleH (double double1) {
		String string2 = JOptionPane.showInputDialog("Enter the height(h) of the Triangle: ");
//validation			
			if (string2.isEmpty() || string2.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the height(h) again.");
				aTriangleH(double1);
			} else if (string2.matches("-?\\d+(\\.\\d+)?")) {
				double double2 = Double.parseDouble(string2);
					if (double2 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the height(h) again.");
						aTriangleH(double1);
					} else {
//results										
						double aTriangle = 0.50  * double1 * double2;
						JOptionPane.showMessageDialog(null, "Triangle -- Base(b): " + double1 + " -- Heigth(h): " + double2 +" -- Area = " + aTriangle);
						EndSelection();				
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the height(h) again.");
				aTriangleH(double1);
			}
	}
	
	static void aParallelogramB () {
		String string1 = JOptionPane.showInputDialog("Enter the base(b) of the Parallelogram: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the base(b) again.");
				aParallelogramB();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0!  Enter the base(b) again.");
						aParallelogramB();
					} else {	
						aParallelogramH(double1);
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input!  Enter the base(b) again.");
				aParallelogramB();
			}
	}
	
	static void aParallelogramH (double double1) {
		String string2 = JOptionPane.showInputDialog("Enter the height(h) of the Parallelogram: ");
//validation			
			if (string2.isEmpty() || string2.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required!  Enter the heigth(h) again.");
				aParallelogramH(double1);
			} else if (string2.matches("-?\\d+(\\.\\d+)?")) {
				double double2 = Double.parseDouble(string2);
					if (double2 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0!  Enter the height(h) again.");
						aParallelogramH(double1);
					} else {
//results										
						double aParallelogram = double1 * double2;
						JOptionPane.showMessageDialog(null, "Parallelogram -- Base(b): " + double1 + " -- Heigth(h): " + double2 +" -- Area = " + aParallelogram);	
						EndSelection();
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the height(h) again.");
				aParallelogramH(double1);
			}
	}
	
	static void aTrapezoidB1() {	
		String string1 = JOptionPane.showInputDialog("Enter the 1st base(b1) of the Trapezoid: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the 1st base(b1) again.");
				aTrapezoidB1();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the 1st base(b1) again.");
						aTrapezoidB1();
					} else {						
						aTrapezoidB2(double1);
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter the 1st base(b1) again.");
				aTrapezoidB1();
			}		
	}
	
	static void aTrapezoidB2 (double double1) {
		String string2 = JOptionPane.showInputDialog("Enter the 2nd base(b2) of the Trapezoid: ");
//validation			
			if (string2.isEmpty() || string2.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Enter the 2nd base(b2) again.");
				aTrapezoidB2(double1);
			} else if (string2.matches("-?\\d+(\\.\\d+)?")) {
				double double2 = Double.parseDouble(string2);
					if (double2 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter the 2nd base(b2) again.");
						aTrapezoidB2(double1);
					} else {										
						aTrapezoidH(double1, double2);
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! EEnter the 2nd base(b2) again.");
				aTrapezoidB2(double1);
			}
	}
	
	static void aTrapezoidH (double double1, double double2) {
		String string3 = JOptionPane.showInputDialog("Enter the height(h) of the Trapezoid: ");
//validation			
			if (string3.isEmpty() || string3.equals(" ")) {
				JOptionPane.showMessageDialog(null,"Input is required! Try again.");
				aTrapezoidH(double1, double2);
			} else if (string3.matches("-?\\d+(\\.\\d+)?")) {
				double double3 = Double.parseDouble(string3);
					if (double3 < 0) {
						JOptionPane.showMessageDialog(null,"Input is below 0! Enter base(b) and height(b) again.");
						aTrapezoidH(double1, double2);
					} else {
//results										
						double aTrapezoid = ((double1 + double2) / 2 ) * double3;
						JOptionPane.showMessageDialog(null, "Trapezoid -- 1st Base(b): " + double1 + " -- 2nd Base(b): " + double2+ " -- Heigth(h): " + double3 +" -- Area = " + aTrapezoid);
						EndSelection();
					}
			} else {
				JOptionPane.showMessageDialog(null,"Invalid input! Enter base(b) and height(b) again.");
				aTrapezoidH(double1, double2);
			}
	}
	
	static void aCircle() {
		String string1 = JOptionPane.showInputDialog("Enter the radius(r) of the Circle: ");
//validation			
			if (string1.isEmpty() || string1.equals(" ")) {
				JOptionPane.showMessageDialog(null, "Input is required! Enter the radius(r) again.");
				aCircle();
			} else if (string1.matches("-?\\d+(\\.\\d+)?")) {
				double double1 = Double.parseDouble(string1);
					if (double1 < 0) {
						JOptionPane.showMessageDialog(null, "Input is below 0! Enter the radius(r) again.");
						aCircle();
					} else {
//results				
						double aCircle = double1 * double1 * 3.14159265359;
						JOptionPane.showMessageDialog(null, "Circle -- Radius(r): " + double1 + " -- Area = " + aCircle);
						EndSelection();
					}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input! Enter the radius(r) again.");
				aCircle();
			}
	}
	
	static void EndSelection() {
		String choice = JOptionPane.showInputDialog(" Thank you! SELECT FROM THE CHOICES -- 1 - Main Menu, 2 - Exit");
		if (choice.equals("1")) {
//main menu
			Choices();
		} else if (choice.equals("2")) {
//exit		
			JOptionPane.showMessageDialog(null, "Thank you."); 
		} else if (choice.isEmpty() || choice.equals(" ")) {
//empty			
			JOptionPane.showMessageDialog(null, "Input is required! Try again.");
			EndSelection();
		} else {
//invalid input!
			JOptionPane.showMessageDialog(null, "Invalid input! Try again.");
			EndSelection();
		}
	}
}
