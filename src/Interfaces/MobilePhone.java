package Interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone() {
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is powered up!");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone...");
        } else {
            System.out.println("Phone is switched OFF.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone...");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody playing.");
        } else {
            isRinging = false;
            System.out.println("Phone is off.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
