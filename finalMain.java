package final_homework;

import java.util.Scanner;

public class finalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of students : ");
		int numberOfStudents=sc.nextInt();
		
		int[] array_1 = new int[numberOfStudents]; 
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Please enter the student nots : ");
			array_1[i]=sc.nextInt();
		}
		
		char[] array_2 = new char[numberOfStudents];
		float avarage_grade=0;
		char[] gradeLetter= {'A','B','C','D','E','F',};
		int[] gradeLetterCount= {0,0,0,0,0,0,};
		for(int k =0;k<numberOfStudents;k++) {
			if(array_1[k]>=90) {
				array_2[k]='A';	
				gradeLetterCount[0]+=1;
			}
			else if(array_1[k]>=80) {
				array_2[k]='B';
				gradeLetterCount[1]+=1;
			}
			else if(array_1[k]>=70) {
				array_2[k]='C';
				gradeLetterCount[2]+=1;
			}
			else if(array_1[k]>=60) {
				array_2[k]='D';
				gradeLetterCount[3]+=1;
			}
			else if(array_2[k]>=50) {
				array_2[k]='E';
				gradeLetterCount[4]+=1;
			}
			else  {
				array_2[k]='F';
				gradeLetterCount[5]+=1;
			}
			avarage_grade += array_1[k];
		}	
		avarage_grade= avarage_grade/numberOfStudents;
		System.out.println("Avarage Grade : "+avarage_grade);
		
		
		for(int k=0;k<gradeLetter.length;k++) {
			if(gradeLetterCount[k]>0) {
				System.out.println("There are "+gradeLetterCount[k]+" students who got a grade "+gradeLetter[k]);
			}
			else {
				System.out.println("None of the students has grade "+ gradeLetter[k]);
			}
		}
			 
		
	}

}
