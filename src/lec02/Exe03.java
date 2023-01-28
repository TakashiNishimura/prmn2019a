package lec02;

import java.util.ArrayList;

public class Exe03 {

    public static void main(String[] args) {
        ArrayList<IPowerToggleable> iPTs = new ArrayList<>();

        iPTs.add(new Computer());
        iPTs.add(new AirConditioner());
        iPTs.add((new UnmotivatedHuman()));

        iPTs.forEach(IPowerToggleable::togglePower);
    }
}
