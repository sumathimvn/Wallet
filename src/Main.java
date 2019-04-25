public class Main {

    public static void main(String[] args)
    {

        Wallet mywallet = new Wallet(300);
        mywallet.addmoney(1000.50);
        mywallet.checkBalance();
        mywallet.removemoney(300);
        mywallet.checkBalance();




    }
}
