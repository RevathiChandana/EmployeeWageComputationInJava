public class EmployeeWage{
	static int WagePerHr=20,FullDayHrs=8,PartTimeHrs=4;
	static double EmpWage;
	public void CalculateWage(double EmpCheck,int FullTime,int PartTime){
		if(EmpCheck==FullTime){
			System.out.println("Employee is present and work full day");
			EmpWage=WagePerHr*FullDayHrs;
		}
		else if(EmpCheck==PartTime){
			System.out.println("Emloyee is abscent and work part time");
			EmpWage=WagePerHr*PartTimeHrs;
		}
		else{
			System.out.println("employee is abscent");
			EmpWage=0;
		}
	}
        public static void main(String[] args){
		EmployeeWage Empobj=new EmployeeWage();
		System.out.println("welcome to employee wage computation problem on master branch");
                int FullTime=2;
		int PartTime=1;
                double empCheck=Math.floor(Math.random()*10)%3;
                Empobj.CalculateWage(empCheck,FullTime,PartTime);
		System.out.println("Emplayee wage: "+EmpWage);
        }
}
