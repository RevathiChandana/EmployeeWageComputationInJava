public class EmpWageBuilderArray
{
        public static final int IsPartTime=1;
        public static final int IsFullTime=2;

        public int numOfCompany=0;
        public EmployeeWage[] EmployeeWageArray;

        public EmpWageBuilderArray(){
                EmployeeWageArray=new EmployeeWage[5];
        }

        public void addCompanyEmpWage(String company,int EmpRatePerHour,int NumOfWorkingDays,int MaxHoursPerMonth){
                EmployeeWageArray[numOfCompany]=new EmployeeWage(company,EmpRatePerHour,NumOfWorkingDays,MaxHoursPerMonth);
                numOfCompany++;
        }

        public void calculateEmpWage(){
                for(int i=0;i<numOfCompany;i++){
                        EmployeeWageArray[i].setTotalEmpWage(this.calculateEmpWage(EmployeeWageArray[i]));
                        System.out.println(EmployeeWageArray[i]);
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
                EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
                empWageBuilder.addCompanyEmpWage("Dmart",20,25,100);
                empWageBuilder.addCompanyEmpWage("Reliance",10,21,200);
                empWageBuilder.calculateEmpWage();
        }
}
