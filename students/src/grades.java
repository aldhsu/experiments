class grades {
	public static void main (String[] args) {
		int[][] studno_Grades = {{80,70,90},{100,50,75},{45,65,75}};
		String[] names = {"Dom Mazetti","Dick Wang","Steve Holt"};
		String report = "";
		int total_of_all = 0;
		int count = 0;
		int total = 0;
		for (int i = 0; i < studno_Grades.length; i++) {
			report += names[i];
			report += ": ";
			for (int j = 0; j <studno_Grades[i].length; j++) {
				report +=  studno_Grades[i][j];
				total += studno_Grades[i][j];
				total_of_all += studno_Grades[i][j];
				count += 1;
				report += " ";
			}
			
			report += "Average: ";
			report += total/studno_Grades[i].length;
			System.out.println(report);
			report = "";
			total = 0;	
		}
		System.out.println("Total average across all tests: " + total_of_all/count);
	}
}