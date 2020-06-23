public class EmployeeWage{
	static int totalsalary=0,WagePerHr=20,FullDayHrs=8,PartTimeHrs=4,NumberWorkingDays=20;
	static double EmpWage;
	public void CalculateWage(){
	for(int day=1;day<=NumberWorkingDays;day++){
                double EmpCheck=Math.floor(Math.random()*10)%3;
		switch((int)EmpCheck){
		case 1:	EmpWage=WagePerHr*FullDayHrs;
			break;
		case 2:	EmpWage=WagePerHr*PartTimeHrs;
			break;
		default:EmpWage=0;
			break;
		}
		totalsalary=totalsalary+(int)EmpWage;
	}
	}
        public static void main(String[] args){
		EmployeeWage Empobj=new EmployeeWage();
		System.out.println("welcome to employee wage computation problem on master branch");
                Empobj.CalculateWage();
		System.out.println("Emplayee totalsalary: "+totalsalary);
        }
}
