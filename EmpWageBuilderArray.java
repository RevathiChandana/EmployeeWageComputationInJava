import java.util.*;
public class EmpWageBuilderArray implements IEmployeeWage
{
        public static final int IsPartTime=1;
        public static final int IsFullTime=2;

        public int numOfCompany=0;
        public ArrayList<EmployeeWage> EmployeeWageArrayList;
	//public Map<String,EmployeeWage> companyToEmpWageMap;
        public EmpWageBuilderArray(){
                EmployeeWageArrayList=new ArrayList<EmployeeWage>();
        }

        public void addCompanyEmpWage(String company,int EmpRatePerHour,int NumOfWorkingDays,int MaxHoursPerMonth){
                EmployeeWage employeeWage=new EmployeeWage(company,EmpRatePerHour,NumOfWorkingDays,MaxHoursPerMonth);
                EmployeeWageArrayList.add(employeeWage);
        }

        public void calculateEmpWage(){
                for(int i=0;i<EmployeeWageArrayList.size();i++){
			EmployeeWage employeeWage=EmployeeWageArrayList.get(i);
                        employeeWage.setTotalEmpWage(this.calculateEmpWage(employeeWage));
                        System.out.println(employeeWage);
                }
        }
        public int calculateEmpWage(EmployeeWage employeeWage){
                int EmpWorkHr=0,totalEmpHr=0,TotalWorkingDays=0,totalsalary=0;
                while(totalEmpHr<=employeeWage.MaxHoursPerMonth && TotalWorkingDays<employeeWage.NumOfWorkingDays){
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
                System.out.println("Days: "+TotalWorkingDays+" Employee hours : "+totalEmpHr);
                return totalEmpHr*employeeWage.EmpRatePerHour;
        }
        public static void main(String[] args){
                IEmployeeWage empWageBuilder=new EmpWageBuilderArray();
                empWageBuilder.addCompanyEmpWage("Dmart",20,25,100);
                empWageBuilder.addCompanyEmpWage("Reliance",10,21,200);
                empWageBuilder.calculateEmpWage();
        }
}
