package day02_practice_tasks;

import java.sql.SQLOutput;

public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Josh Steven",
                schoolName = "MIT",
                gradeLevel = "UnderGraduate",
                studentsId = "A01",
                gender = "Male";

        int age = 24;
        double gpa = 2.8;

        System.out.println("The Student's Name is " + ": " + studentName);
        System.out.println("Gender is " + ": " + gender);
        System.out.println("Age is " + ": " + age + " years old");
        System.out.println("The school's Name is " + ": " + schoolName);
        System.out.println("Grade Level is " + ": " + gradeLevel);
        System.out.println( studentName + "'s gpa is " + ":" + gpa);
        System.out.println("StudentID " + ": " + studentsId);


    }




}


/*3. Create a class named StudentInfo and write a program with the following requirements:

	Declare the following variables with appropriate data types:
			studentName
			age
			gender
			schoolName
			studentId
			gradeLevel
			gpa

	Display the full student information in the following format:

			Example:
				studentName = "Josh Steven";
				age = 22;
				gender = "Male";
				gpa = 2.8;
				schoolName = "MIT";
				gradeLevel = "Undergraduate";
				studentId = "A125";

			Output:
				The student's name is Josh Steven
				Gender is Male
				Age is 22 years old
				The school's name is MIT
				Grade level is Undergraduate
				Josh Steven's GPA is 2.8
*/