public  class Googlewallet extends Wallet  {

    public double Googlebalance = 0;
    public  double cashback;



    public void Googlewallet(){}
    public  Googlewallet(double Googlemoney)
    {

        Googlebalance =  Googlemoney;

    }


    public  void addMoney(double amount )
    {

        Googlebalance = amount + Googlebalance;

        System.out.println("Total amount in wallet:"+ Googlebalance);
        if(Googlebalance > 500) {

            System.out.println(" cashback of 20% as  wallet has more than 1000:");

            cashback = ((Googlebalance*20))/100;

            System.out.println("Cashback amount recieved:"+cashback);

            Googlebalance = cashback + Googlebalance ;

            System.out.println("Total balance after adding cashback:"+Googlebalance);


        }

        else {

            System.out.println("Googlebalance is less than 500");

        }

    }

    public void checkBalance() {
        System.out.println("Current Balance:" + Googlebalance);

    }

    public void deductMoney(double amount)
    {
        if(Googlebalance >= amount)
        {
            System.out.println("Deducting amount of :"+amount);
            Googlebalance = Googlebalance-amount;
            System.out.println("Current Balance in wallet:"+Googlebalance);
        }
        else
        {
            System.out.println("Deduction amount is more than the wallet");

        }


    }
}
