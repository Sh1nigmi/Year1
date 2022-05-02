package javaapplication1;
import java.util.Scanner;

public class FinalOutput2 {
	static Scanner sc = new Scanner(System.in);
	static String[][] names = new String[500][500];
	static double[][] grades = new double[500][500];

	public static void main(String[] args) {
	int addrow = 0;
	Choices(addrow++);
	}
	
	static void Choices(int addrow) {
		System.out.println("============SELECT FROM THE CHOICES============");
		System.out.println("1 - Add Record");
		System.out.println("2 - View Records");
		System.out.println("3 - Exit");
		String choice = sc.nextLine().trim();
		if (choice.equals("1")) {
//Add Record
			AddRecord(addrow++);
		} else if (choice.equals("2")) {
//View Record
			ViewRecord(addrow);
		} else if (choice.equals("3")) {
//Exit
			System.out.println("Thank you!");
		} else if (choice.isEmpty() || choice.equals(" ")) {
			System.out.println("Input is required!");
			Choices(addrow);
		} else {
//Invalid Input!
			System.out.println("Invalid input!");
			System.out.println();
			Choices(addrow);
		}
	}
	
	static void AddRecord(int addrow) {
			System.out.println("==================ADD RECORD===================");
			System.out.println("---------------------NAME----------------------");
//First Name
			FirstName(addrow);
//Middle Initial
			MiddleInitial(addrow);
//LastName
			LastName(addrow);
			
			System.out.println("--------------------PRELIM---------------------");
//Attendance Grade - Prelim
			PrelimAttendanceGrade(addrow);
//Class Participation Grade - Prelim
			PrelimClassParticipationGrade(addrow);
//Quiz Grade - Prelim
			PrelimQuizGrade(addrow);
//Exam Grade - Prelim
			PrelimExamGrade(addrow);
			
			System.out.println("--------------------MIDTERM--------------------");
//Attendance Grade - Midterm
			MidtermAttendanceGrade(addrow);
//Class Participation Grade - Midterm
			MidtermClassParticipationGrade(addrow);
//Quiz Grade - Midterm
			MidtermQuizGrade(addrow);
//Exam Grade - Midterm
			MidtermExamGrade(addrow);
	
			System.out.println("--------------------FINAL----------------------");
//Attendance Grade - Final
			FinalAttendanceGrade(addrow);
//Class Participation Grade - Final
			FinalClassParticipationGrade(addrow);
//Quiz Grade - Final
			FinalQuizGrade(addrow);
//Exam Grade - Final
			FinalExamGrade(addrow);
			System.out.println("Record successfully saved.");
			addrow++;
			System.out.println();
			Choices(addrow);
		}			
			
	static void ViewRecord(int addrow) {
		System.out.println("====================RECORDS====================");
//Display Record
		PrintRecords(addrow);
		System.out.println();
		Choices(addrow);
	}
	
	static void FirstName (int addrow) {
		System.out.println("First Name:");
//First Name
			String FN = sc.nextLine().trim();
				if (FN.isEmpty() || FN.equals(" ")) {
					System.out.println("Input is required!");
					FirstName(addrow);
				} else {
					names[addrow][0] = FN;
					}
	} 
	static void MiddleInitial (int addrow) {
		System.out.println("Middle Initial:");
//Middle Initial
			String MI = sc.nextLine().trim();
				if (MI.isEmpty() || MI.equals(" ")) {
					System.out.println("Input is required!");
					MiddleInitial(addrow);
				} else {
					names[addrow][1] = MI;
					}
	} 
	static void LastName (int addrow) {
		System.out.println("Last Name:");                
//Last Name
			String LN = sc.nextLine().trim();
				if (LN.isEmpty() || LN.equals(" ")) {
					System.out.println("Input is required!");
					LastName(addrow);
				} else {
					names[addrow][2] = LN;
				}
	}
	static void PrintRecords (int addrow) {
		for (int row = 0; row < addrow; row++) {
			System.out.println(names[row][2] + ", "+ names[row][0] + " " +names[row][1] + ".");
	
			double PrelimAGpercentage = grades[row][0] * 0.05;
			double PrelimCPGpercentage = grades[row][1] * 0.15;
			double PrelimQGpercentage = grades[row][2] * 0.30;
			double PrelimEGpercentage = grades[row][3] * 0.50;
			double PrelimGrade = PrelimAGpercentage + PrelimCPGpercentage + PrelimQGpercentage + PrelimEGpercentage;
			System.out.println("\tPrelim Grade: " + PrelimGrade);
			System.out.println("\t\tAtt.: " + grades[row][0] + ", \tCP: " + grades[row][1] + ", \tQuiz: " + grades[row][2] + ","
								+ " \t Exam: " + grades[row][3]);
			
			double MidtermAGpercentage = grades[row][4] * 0.05;
			double MidtermCPGpercentage = grades[row][5] * 0.15;
			double MidtermQGpercentage = grades[row][6] * 0.30;
			double MidtermEGpercentage = grades[row][7] * 0.50;
			double MidtermGrade = MidtermAGpercentage + MidtermCPGpercentage + MidtermQGpercentage + MidtermEGpercentage;
			System.out.println("\tMidterm Grade: " + MidtermGrade);
			System.out.println("\t\tAtt.: " + grades[row][4] + ", \tCP: " + grades[row][5] + ", \tQuiz: " + grades[row][6] + ","
								+ " \t Exam: " + grades[row][7]);
			
			double FinalAGpercentage = grades[row][8] * 0.05;
			double FinalCPGpercentage = grades[row][9] * 0.15;
			double FinalQGpercentage = grades[row][10] * 0.30;
			double FinalEGpercentage = grades[row][11] * 0.50;
			double FinalGrade = FinalAGpercentage + FinalCPGpercentage + FinalQGpercentage + FinalEGpercentage;
			System.out.println("\tFinal Grade: " + PrelimGrade);
			System.out.println("\t\tAtt.: " + grades[row][8] + ", \tCP: " + grades[row][9] + ", \tQuiz: " + grades[row][10] + ","
								+ " \t Exam: " + grades[row][11]);
			double SemesterGrade = (PrelimGrade * 0.25) + (MidtermGrade * 0.25) + (FinalGrade * 0.50);
			if (SemesterGrade > 95) {
				String SemesterGradeLetter = "A";
				String SemesterStatus = "PASSED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			} else if (SemesterGrade > 90) {
				String SemesterGradeLetter = "B";
				String SemesterStatus = "PASSED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			} else if (SemesterGrade > 85) {
				String SemesterGradeLetter = "C";
				String SemesterStatus = "PASSED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			} else if (SemesterGrade > 80) {
				String SemesterGradeLetter = "D";
				String SemesterStatus = "PASSED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			} else if (SemesterGrade > 75) {
				String SemesterGradeLetter = "E";
				String SemesterStatus = "PASSED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			} else if (SemesterGrade > 60) {
				String SemesterGradeLetter = "F";
				String SemesterStatus = "FAILED";
				System.out.println("\tSemesterGrade: " + SemesterGrade + "(" + SemesterGradeLetter + ") - " + SemesterStatus);
			}	
		}
		System.out.println("Record/s Found: " + addrow);
	}
	
	static void PrelimAttendanceGrade (int addrow) {
		System.out.println("Attendance Grade:");
		//Attendance Grade - Prelim
			double PrelimAGdouble = 0;
			String PrelimAGstring = sc.nextLine().trim();
				if (PrelimAGstring.isEmpty() || PrelimAGstring.equals(" ")) {
					System.out.println("Input is required!");
					PrelimAttendanceGrade(addrow);
				} else if (PrelimAGstring.matches("-?\\d+(\\.\\d+)?")) {
					PrelimAGdouble = Double.parseDouble(PrelimAGstring);
						if (PrelimAGdouble > 100) {
							System.out.println("Invalid grade!");
							PrelimAttendanceGrade(addrow);
						} else if (PrelimAGdouble < 60) {
							System.out.println("Invalid grade!");
							PrelimAttendanceGrade(addrow);
						} else {
							grades [addrow][0] = PrelimAGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					PrelimAttendanceGrade(addrow);
				}
	}
	static void PrelimClassParticipationGrade (int addrow) {
		System.out.println("Class Participation Grade:");
		//Class Participation Grade - Prelim
			double PrelimCPGdouble = 0;
			String PrelimCPGstring = sc.nextLine().trim();
				if (PrelimCPGstring.isEmpty() || PrelimCPGstring.equals(" ")) {
					System.out.println("Input is required!");
					PrelimClassParticipationGrade(addrow);
				} else if (PrelimCPGstring.matches("-?\\d+(\\.\\d+)?")) {
					PrelimCPGdouble = Double.parseDouble(PrelimCPGstring);
						if (PrelimCPGdouble > 100) {
							System.out.println("Invalid grade!");
							PrelimClassParticipationGrade(addrow);
						} else if (PrelimCPGdouble < 60) {
							System.out.println("Invalid grade!");
							PrelimClassParticipationGrade(addrow);
						} else {
							grades [addrow][1] = PrelimCPGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					PrelimClassParticipationGrade(addrow);
				}
	}
	static void PrelimQuizGrade (int addrow) {
		System.out.println("Quiz Grade:");
		//Quiz Grade - Prelim
			double PrelimQGdouble = 0;
			String PrelimQGstring = sc.nextLine().trim();
				if (PrelimQGstring.isEmpty() || PrelimQGstring.equals(" ")) {
					System.out.println("Input is required!");
					PrelimQuizGrade(addrow);
				} else if (PrelimQGstring.matches("-?\\d+(\\.\\d+)?")) {
					PrelimQGdouble = Double.parseDouble(PrelimQGstring);
						if (PrelimQGdouble > 100) {
							System.out.println("Invalid grade!");
							PrelimQuizGrade(addrow);
						} else if (PrelimQGdouble < 60) {
							System.out.println("Invalid grade!");
							PrelimQuizGrade(addrow);
						} else {
							grades [addrow][2] = PrelimQGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					PrelimQuizGrade(addrow);
				}
	}
	static void PrelimExamGrade (int addrow) {
		System.out.println("Exam Grade:");
		//Exam Grade - Prelim
			double PrelimEGdouble = 0;
			String PrelimEGstring = sc.nextLine().trim();
				if (PrelimEGstring.isEmpty() || PrelimEGstring.equals(" ")) {
					System.out.println("Input is required!");
					PrelimExamGrade(addrow);
				} else if (PrelimEGstring.matches("-?\\d+(\\.\\d+)?")) {
					PrelimEGdouble = Double.parseDouble(PrelimEGstring);
						if (PrelimEGdouble > 100) {
							System.out.println("Invalid grade!");
							PrelimExamGrade(addrow);
						} else if (PrelimEGdouble < 60) {
							System.out.println("Invalid grade!");
							PrelimExamGrade(addrow);
						} else {
							grades [addrow][3] = PrelimEGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					PrelimExamGrade(addrow);
				}
	}
	
	static void MidtermAttendanceGrade (int addrow) {
		System.out.println("Attendance Grade:");
		//Attendance Grade - Midterm
			double MidtermAGdouble = 0;
			String MidtermAGstring = sc.nextLine().trim();
				if (MidtermAGstring.isEmpty() || MidtermAGstring.equals(" ")) {
					System.out.println("Input is required!");
					MidtermAttendanceGrade(addrow);
				} else if (MidtermAGstring.matches("-?\\d+(\\.\\d+)?")) {
					MidtermAGdouble = Double.parseDouble(MidtermAGstring);
						if (MidtermAGdouble > 100) {
							System.out.println("Invalid grade!");
							MidtermAttendanceGrade(addrow);
						} else if (MidtermAGdouble < 60) {
							System.out.println("Invalid grade!");
							MidtermAttendanceGrade(addrow);
						} else {
							grades [addrow][4] = MidtermAGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					MidtermAttendanceGrade(addrow);
				}
	}
	static void MidtermClassParticipationGrade (int addrow) {
		System.out.println("Class Participation Grade:");
		//Class Participation Grade - Midterm
			double MidtermCPGdouble = 0;
			String MidtermCPGstring = sc.nextLine().trim();
				if (MidtermCPGstring.isEmpty() || MidtermCPGstring.equals(" ")) {
					System.out.println("Input is required!");
					MidtermClassParticipationGrade(addrow);
				} else if (MidtermCPGstring.matches("-?\\d+(\\.\\d+)?")) {
					MidtermCPGdouble = Double.parseDouble(MidtermCPGstring);
						if (MidtermCPGdouble > 100) {
							System.out.println("Invalid grade!");
							MidtermClassParticipationGrade(addrow);
						} else if (MidtermCPGdouble < 60) {
							System.out.println("Invalid grade!");
							MidtermClassParticipationGrade(addrow);
						} else {
							grades [addrow][5] = MidtermCPGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					MidtermClassParticipationGrade(addrow);
				}
	}
	static void MidtermQuizGrade (int addrow) {
		System.out.println("Quiz Grade:");
		//Quiz Grade - Midterm
			double MidtermQGdouble = 0;
			String MidtermQGstring = sc.nextLine().trim();
				if (MidtermQGstring.isEmpty() || MidtermQGstring.equals(" ")) {
					System.out.println("Input is required!");
					MidtermQuizGrade(addrow);
				} else if (MidtermQGstring.matches("-?\\d+(\\.\\d+)?")) {
					MidtermQGdouble = Double.parseDouble(MidtermQGstring);
						if (MidtermQGdouble > 100) {
							System.out.println("Invalid grade!");
							MidtermQuizGrade(addrow);
						} else if (MidtermQGdouble < 60) {
							System.out.println("Invalid grade!");
							MidtermQuizGrade(addrow);
						} else {
							grades [addrow][6] = MidtermQGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					MidtermQuizGrade(addrow);
				}
	}
	static void MidtermExamGrade (int addrow) {
		System.out.println("Exam Grade:");
		//Exam Grade - Midterm
			double MidtermEGdouble = 0;
			String MidtermEGstring = sc.nextLine().trim();
				if (MidtermEGstring.isEmpty() || MidtermEGstring.equals(" ")) {
					System.out.println("Input is required!");
					MidtermExamGrade(addrow);
				} else if (MidtermEGstring.matches("-?\\d+(\\.\\d+)?")) {
					MidtermEGdouble = Double.parseDouble(MidtermEGstring);
						if (MidtermEGdouble > 100) {
							System.out.println("Invalid grade!");
							MidtermExamGrade(addrow);
						} else if (MidtermEGdouble < 60) {
							System.out.println("Invalid grade!");
							MidtermExamGrade(addrow);
						} else {
							grades [addrow][7] = MidtermEGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					MidtermExamGrade(addrow);
				}
	}
	
	static void FinalAttendanceGrade (int addrow) {
		System.out.println("Attendance Grade:");
		//Attendance Grade - Final
			double FinalAGdouble = 0;
			String FinalAGstring = sc.nextLine().trim();
				if (FinalAGstring.isEmpty() || FinalAGstring.equals(" ")) {
					System.out.println("Input is required!");
					FinalAttendanceGrade(addrow);
				} else if (FinalAGstring.matches("-?\\d+(\\.\\d+)?")) {
					FinalAGdouble = Double.parseDouble(FinalAGstring);
						if (FinalAGdouble > 100) {
							System.out.println("Invalid grade!");
							FinalAttendanceGrade(addrow);
						} else if (FinalAGdouble < 60) {
							System.out.println("Invalid grade!");
							FinalAttendanceGrade(addrow);
						} else {
							grades [addrow][8] = FinalAGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					FinalAttendanceGrade(addrow);
				}
	}
	static void FinalClassParticipationGrade (int addrow) {
		System.out.println("Class Participation Grade:");
		//Class Participation Grade - Final
			double FinalCPGdouble = 0;
			String FinalCPGstring = sc.nextLine().trim();
				if (FinalCPGstring.isEmpty() || FinalCPGstring.equals(" ")) {
					System.out.println("Input is required!");
					FinalClassParticipationGrade(addrow);
				} else if (FinalCPGstring.matches("-?\\d+(\\.\\d+)?")) {
					FinalCPGdouble = Double.parseDouble(FinalCPGstring);
						if (FinalCPGdouble > 100) {
							System.out.println("Invalid grade!");
							FinalClassParticipationGrade(addrow);
						} else if (FinalCPGdouble < 60) {
							System.out.println("Invalid grade!");
							FinalClassParticipationGrade(addrow);
						} else {
							grades [addrow][9] = FinalCPGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					FinalClassParticipationGrade(addrow);
				}
	}
	static void FinalQuizGrade (int addrow) {
		System.out.println("Quiz Grade:");
		//Quiz Grade - Final
			double FinalQGdouble = 0;
			String FinalQGstring = sc.nextLine().trim();
				if (FinalQGstring.isEmpty() || FinalQGstring.equals(" ")) {
					System.out.println("Input is required!");
					FinalQuizGrade(addrow);
				} else if (FinalQGstring.matches("-?\\d+(\\.\\d+)?")) {
					FinalQGdouble = Double.parseDouble(FinalQGstring);
						if (FinalQGdouble > 100) {
							System.out.println("Invalid grade!");
							FinalQuizGrade(addrow);
						} else if (FinalQGdouble < 60) {
							System.out.println("Invalid grade!");
							FinalQuizGrade(addrow);
						} else {
							grades [addrow][10] = FinalQGdouble;
						}
				} else {
					System.out.println("Invalid input!");
					FinalQuizGrade(addrow);
				}
	}
	static void FinalExamGrade (int addrow) {
		System.out.println("Exam Grade:");
		//Exam Grade - Final
		double FinalEGdouble = 0;
		String FinalEGstring = sc.nextLine().trim();
			if (FinalEGstring.isEmpty() || FinalEGstring.equals(" ")) {
				System.out.println("Input is required!");
				FinalExamGrade(addrow);
			} else if (FinalEGstring.matches("-?\\d+(\\.\\d+)?")) {
				FinalEGdouble = Double.parseDouble(FinalEGstring);
					if (FinalEGdouble > 100) {
						System.out.println("Invalid grade!");
						FinalExamGrade(addrow);
					} else if (FinalEGdouble < 60) {
						System.out.println("Invalid grade!");
						FinalExamGrade(addrow);
					} else {
						grades [addrow][11] = FinalEGdouble;
					}
			} else {
				System.out.println("Invalid input!");
				FinalExamGrade(addrow);
			}
	}
}