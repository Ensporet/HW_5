package com.Car.CarObject;

public class CarWheel {

    private double life;

    public CarWheel() {
        this.life = 1;
    }

    public CarWheel(double life) {
        this.life = life;
    }


    public double getLife() {
        return this.life;
    }

    public void setLife(double life) {
        if (life < 0) {
            this.life = 0;
        } else {
            if (life > 1) {
                this.life = 1;
            } else {
                this.life = life;
            }
        }

    }

    public void newWheel() {
        this.setLife(999999999);
    }

    public double blur_out_Whell(double procent) {

        this.setLife(this.getLife() - procent);
        return this.getLife();

    }

    public String getValueStr() {

        if (this.getLife() == 0) {
            return "This Wheel is old";
        } else {
            if (this.getLife() == 1) {
                return "Thus Wheel is new";
            } else {
                return "This Wheel is Ok" + this.getLife() + "%";

            }
        }

    }

    public void printlnWeel() {
        System.out.println(getValueStr());
    }


    public static class Car {
    }
}
