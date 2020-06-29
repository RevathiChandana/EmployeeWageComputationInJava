public interface IEmployeeWage{
	public void addCompanyEmpWage(String company,int EmpRatePerHour,int NumOfWorkingDays,int MaxHoursPerMonth);
	public void calculateEmpWage();
	public int getTotalWage(String company);
}
