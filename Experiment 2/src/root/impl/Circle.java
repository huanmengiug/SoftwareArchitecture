package root.impl;

import java.io.IOException;

import root.Shape;

// 圆
public class Circle implements Shape {

    @Override
    public void Paint(int size) {
        System.out.println("绘制圆形");
        int r = size;// 圆形的半径
        for (int y = 0; y <= 2 * r; y += 2) {// y的步长为2,改变y的步长可以将圆形变成椭圆
            int x = (int) Math.round(r - Math.sqrt(2 * r * y - y * y));
            int len = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }

    @Override
    public void Erase() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("圆形被擦除");
    }

}
