public class Pizza {
    private int price;
    private boolean veg;
    private  int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int takeAwayPrize=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAway=false;
    Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else
            this.price=400;
        basePizzaPrice=this.price;
    }
   public void addExtraCheese(){
        isExtraCheeseAdded=true;
       //System.out.println("extra cheese added");
       this.price+=extraCheesePrice;

   }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
       // System.out.println("extra toppings added");
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        isTakeAway=true;
       // System.out.println("take away opted");
        this.price+=takeAwayPrize;
    }
    public void getBill(){
        String bill="";
        System.out.println("pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra toppings added: "+extraToppingsPrice+"\n";
        }
        if(isTakeAway){
            bill+="Take away: "+takeAwayPrize+"\n";
        }
        bill+="Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
