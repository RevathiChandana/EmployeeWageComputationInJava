public class EmployeeWage{

	public final String company;
	public final int EmpRatePerHour;
	public final int NumOfWorkingDays;
	public final int MaxHoursPerMonth;
	public int totalEmpWage;

	public EmployeeWage(String company,int EmpRatePerHour,int NumOfWorkingDays,int MaxHoursPerMonth){
		this.company=company;
		this.EmpRatePerHour=EmpRatePerHour;
		this.NumOfWorkingDays=NumOfWorkingDays;
		this.MaxHoursPerMonth=MaxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage=totalEmpWage;
	}

	public String toString(){
		return "Total employee wage for company: " +company+" is : "+totalEmpWage;
	}
}

