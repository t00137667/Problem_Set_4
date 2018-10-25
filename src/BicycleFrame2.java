import javax.swing.*;
import java.awt.*;

public class BicycleFrame2 extends JFrame {
    public BicycleFrame2(){
        super("Bicycle Shop");
        setSize(400,200);
        setLocation(100,200);

    }

    public static void main(String[] args) {
        BicycleFrame2 bicycleFrame = new BicycleFrame2();
        bicycleFrame.getContentPane().setBackground(Color.GREEN);
        bicycleFrame.setVisible(true);

        //System.exit(0);
    }
}
