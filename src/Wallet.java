public class Wallet{

   private double wbalance=0;


    public  Wallet(double wmoney)
    {
        wbalance =  wmoney;

    }

    public void addmoney(double amount )
    {

        wbalance = amount + wbalance;
        System.out.println("Total amount in wallet:"+ wbalance);

    }

    public void checkBalance()
    {
        System.out.println("Current Balance:"+wbalance);
    }

    public void removemoney(double amount)
    {
        if(wbalance >= amount)
       {

            wbalance = wbalance-amount;
            System.out.println("Current Balance in wallet:"+wbalance);
        }
    else
        {
            System.out.println("Deduction amount is more than the wallet");

        }


     }
}
