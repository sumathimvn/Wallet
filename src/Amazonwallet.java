public  class Amazonwallet extends Wallet  {

    public double Amazonbalance = 0;
    public  double cashback;



    public void Amazonwallet(){}
    public  Amazonwallet(double amazonmoney)
   {

       Amazonbalance =  amazonmoney;

   }


    public  void addMoney(double amount )
    {

        Amazonbalance = amount + Amazonbalance;

        System.out.println("Total amount in wallet:"+ Amazonbalance);
         if(Amazonbalance > 1000) {

              System.out.println(" cashback of 20% as  wallet has more than 1000:");

              cashback = ((Amazonbalance*20))/100;

              System.out.println("Cashback amount recieved:"+cashback);

              Amazonbalance = cashback + Amazonbalance ;

              System.out.println("Total balance after adding cashback:"+Amazonbalance);


         }

         else {

             System.out.println("Amazonbalance is less than 1000");

         }

    }

    public void checkBalance()
    {
        System.out.println("Current Balance:"+Amazonbalance);

    }

    public void deductMoney(double amount)
    {
        if(Amazonbalance >= amount)
        {

            Amazonbalance = Amazonbalance-amount;
            System.out.println("Current Balance in wallet:"+Amazonbalance);
        }
        else
        {
            System.out.println("Deduction amount is more than the wallet");

        }


    }
}
