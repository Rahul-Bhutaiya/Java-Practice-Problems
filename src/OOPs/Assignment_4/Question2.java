package OOPs.Assignment_4;

public class Question2 {
    public static void main(String[] args) {
        SalarySlip[][] empList={
                {
                        new SalarySlip(EmployeeId.Kamlesh, MonthName.January, 10000),
                        new SalarySlip(EmployeeId.Mahesh, MonthName.January, 20000),
                        new SalarySlip(EmployeeId.Ramesh, MonthName.January, 30000),
                        new SalarySlip(EmployeeId.Suresh, MonthName.January, 50000),
                },
                {
                        new SalarySlip(EmployeeId.Ramesh, MonthName.February, 10000),
                        new SalarySlip(EmployeeId.Suresh, MonthName.February, 10000),
                        new SalarySlip(EmployeeId.Mahesh, MonthName.February, 10000),
                        new SalarySlip(EmployeeId.Kamlesh, MonthName.February, 15000),
                },
                {
                        new SalarySlip(EmployeeId.Ramesh, MonthName.March, 34000),
                        new SalarySlip(EmployeeId.Suresh, MonthName.March, 20000),
                        new SalarySlip(EmployeeId.Mahesh, MonthName.March, 40000),
                        new SalarySlip(EmployeeId.Kamlesh, MonthName.March, 10000),
                },
                {
                        new SalarySlip(EmployeeId.Ramesh, MonthName.April, 10000),
                        new SalarySlip(EmployeeId.Suresh, MonthName.April, 30000),
                        new SalarySlip(EmployeeId.Mahesh, MonthName.April, 50000),
                        new SalarySlip(EmployeeId.Kamlesh, MonthName.April, 20000),
                }
        };
        SalarySlip.getTopEmployee(empList);
    }
}

enum EmployeeId{
    Ramesh(1001),Suresh(1002),Mahesh(1003),Kamlesh(1004);

    private int empId;

    private EmployeeId(int empId){
        this.empId=empId;
    }

    public int getEmpId(){
        return this.empId;
    }
}

enum MonthName{
    January(1),February(2),March(3),April(4);

    private int monthNumber;

    private MonthName(int monthNumber){
        this.monthNumber=monthNumber;
    }

    public int getMonthNumber(){
        return this.monthNumber;
    }
}

class SalarySlip{
    private int empId;
    private EmployeeId empName;
    private int salary;
    private int month;

    SalarySlip(EmployeeId empName,MonthName month,int salary){
        this.empId=empName.getEmpId();
        this.empName=empName;
        this.salary=salary;
        this.month=month.getMonthNumber();
    }

    public int getSalary(){
        return this.salary;
    }
    public int getEmpId(){
        return this.empId;
    }

    public static void getTopEmployee(SalarySlip[][] salarySlips){
        for(int i=0;i< salarySlips.length;i++){
            int max1=0,max2=0,empId1=0,empId2=0;
            for(SalarySlip eachEmp:salarySlips[i]){
                if(eachEmp.salary>max1){
                    max2=max1;
                    max1= eachEmp.salary;
                    empId2=empId1;
                    empId1=eachEmp.empId;
                }
                else if(eachEmp.salary>max2 && eachEmp.salary<=max1){
                    max2= eachEmp.salary;
                    empId2= eachEmp.empId;
                }
            }
            System.out.println((i+1)+"->"+empId1+","+empId2);
        }
    }
}