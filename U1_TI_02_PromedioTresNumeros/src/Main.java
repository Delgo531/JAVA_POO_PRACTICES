import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;
        int result;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));

        result = number1 + number2 + number3;

        JOptionPane.showMessageDialog(null, result);

    }
}