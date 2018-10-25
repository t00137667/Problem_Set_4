import javax.swing.*;
import java.awt.event.*;

public class MyJFrameWindow extends JFrame {

    public MyJFrameWindow(){
        super("My Own JFrame");
        setSize(300,200);
        setLocation(250,250);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowEventHandler());
    }

    public static void main(String[] args) {
        MyJFrameWindow myJFrameWindow = new MyJFrameWindow();
        myJFrameWindow.setVisible(true);
    }

    private class WindowEventHandler extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            boolean close = (JOptionPane.showConfirmDialog(null,"Do you wish to terminate the program?", "Confirm", JOptionPane.YES_NO_OPTION) == 0);
            if (close){
                System.exit(0);
            }
        }

        @Override
        public void windowIconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null,"Minimising Window");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null,"Restoring Window");
        }
    }
}
