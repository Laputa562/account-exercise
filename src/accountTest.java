public class accountTest {
    public static void main(String[] args) {
        account ac1 = new account(5);
        account ac2 = new account(-5);
        ac1.displayAccount();
        ac2.displayAccount();
        System.out.println("----------------------------");
        System.out.println(ac1.getBalance());
        System.out.println(ac2.getBalance());
        System.out.println("----------------------------");
        ac1.setDebit(10);
        ac2.setDeposit(-25);
        ac1.displayAccount();
        ac2.displayAccount();
        System.out.println("----------------------------");
        ac1.setDebit(2);
        ac2.setDeposit(10);
        ac1.displayAccount();
        ac2.displayAccount();


    }
}
