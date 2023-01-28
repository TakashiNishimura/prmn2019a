package lec02;

public class Exe01 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        AirConditioner airConditioner = new AirConditioner();

        computer.togglePower();
        airConditioner.togglePower();
    }
}
