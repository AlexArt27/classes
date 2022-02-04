package DummyCode;

class Bank{
    String branch;
    int balance;
    String accNum;
    String accName;

    public void displyCust(){
        System.out.println(branch);
        System.out.println(balance);
        System.out.println(accNum);
        System.out.println(accName);

    }

    Bank(String accNameUser, int balanceUser){
        accName = accNameUser;
        balance = balanceUser;
    }

}

public class testCode {

    public static void main(String[] args) {

        Bank acc1 = new Bank("devx", 1000);
        Bank acc2 = new Bank("Alex", 3000);
        Bank acc3 = new Bank("Lesia", 5000);

        acc3.displyCust();

    }


}
