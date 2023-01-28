package lec01;

public class SwallowtailButterfly extends Butterfly {

    @Override
    void move() {
        super.move();
        System.out.println("綺麗に飛んだよ");
    }
}
