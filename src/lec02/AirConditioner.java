package lec02;

public class AirConditioner implements IPowerToggleable {

    @Override
    public void togglePower() {
        System.out.println("北海道ではエアコンはレアです。");
    }
}
