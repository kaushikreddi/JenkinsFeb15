package JenkinsJobFeb15.HelloJenkins;

public class JenkinsClass {
 static int empID;
 static int age;
 static double salary;
 static double vpay;
 
	public static void main(String[] args)
	{
		JenkinsClass s1= new JenkinsClass();
		JenkinsClass.empID=1002;
		s1.age=32;
		s1.salary=1234.25;
		s1.vpay=123.21;
		System.out.println("Employee ID is"+ empID);
		System.out.println("Employee Age is"+ age);
		System.out.println("Employee Salary is"+ salary);
		System.out.println("Employee Variable Pay is"+ vpay);
		System.out.println("Hello All");
		
	}
	
}
