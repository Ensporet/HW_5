package com.Car;

import com.Car.CarObject.CarDoor;
import com.Car.CarObject.CarWheel;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Car {

    public Car(Date dateСreature) {
        this.dateСreature = dateСreature;
    }

    public Car(Date dateСreature, String typeEngine, int maxSpeedIfnew, long timeTo100, int passenger, int inCarPassenger, int speed) {
        this.dateСreature = dateСreature;
        this.typeEngine = typeEngine;
        this.maxSpeedIfnew = maxSpeedIfnew;
        this.timeTo100 = timeTo100;
        this.passenger = passenger;
        this.inCarPassenger = inCarPassenger;
        this.speed = speed;
    }

    private final Date dateСreature;


    public Date getDateСreature() {
        return dateСreature;
    }


    private String typeEngine = " default";


    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        if (typeEngine == null) {
            this.typeEngine = " default";
        } else {
            this.typeEngine = typeEngine;
        }
    }

    private int maxSpeedIfnew = 100;

    public int getMaxSpeedIfnew() {
        return maxSpeedIfnew;
    }

    public void setMaxSpeedIfnew(int maxSpeedIfnew) {
        if (maxSpeedIfnew < 1) {
            this.maxSpeedIfnew = 1;
        } else {
            this.maxSpeedIfnew = maxSpeedIfnew;
        }
    }

    private long timeTo100 = 1;

    public long getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(long timeTo100) {
        if (timeTo100 < 1) {
            this.timeTo100 = 1;
        } else {
            this.timeTo100 = timeTo100;
        }
    }

    private int passenger = 1;

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        if (passenger < 1) {
            this.passenger = 1;
        } else {
            this.passenger = passenger;
        }
    }

    private int inCarPassenger = 0;

    public int getInCarPassenger() {
        return inCarPassenger;
    }

    public void setInCarPassenger(int inCarPassenger) {
        if (inCarPassenger < 0) {
            this.inCarPassenger = 0;
        } else {
            if (inCarPassenger > this.getPassenger()) {
                this.inCarPassenger = this.getPassenger();
            } else {

                this.inCarPassenger = inCarPassenger;
            }
        }

    }

    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            if (speed > this.isCurrentMaxSpeed()) {
                this.speed = (int) this.isCurrentMaxSpeed();
            } else {
                this.speed = speed;
            }
        }

    }

    private ArrayList<CarDoor> door = new ArrayList<CarDoor>();

    public ArrayList<CarDoor> getDoor() {
        return door;
    }

    public void setDoor(ArrayList<CarDoor> door) {
        this.door = door;
    }


    private ArrayList<CarWheel> whell = new ArrayList<CarWheel>();

    public ArrayList<CarWheel> getWhell() {
        return whell;
    }

    public void setWhell(ArrayList<CarWheel> whell) {
        this.whell = whell;
    }


    //------------------------------------------

    public void addOnePassenger() {
        this.setInCarPassenger((this.getInCarPassenger() + 1));
    }

    public void deleteOnePassenger() {
        this.setInCarPassenger((this.getInCarPassenger() - 1));
    }

    public void deleteAllPassenger() {
        this.setInCarPassenger((0));
    }

    public CarDoor getOneDor(int i) {
        if (i < 0 || i >= this.getDoor().size()) {
            return null;
        }
        return this.getDoor().get(i);
    }

    public CarWheel getOneWhell(int i) {
        if (i < 0 || i >= this.getWhell().size()) {
            return null;
        }
        return this.getWhell().get(i);
    }


    public void deleteAllWheel() {
        this.getWhell().clear();
    }

    public void addWheels(int newWheels) {

        for (int i = 0; i < newWheels; i++) {
            this.getWhell().add(new CarWheel());

        }

    }


    public double isCurrentMaxSpeed() {

        if (this.getInCarPassenger() == 0 || this.getWhell().size() == 0) {
            return 0;
        }

        double old = 1;
        for (CarWheel cw : this.getWhell()) {
            if (cw.getLife() < 1) {
                old = cw.getLife();
            }
        }
        if (old == 0) {
            old = 0.01;
        }

        return this.getMaxSpeedIfnew() * old;

    }


    public void printlnCar() {


        System.out.println("DateСreature : " + this.getDateСreature() + "\nEngine : " + this.getTypeEngine() + "\nSpeed If car is new :" + this.getMaxSpeedIfnew() + "\nCurrentMaxSpeed : " + this.isCurrentMaxSpeed() + "\nCurrentSpeed :" + this.getSpeed() + "\nSecondTo100km : " + getTimeTo100() + "\nMaxPassenger" + this.getPassenger() + "\nCurrentPassenger : " + this.getInCarPassenger() + "\nWheel :"


        );
        if (this.getWhell().size() == 0) {
            System.out.print("null");
        } else {
            for (CarWheel cw : this.getWhell()) {
                cw.printlnWeel();
            }
        }
        System.out.print("Door : ");
        if (this.getDoor().size() == 0) {
            System.out.print("null");
        } else {
            for (CarDoor cd : this.getDoor()) {
                cd.PrintlnCarDoor();
            }
        }


    }


}
