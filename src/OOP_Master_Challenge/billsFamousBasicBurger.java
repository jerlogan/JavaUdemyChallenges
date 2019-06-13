package OOP_Master_Challenge;

public class billsFamousBasicBurger {
    private String bunType;
    private String meat;
    public double price = 2.00;

    public billsFamousBasicBurger(String bunType, String meat, double price) {
        this.bunType = bunType;
        this.meat = meat;
        this.price = price;
    }

    public double getTotalPrice() {
        return price;
    }

//    setters

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//getters

    public String getBunType() {
        return bunType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }


//    Add extras for an extra cost

    public double addCheese(int slicesOfCheese) {
        price += (0.50 * slicesOfCheese);
        return price;
    }

    public double addOnionStraws() {
        price += 1.00;
        return price;
    }

    public double addLettuce() {
        price += 0.50;
        return price;
    }

    public double addTomatoes() {
        price += 0.50;
        return price;
    }
}
