package week2day1;

public class EmployeeDetails
{

	  public static void main(String[] args)
	  {
			EmployeeDetails emp=new EmployeeDetails();
			emp.printEmployeeName("Ram",100);
			emp.getEmployeeAddress("chennai");
			emp.printEmployeeSalary(100000.500);
			emp.printEmployeeMobileNumber(9345668614l);

		}
		public void printEmployeeName(String empname,int empID) 
		{
			System.out.println("Employee Name : "+empname+"\nEmployee ID : "+empID);

		}
		public void getEmployeeAddress(String empAddress) 
		{
			System.out.println("Employee Address : "+empAddress);
		}
		public void printEmployeeSalary(double empsalary)
		{
			System.out.println("Employee Salary : "+empsalary);
		}
		public void printEmployeeMobileNumber(long mobileNum) 
		{

			System.out.println("Empoyee Mobile Number : "+mobileNum);
		}
}
