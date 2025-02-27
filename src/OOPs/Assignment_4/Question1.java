package OOPs.Assignment_4;

public class Question1 {
    public static void main(String[] args) {

        Employee[] employeeList={
            new Employee(11,"Ramesh",JobTitle.Peon,10000),
            new Employee(12,"Suresh",JobTitle.Peon,10000),
            new Employee(13,"Mahesh",JobTitle.Peon,20000),
            new Employee(14,"Kamlesh",JobTitle.Peon,12000),

            new Employee(15,"Kohli",JobTitle.Prof,50000),
            new Employee(16,"Dhoni",JobTitle.Prof,100000),
            new Employee(17,"Raina",JobTitle.Prof,45000),

            new Employee(18,"Gambhir",JobTitle.HOD,150000),
            new Employee(19,"Gavaskar",JobTitle.HOD,200000),

            new Employee(20,"Sachin",JobTitle.Principal,1000000)
        };

        Employee.displayTitleWiseSalary(employeeList);

    }
}

class Employee{
    private int empId;
    private String name;
    private JobTitle jobType;
    private int salary;

    Employee(int empId, String name, JobTitle jobType,int salary){
        this.empId=empId;
        this.name=name;
        this.jobType=jobType;
        this.salary=salary;
    }

    public static void displayTitleWiseSalary(Employee[] empList){
        int profTotal=0,hodTotal=0,peonTotal=0,principalTotal=0;

        for(Employee eachEmp:empList){
            JobTitle empType=eachEmp.jobType;

            switch (empType){
                case HOD :
                    hodTotal+= eachEmp.salary;
                    break;
                case Peon:
                    peonTotal+= eachEmp.salary;
                    break;
                case Prof:
                    profTotal+= eachEmp.salary;
                    break;
                default:
                    principalTotal+= eachEmp.salary;
            }
        }

        System.out.println(JobTitle.Principal + " : " + principalTotal);
        System.out.println(JobTitle.HOD + " : " + hodTotal);
        System.out.println(JobTitle.Prof + " : " + profTotal);
        System.out.println(JobTitle.Peon + " : " + peonTotal);

    }
}

enum JobTitle{
    Peon,Prof,HOD,Principal
}
