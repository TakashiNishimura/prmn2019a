package lec01;

public class Exe06 {

    public static void main(String[] args) {
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();
        swallowtailButterfly.move();

        Insect is = swallowtailButterfly;
        is.move();
    }
}
