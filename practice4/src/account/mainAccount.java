package account;

public class mainAccount {
    public static void main(String[] args) {

        Account1 a1 = new Account1(Account1.Checking, 1000);

        Account1 a2 = new Account1(Account1.Saving, 2000);
        System.out.println(a1.getId());
        System.out.println(a2.getId());
        Account1 a3 = new Account1(Account1.Saving, 3000);
        Account1 a4 = new Account1(Account1.Checking, 4000);
        System.out.println(a3);
    }
}
