package com.Car.CarObject;

public class CarDoor {

    public CarDoor() {
    }

    public CarDoor(boolean isDoor, boolean isWindow) {
        this.isDoor = isDoor;
        this.isWindow = isWindow;
    }

    private boolean isDoor;


    public boolean isDoor() {
        return isDoor;
    }

    public void setDoor(boolean door) {
        isDoor = door;
    }


    private boolean isWindow;

    public boolean isWindow() {
        return isWindow;
    }

    public void setWindow(boolean window) {
        isWindow = window;
    }


    public void OpenDoor() {
        this.setDoor(true);
    }

    public void closseDoor() {
        this.setDoor(false);
    }

    public void actionDoor() {
        this.setDoor(this.isDoor());
    }

    public void OpenWindow() {
        this.setWindow(true);
    }

    public void closseWindow() {
        this.setWindow(false);
    }

    public void actionWindow() {
        this.setWindow(this.isWindow());
    }

    public void PrintlnCarDoor() {

        System.out.println("Window is : " + this.isWindow + "\nDoor is :" + this.isDoor);


    }


}
