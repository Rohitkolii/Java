public class Main
{
	public static void main(String[] args) {
        double account_balance = 10600.00;
		Saving_Account s =new Saving_Account(account_balance);
        s.Display_Account_Detail();
        s.Account_Balance(account_balance);
	}
}


class Account{
    Account(){
        System.out.println("Welcome to Kangal Bank");
    }

    public void Display_Account_Detail(){

    }

    public void Account_Balance(double account_balance){
        System.out.println("Account Balance : "+ account_balance);
    }

}

class Saving_Account extends Account{
    Saving_Account(double account_balance){
        System.out.println("Fetched Balance : " + account_balance);
    }
    public void Display_Account_Detail(){
        System.out.println("Name : Rohit");
        System.out.println("Account No. : xxxxxxxx0225");
        System.out.println("Bank Name : Kangal Bank");
        System.out.println("IFSC Code : KB00420");
    }
}