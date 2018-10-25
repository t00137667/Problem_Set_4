import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyJFrameWindow2 extends JFrame {

    public MyJFrameWindow2(){
        super("My Own JFrame");
        setSize(300,200);
        setLocation(250,250);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing (WindowEvent e){
                boolean close = (JOptionPane.showConfirmDialog(null, "Do you wish to terminate the program?", "Confirm", JOptionPane.YES_NO_OPTION) == 0);
                if (close) {
                    System.exit(0);
                }
            }

            @Override
            public void windowIconified (WindowEvent e){
                JOptionPane.showMessageDialog(null, "Minimising Window");
            }

            @Override
            public void windowDeiconified (WindowEvent e){
                JOptionPane.showMessageDialog(null, "Restoring Window");
            }
        }
        );
    }

    public static void main(String[] args) {
        MyJFrameWindow2 myJFrameWindow = new MyJFrameWindow2();
        myJFrameWindow.setVisible(true);
    }
}
