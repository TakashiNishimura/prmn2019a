package lec02;

import java.util.Arrays;

public class Exe02 {

    public static void main(String[] args) {
        IPowerToggleable[] iPowerToggleables = new IPowerToggleable[3];
        iPowerToggleables[0] = new Computer();
        iPowerToggleables[1] = new AirConditioner();
        iPowerToggleables[2] = new UnmotivatedHuman();

        Arrays.stream(iPowerToggleables).forEach(IPowerToggleable::togglePower);
    }
}
