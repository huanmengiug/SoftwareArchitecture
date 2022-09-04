import java.io.IOException;

//矩形
public class Rectangle implements Shape{

    @Override
    public void Paint(int size) {
        System.out.println("绘制矩形");
       
           for (int i = 1; i <= 5; i++) {
               System.out.print("*");
               for (int j = 1; j <= 5; j++) {
                   System.out.print("*");
               }
               System.out.println();
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
        System.out.println("矩形被擦除");	
        
    }
    
}
