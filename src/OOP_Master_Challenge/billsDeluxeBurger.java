package OOP_Master_Challenge;

public class billsDeluxeBurger extends billsFamousBasicBurger{
        int chips;
        int drink;
    public billsDeluxeBurger(String bunType, String meat, double price, int chips, int drink) {
        super(bunType, meat, price);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
