package lec01;

public class Butterfly extends Insect {

    @Override
    void move() {
        super.move();
        System.out.println("飛んだよ");
    }
}
