package Plate.透明组合;

public class Cilent {
    public static void main(String[] args) throws Exception {
        Plate plate1,plate2,plate3;
        plate1 = new Plate("大果盘");
        plate2 = new Plate("果盘中");
        plate3 = new Plate("小果盘");

        Apple apple1,apple2,apple3;
        apple1 = new Apple();
        apple2 = new Apple();
        apple3 = new Apple();

        Banana banana1,banana2,banana3;
        banana1 = new Banana();
        banana2 = new Banana();
        banana3 = new Banana();

        Pear pear1,pear2,pear3;
        pear1 = new Pear();
        pear2 = new Pear();
        pear3 = new Pear();

        plate1.add(plate2);
        plate2.add(plate3);
        plate1.add(apple1);
        plate1.add(banana1);

        plate2.add(apple2);
        plate2.add(apple3);
        plate2.add(banana2);

        plate3.add(banana3);
        plate3.add(pear1);
        plate3.add(pear2);
        plate3.add(pear3);

        plate1.eat("-");
    }
}
