package root.impl;
import java.io.IOException;

import root.Shape;

//三角形
public class Triangle implements Shape{

    @Override
    public void Paint(int size) {
        System.out.println("绘制三角形");
        for (int i = 1; i <= size; i++) {
            // 打印空格
            for (int j = 0; j <= size - i; j++) {
                System.out.print(' ');
            }
            // 打印*
            System.out.print('*');
            for (int j = 1; j < 2 * (i - 1); j++) {
                System.out.print(' ');
            }
            // 打印*
            if (i != 1)
                System.out.print('*');
            System.out.println();// 换行
        }
        for (int i = 0; i <= size*2; i++){
            System.out.print('*');
        }
        System.out.println();// 换行
        
        
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
        System.out.println("三角形被擦除");
        
    }
    
}
