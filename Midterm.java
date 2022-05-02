package javaapplication1;
import java.io.*;
import java.util.*;

public class Midterm {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> FirstName = new ArrayList<>();
	static ArrayList<String> MiddleInitial = new ArrayList<>();
	static ArrayList<String> LastName = new ArrayList<>();
	static ArrayList<String> PrelimGrade = new ArrayList<>();
	static ArrayList<String> MidtermGrade = new ArrayList<>();
	static ArrayList<String> FinalGrade = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		ReadFile();
	}
	
	static void MainMenu(int EntryNum) throws IOException {
		System.out.println("============SELECT FROM THE CHOICES============");
		System.out.println("1 - Add a record");
		System.out.println("2 - Search for record/s");
		System.out.println("3 - View all record/s");
		System.out.println("4 - Edit a record");
		System.out.println("5 - Delete a record");
		System.out.println("6 - Delete all record/s");
		System.out.println("7 - Exit");
			String choice = sc.nextLine().trim();
			if (choice.equals("1")) {
//Add Record				
				AddRecord(EntryNum++);
			} else if (choice.equals("2")) {
//Search Record
				SearchRecord(EntryNum);
			} else if (choice.equals("3")) {
//View Record
				ViewRecords(EntryNum);
			} else if (choice.equals("4")) {
//Edit Record
				EditRecord(EntryNum);
			} else if (choice.equals("5")) {
//Delete a record				
				DeleteRecord(EntryNum);
			} else if (choice.equals("6")) {
//Delete all				
				DeleteAll(EntryNum);
			} else if (choice.equals("7")) {
//Exit
				System.out.println("Thank you!");
			} else if (choice.isEmpty() || choice.equals(" ")) {
				System.out.println("Input is required! Try again.");
				MainMenu(EntryNum);
			} else {
//Invalid Input!
				System.out.println("Choose from 1-7. Try again.");
				MainMenu(EntryNum);
			}
	}
	
	static void AddRecord(int EntryNum) throws IOException {
		System.out.println("==================ADD RECORD===================");
		System.out.println("Entry Number: " + (EntryNum + 1));
			System.out.println("---------------------NAME----------------------");
				FirstName(EntryNum);
				MiddleInitial(EntryNum);
				LastName(EntryNum);
			System.out.println("--------------------GRADES---------------------");	
				PrelimGrade(EntryNum);
				MidtermGrade(EntryNum);
				FinalGrade(EntryNum);
				
				AddRecordFile(EntryNum);
			System.out.println("Record successfully saved.");	
				
				EntryNum++;
				MainMenu(EntryNum);
	}
	
	static void FirstName(int EntryNum) {
		System.out.println("First Name:");
		String input = sc.nextLine().trim();
		if (input.isEmpty() || input.equals(" ")) {
			System.out.println("Input is required!");
			FirstName(EntryNum);
		} else {
			FirstName.add(EntryNum, input);
			}
	}
	
	static void MiddleInitial(int EntryNum) {
		System.out.println("Middle Initial:");
		String input = sc.nextLine().trim();
		if (input.isEmpty() || input.equals(" ")) {
			System.out.println("Input is required!");
			MiddleInitial(EntryNum);
		} else {
			MiddleInitial.add(EntryNum, input);
			}
	}
	
	static void LastName(int EntryNum) {
		System.out.println("Last Name:");
		String input = sc.nextLine().trim();
		if (input.isEmpty() || input.equals(" ")) {
			System.out.println("Input is required!");
			LastName(EntryNum);
		} else {
			LastName.add(EntryNum, input);
			}
	}
	
	static void PrelimGrade (int EntryNum) {
		System.out.println("Enter Prelim Grade: ");
		double InputDouble = 0;
		String InputString = sc.nextLine().trim();
			if (InputString .isEmpty() || InputString .equals(" ")) {
				System.out.println("Input is required!");
				PrelimGrade(EntryNum);
			} else if (InputString .matches("-?\\d+(\\.\\d+)?")) {
				InputDouble = Double.parseDouble(InputString );
					if (InputDouble > 100) {
						System.out.println("Invalid grade!");
						PrelimGrade(EntryNum);
					} else if (InputDouble < 60) {
						System.out.println("Invalid grade!");
						PrelimGrade(EntryNum);
					} else {
						String input = String.valueOf(InputDouble);
						PrelimGrade.add(EntryNum, input);
					}
			} else {
				System.out.println("Invalid input!");
				PrelimGrade(EntryNum);
			}
	}
	
	static void MidtermGrade (int EntryNum) {
		System.out.println("Enter Midterm Grade: ");
		double InputDouble = 0;
		String InputString = sc.nextLine().trim();
			if (InputString .isEmpty() || InputString .equals(" ")) {
				System.out.println("Input is required!");
				MidtermGrade(EntryNum);
			} else if (InputString .matches("-?\\d+(\\.\\d+)?")) {
				InputDouble = Double.parseDouble(InputString );
					if (InputDouble > 100) {
						System.out.println("Invalid grade!");
						MidtermGrade(EntryNum);
					} else if (InputDouble < 60) {
						System.out.println("Invalid grade!");
						MidtermGrade(EntryNum);
					} else {
						String input = String.valueOf(InputDouble);
						MidtermGrade.add(EntryNum, input);
					}
			} else {
				System.out.println("Invalid input!");
				MidtermGrade(EntryNum);
			}
	}
	
	static void FinalGrade (int EntryNum) {
		System.out.println("Enter Final Grade: ");
		double InputDouble = 0;
		String InputString = sc.nextLine().trim();
			if (InputString .isEmpty() || InputString .equals(" ")) {
				System.out.println("Input is required!");
				FinalGrade(EntryNum);
			} else if (InputString .matches("-?\\d+(\\.\\d+)?")) {
				InputDouble = Double.parseDouble(InputString );
					if (InputDouble > 100) {
						System.out.println("Invalid grade!");
						FinalGrade(EntryNum);
					} else if (InputDouble < 60) {
						System.out.println("Invalid grade!");
						FinalGrade(EntryNum);
					} else {
						String input = String.valueOf(InputDouble);
						FinalGrade.add(EntryNum, input);
					}
			} else {
				System.out.println("Invalid input!");
				FinalGrade(EntryNum);
			}
	}
	
	static void AddRecordFile(int EntryNum) throws IOException {
		FileWriter fw = new FileWriter("Records.txt");
		EntryNum++;
		for (int row = 0; row < EntryNum; row++) {	
			fw.write(FirstName.get(row) + "<==>" + MiddleInitial.get(row) + "<==>" + LastName.get(row) + "<==>" + PrelimGrade.get(row) + "<==>" + MidtermGrade.get(row) 
					+ "<==>" + FinalGrade.get(row));
			fw.write("\r\n");
		}
			fw.close();
	}
	
	static void ViewRecords(int EntryNum) throws IOException {
		System.out.println("====================RECORDS====================");
//Display Record
		PrintRecords(EntryNum);
		System.out.println();
		MainMenu(EntryNum);
	}
	
	static void PrintRecords (int EntryNum) {
		for (int row = 0; row < EntryNum; row++) {
			System.out.println("Record No.: " + (row + 1));
			System.out.println(LastName.get(row) + ", "+ FirstName.get(row) + " " + MiddleInitial.get(row) + ".");
			System.out.println("\tPrelim: " + PrelimGrade.get(row) + "\tMidterm: " + MidtermGrade.get(row) + "\tFinal: " + FinalGrade.get(row));
			double SemesterGrade = (Double.parseDouble(PrelimGrade.get(row)) + Double.parseDouble(MidtermGrade.get(row)) + Double.parseDouble(FinalGrade.get(row))) / 3;
			System.out.println("\tSemester Grade: " + SemesterGrade);
			System.out.println();
		}
		System.out.println("Record/s Found: " + EntryNum);
	}
	
	static void ReadFile() throws IOException {
		
		try {
		FileReader f = new FileReader("Records.txt");
		BufferedReader br = new BufferedReader(f); 
		String s = "";
		int x = 0;
		
		while ((s = br.readLine()) !=null) {
			String [] ReadEntry = s.split("<==>");

			FirstName.add(x,ReadEntry[0]);
			MiddleInitial.add(x,ReadEntry[1]);
			LastName.add(x,ReadEntry[2]);
			PrelimGrade.add(x,ReadEntry[3]);
			MidtermGrade.add(x,ReadEntry[4]);
			FinalGrade.add(x,ReadEntry[5]);
			
			x++;
		}
		System.out.println("Record/s Found: " + x);
		br.close();
		MainMenu(x);
		} catch (Exception e) {
			FileWriter fw = new FileWriter("Records.txt");
			fw.write("");
			fw.close();
			System.out.println("Records.txt is created.");
			System.out.println("Try again.");
		}
	}
	
	static void DeleteAll(int EntryNum) throws IOException {
		System.out.println("Are you sure you want to delete all record/s?");
		System.out.println("\t1 - Yes");
		System.out.println("\t2 - No");
		String choice = sc.nextLine().trim();
		
		if (choice.equals("1")) {
			FirstName.clear();
			MiddleInitial.clear();
			LastName.clear();
			PrelimGrade.clear();
			MidtermGrade.clear();
			FinalGrade.clear();
			System.out.println("All record/s is successfully deleted.");
			System.out.println("-----------------------------------------------");
			
			FileWriter fw = new FileWriter("Records.txt");
			fw.write("");
			fw.close();
			
			ReadFile();
		} else if (choice.equals("2")){
			MainMenu(EntryNum);
		} else if (choice.isEmpty() || choice.equals(" ")) {
			System.out.println("Input is required! Try again.");
			DeleteAll(EntryNum);
		} else {
//Invalid Input!
			System.out.println("Choose from 1-7. Try again.");
			DeleteAll(EntryNum);
		}
	}
	
	static void DeleteRecord(int EntryNum) throws IOException {
		System.out.println("====================RECORDS====================");
		PrintRecords(EntryNum);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the Record No. of the record you want to delete.");
		System.out.println("\t0 - Exit");

		String inputString = sc.nextLine().trim();
		if (inputString.equals("0")) {
			MainMenu(EntryNum);
		} else if (inputString.isEmpty() || inputString.equals(" ")) {
			System.out.println("Input is required!");
			DeleteRecord(EntryNum);
		} else {
			int input = Integer.parseInt(inputString);
			if (input > EntryNum) {
				System.out.println("Record not found. Try again.");
				DeleteRecord(EntryNum);
			} else if (input < 0) {
				System.out.println("-----------------------------------------------");
				System.out.println("Record No. cannot be less that 0. Try again.");
				DeleteRecord(EntryNum);
			} else {
				int DeleteRec = input - 1;
				System.out.println("-----------------------------------------------");
				System.out.println("The record to be removed is ");
				System.out.println("Record No.: " + input);
				System.out.println(LastName.get(DeleteRec) + ", "+ FirstName.get(DeleteRec) + " " + MiddleInitial.get(DeleteRec) + ".");
				System.out.println("\tPrelim: " + PrelimGrade.get(DeleteRec) + "\tMidterm: " + MidtermGrade.get(DeleteRec) + "\tFinal: " + FinalGrade.get(DeleteRec));
				double SemesterGrade = (Double.parseDouble(PrelimGrade.get(DeleteRec)) + Double.parseDouble(MidtermGrade.get(DeleteRec)) + Double.parseDouble(FinalGrade.get(DeleteRec))) / 3;
				System.out.println("\tSemester Grade: " + SemesterGrade);
				System.out.println("-----------------------------------------------");
				
				FirstName.remove(DeleteRec);
				MiddleInitial.remove(DeleteRec);
				LastName.remove(DeleteRec);
				PrelimGrade.remove(DeleteRec);
				MidtermGrade.remove(DeleteRec);
				FinalGrade.remove(DeleteRec);
							
				EntryNum--;
				FileWriter fw = new FileWriter("Records.txt");
				for (int row = 0; row < EntryNum; row++) {	
					fw.write(FirstName.get(row) + "<==>" + MiddleInitial.get(row) + "<==>" + LastName.get(row) + "<==>" + PrelimGrade.get(row) + "<==>" + MidtermGrade.get(row) 
							+ "<==>" + FinalGrade.get(row));
					fw.write("\r\n");
				}
					fw.close();

				System.out.println("Record No." + input + " is successfully deleted.");	
				System.out.println("-----------------------------------------------");

				ReadFile();

			}

		}

	}
	
	static void SearchRecord(int EntryNum) throws IOException {
		System.out.println("====================SEARCH=====================");
		System.out.println("Search Option: ");
		System.out.println("1 - Record No. ");
		System.out.println("2 - Exit");
		
		String input = sc.nextLine().trim();
		if (input.equals("1")) {
			SearchRecordNo(EntryNum);
		} else if (input.equals("2")) {
			ReadFile();
		} else {
			System.out.println("Invalid input. Try again.");
			SearchRecord(EntryNum);
		}	
	}
	
	static void SearchRecordNo(int EntryNum) throws IOException {
		System.out.println("-----------------------------------------------");
		System.out.println("Record/s found: " + EntryNum);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the Record No. you want to search?");
		System.out.println("0 - Exit");

		String inputString = sc.nextLine().trim();
		if (inputString.equals("0")) {
			ReadFile();
		} else if (inputString.isEmpty() || inputString.equals(" ")) {
			System.out.println("Input is required!");
			SearchRecordNo(EntryNum);
		} else {
			int input = Integer.parseInt(inputString);
			if (input > EntryNum) {
				System.out.println("Record not found. Try again.");
				SearchRecordNo(EntryNum);
			} else if (input < 0) {
				System.out.println("Record No. cannot be less that 0. Try again.");
				SearchRecordNo(EntryNum);
			} else {
				int SearchRec = input - 1;
				System.out.println("-----------------------------------------------");
				System.out.println("Record No.: " + input);
				System.out.println(LastName.get(SearchRec) + ", "+ FirstName.get(SearchRec) + " " + MiddleInitial.get(SearchRec) + ".");
				System.out.println("\tPrelim: " + PrelimGrade.get(SearchRec) + "\tMidterm: " + MidtermGrade.get(SearchRec) + "\tFinal: " + FinalGrade.get(SearchRec));
				double SemesterGrade = (Double.parseDouble(PrelimGrade.get(SearchRec)) + Double.parseDouble(MidtermGrade.get(SearchRec)) + Double.parseDouble(FinalGrade.get(SearchRec))) / 3;
				System.out.println("\tSemester Grade: " + SemesterGrade);
				System.out.println("-----------------------------------------------");
				
				ReadFile();
			}			
		}
	}

	
	static void EditRecord(int EntryNum) throws IOException {
		System.out.println("====================RECORDS====================");
		PrintRecords(EntryNum);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the Record No. of the record you want to edit.");
		System.out.println("\t0 - Exit");

		String inputString = sc.nextLine().trim();
		if (inputString.equals("0")) {
			MainMenu(EntryNum);
		} else if (inputString.isEmpty() || inputString.equals(" ")) {
			System.out.println("Input is required!");
			EditRecord(EntryNum);
		} else {
			int input = Integer.parseInt(inputString);
			if (input > EntryNum) {
				System.out.println("Record not found. Try again.");
				EditRecord(EntryNum);
			} else if (input < 0) {
				System.out.println("Record No. cannot be less that 0. Try again.");
				EditRecord(EntryNum);
			} else {
				int EditRec = input - 1;
				System.out.println("-----------------------------------------------");
				System.out.println("The record to be edited is: ");
				System.out.println("Record No.: " + input);
				System.out.println(LastName.get(EditRec) + ", "+ FirstName.get(EditRec) + " " + MiddleInitial.get(EditRec) + ".");
				System.out.println("\tPrelim: " + PrelimGrade.get(EditRec) + "\tMidterm: " + MidtermGrade.get(EditRec) + "\tFinal: " + FinalGrade.get(EditRec));
				double SemesterGrade = (Double.parseDouble(PrelimGrade.get(EditRec)) + Double.parseDouble(MidtermGrade.get(EditRec)) + Double.parseDouble(FinalGrade.get(EditRec))) / 3;
				System.out.println("\tSemester Grade: " + SemesterGrade);
				System.out.println("-----------------------------------------------");
				
				FirstName.remove(EditRec);
				MiddleInitial.remove(EditRec);
				LastName.remove(EditRec);
				PrelimGrade.remove(EditRec);
				MidtermGrade.remove(EditRec);
				FinalGrade.remove(EditRec);
				
				FirstName(EditRec);
				MiddleInitial(EditRec);
				LastName(EditRec);
				PrelimGrade(EditRec);
				MidtermGrade(EditRec);
				FinalGrade(EditRec);
				
				FileWriter fw = new FileWriter("Records.txt");
				for (int row = 0; row < EntryNum; row++) {	
					fw.write(FirstName.get(row) + "<==>" + MiddleInitial.get(row) + "<==>" + LastName.get(row) + "<==>" + PrelimGrade.get(row) + "<==>" + MidtermGrade.get(row) 
							+ "<==>" + FinalGrade.get(row));
					fw.write("\r\n");
				}
					fw.close();
			}
				System.out.println("Record No." + input + " edit is successful.");
				
				ReadFile();
				
			}
				
	}
	
}
