public class EmployeeWage{
	static int WagePerHr=20,FullDayHr=8;
	static double EmpWage;
	static void CalculateWage(double EmpCheck){
		EmpWage=WagePerHr*FullDayHr*EmpCheck;
	}
        public static void main(String[] args){
		EmployeeWage Empobj=new EmployeeWage();
		System.out.println("welcome to employee wage computation problem on master branch");
                int IS_FULL_TIME=1;
                double empCheck=Math.floor(Math.random()*10)%2;
                if ( empCheck == IS_FULL_TIME )
                        System.out.println("Emloyee is present");
                else
                        System.out.println("Employee is abscent");
		Empobj.CalculateWage(empCheck);
		System.out.println("Emplayee wage: "+EmpWage);
        }
}
