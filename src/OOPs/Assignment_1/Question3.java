package OOPs.Assignment_1;

public class Question3 {
    public static void main(String[] args) {
        AccountQ3 cust1= new AccountQ3();
        cust1.setAccountDetails(98989898989898989L,"Mayank",500);

        cust1.withdraw(100);
        cust1.deposit(400);
        cust1.dispAccountDetails();
    }
}

class AccountQ3{
    private long accountNo;
    private String custName;
    private float accountBalance;

    public void setAccountDetails(long accountNo,String custName,float accountBalance){
        this.accountNo=accountNo;
        this.custName=custName;
        this.accountBalance=accountBalance;
        System.out.println("Account Added Successfully");
    }

    public void withdraw(float withDrawAmount){
        if(withDrawAmount>0){
            if(withDrawAmount>this.accountBalance){
                System.out.println("Insufficient Balance");
                return;
            }
            this.accountBalance-=withDrawAmount;
            System.out.println("WithDrawn Successfully");
            System.out.println("Available Balance : "+this.accountBalance);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public void deposit(float depositAmount){
        if(depositAmount>0){
            this.accountBalance+=depositAmount;
            System.out.println("Amount Added Successfully");
            System.out.println("Available Balance : "+this.accountBalance);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public void dispAccountDetails(){
        System.out.println("Account No. : "+this.accountNo);
        System.out.println("Customer Name : "+this.custName);
        System.out.println("Balance : "+this.accountBalance);
    }
}
