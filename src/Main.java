public class Main {

   /* public static void main(String[] args)
    {

        Wallet mywallet = new Wallet(300);
        mywallet.addmoney(1000.50);
        mywallet.checkBalance();
        mywallet.removemoney(300);
        mywallet.checkBalance();




    }*/

   public static void main(String[] args)

   {
       Amazonwallet mymoneywallet = new Amazonwallet(300.00);
       mymoneywallet.addMoney(1000.50);
       mymoneywallet.deductMoney(300);
       mymoneywallet.checkBalance();
       Googlewallet googlemoneywallet = new Googlewallet(100.00);
       googlemoneywallet.addMoney(300.00);
       googlemoneywallet.checkBalance();
       googlemoneywallet.deductMoney(500);
   }

}
