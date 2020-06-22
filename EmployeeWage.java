public class EmployeeWage{
	static int WagePerHr=20,FullDayHrs=8,PartTimeHrs=4;
	static double EmpWage;
	static void CalculateWage(double EmpCheck){
		switch((int)EmpCheck){
		case 1:	System.out.println("Employee is present and work full day");
			EmpWage=WagePerHr*FullDayHrs;
			break;
		case 2:	System.out.println("Emloyee is abscent and work part time");
			EmpWage=WagePerHr*PartTimeHrs;
			break;
		default:System.out.println("employee is abscent");
			EmpWage=0;
			break;
		}
	}
        public static void main(String[] args){
		EmployeeWage Empobj=new EmployeeWage();
		System.out.println("welcome to employee wage computation problem on master branch");
                double empCheck=Math.floor(Math.random()*10)%3;
                Empobj.CalculateWage(empCheck);
		System.out.println("Emplayee wage: "+EmpWage);
        }
}
