public class EmployeeWage{
  public static final int IsPartTime=1;
	public static final int IsFullTime=2;

	private final String company;
	private final int EmpRatePerHour;
	private final int NumOfWorkingHours;
	private final int MaxHoursPerMonth;

	public EmployeeWage(String company,int EmpRatePerHour,int NumOfWorkingHours,int MaxHoursPerMonth){
		this.company=company;
		this.EmpRatePerHour=EmpRatePerHour;
		this.NumOfWorkingHours=NumOfWorkingHours;
		this.MaxHoursPerMonth=MaxHoursPerMonth;
	}
	public int calculateEmpWage(){
		int EmpWorkHr=0,totalEmpHr=0,TotalWorkingDays=0,totalsalary=0;
		while(totalEmpHr<MaxHoursPerMonth && TotalWorkingDays<MaxHoursPerMonth){
                	double EmpCheck=Math.floor(Math.random()*10)%3;
			switch((int)EmpCheck){
				case IsPartTime: EmpWorkHr=4;
						 break;
				case IsFullTime: EmpWorkHr=8;
						 break;
				default: EmpWorkHr=0;
					 break;
			}
		totalEmpHr=totalEmpHr+EmpWorkHr;
		TotalWorkingDays++;
		}
		return totalEmpHr*EmpRatePerHour;
	}
        public static void main(String[] args){
		EmployeeWage tcsobj=new EmployeeWage("TCS",30,21,100);
		EmployeeWage bridgeobj=new EmployeeWage("bridgeLabz",40,20,100);
		System.out.println("welcome to employee wage computation problem on master branch");
                System.out.println("Total employee wage for company "+tcsobj.company+" is : "+tcsobj.calculateEmpWage());
		System.out.println("Total employee wage for company "+bridgeobj.company+" is : " +bridgeobj.calculateEmpWage());
        }
}
