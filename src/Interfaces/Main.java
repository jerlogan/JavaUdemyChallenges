package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(2107658981);
        myPhone.powerOn();
        myPhone.callPhone(2107658981);
        myPhone.answer();

        myPhone = new MobilePhone(2104738291);
        myPhone.powerOn();
        myPhone.callPhone(2104738291);
        myPhone.answer();

    }
}
