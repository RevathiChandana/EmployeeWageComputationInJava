public class EmployeeWage{
	static int totalsalary=0,WagePerHr=20,EmpPerHr=0,NumberWorkingDays=20;
	static int MaxHrsInMonth=100,totalEmpHr=0,TotalWorkingDays=0;
	static void CalculateWage(){
	while(totalEmpHr<MaxHrsInMonth && TotalWorkingDays<NumberWorkingDays){
                double EmpCheck=Math.floor(Math.random()*10)%3;
		switch((int)EmpCheck){
		case 1:	EmpPerHr=8;
			break;
		case 2:	EmpPerHr=4;
			break;
		default:EmpPerHr=0;
			break;
		}
		totalEmpHr=totalEmpHr+EmpPerHr;
		TotalWorkingDays++;
	}
	totalsalary=totalEmpHr*WagePerHr;
	}
        public static void main(String[] args){
		EmployeeWage Empobj=new EmployeeWage();
		System.out.println("welcome to employee wage computation problem on master branch");
                Empobj.CalculateWage();
		System.out.println("totalsalary: "+totalsalary);
        }
}
