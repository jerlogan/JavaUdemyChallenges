package OOP_Master_Challenge;

public class billsHealthyBurger extends billsFamousBasicBurger{
    public billsHealthyBurger(String bunType, String meat, double price) {
        super(bunType, meat, price);
        this.setBunType("Brown Eyed Bread Roll");
    }

    public double addVeggieStraws() {
        return price + 0.50;
    }

    public double fatFreeSauce() {
        return price + 0.50;
    }
}
