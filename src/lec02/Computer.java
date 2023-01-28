package lec02;

public class Computer implements IPowerToggleable {

    @Override
    public void togglePower() {
        System.out.println("電源の状態が変化しました。");
    }
}
