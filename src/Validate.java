import javax.swing.*;

public class Validate {

    public static int stringToInt(String text){
        String numberAsString = JOptionPane.showInputDialog(text);
        int count=0;
        boolean valid = false;

        while (!valid){
            count = 0;

            for (int i = 0; i<numberAsString.length();i++) {
                if (Character.isDigit(numberAsString.charAt(i))){
                    count++;
                }
            }
            if (count == numberAsString.length() && numberAsString.length() != 0){
                valid = true;
            }
            else{
                numberAsString = JOptionPane.showInputDialog("Error! Please enter an integer for the input");
            }
        }
        int number = Integer.parseInt(numberAsString);
        return number;
    }
}
