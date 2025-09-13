public class Pizza {
    
    private int price;
    private Boolean veg;

    private int extraCheese = 100;
    private int extraToppings = 150;
    private int takeAway = 20;

    private int basePizzaPrice;

    private boolean isAddExtraChees = false;
    private boolean isAddExtraTopping = false;
    private boolean isReady = false;


    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }


    public void extraCheese(){

        isAddExtraChees = true;
        // System.out.println("Extra Chhese Added");
        this.price += extraCheese;
    }

    public void extraToppings(){
  
        isAddExtraTopping = true;
        // System.out.println("Extra Toppins Added");
        this.price += extraToppings;
    }

    public void takeAway(){

        isReady = true;
        System.out.println("Ready to out");
        this.price += takeAway;
    }

    public void getBill(){

  
        String bill = "";
        System.out.println("Pizza :" + basePizzaPrice);
        if(isAddExtraChees){
            bill += "Extra Cheese Added :"+ extraCheese + "\n";
        }
        if (isAddExtraTopping) {
            bill += "Extra Topping Added :"+ extraToppings + "\n";

        }
        if (isReady) {
            bill += "Ready :"+ takeAway + "\n";
            
        }

        bill += "Final Price :"+ this.price +"\n";

        System.out.println(bill);

    }

}
