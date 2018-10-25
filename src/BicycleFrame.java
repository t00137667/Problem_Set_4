import javax.swing.*;

public class BicycleFrame extends JFrame {
    public BicycleFrame(){
        super("Bicycle Shop");
        setSize(400,200);
        setLocation(100,200);

    }

    public static void main(String[] args) {
        BicycleFrame bicycleFrame = new BicycleFrame();
        bicycleFrame.setVisible(true);

        System.exit(0);
    }
}
