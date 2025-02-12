package OOPs.Assignment_1;

public class Question2 {
    public static void main(String[] args) {
        Account cust1=new Account(989898989898989898L,"Sahil",1000,10);
        cust1.calculateInterest();
        cust1.displayAccountDetails();
    }
}

class Account{
    private long accountNumber;
    private String custName;
    private float balance;
    private float interestRate;

    Account(long accountNumber,String custName,float balance,float interestRate){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public void calculateInterest(){
        this.balance+=(this.balance*this.interestRate)/100;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Customer Name : "+this.custName);
        System.out.println("Balance : "+this.balance);
        System.out.println("Interest Rate : "+this.interestRate);
    }
}
