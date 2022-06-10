package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("First value: ");
            String b = JOptionPane.showInputDialog("Second value: ");

            try {
                int result = divide(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Result: " + result);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Incorrect value, please try again with a correct integer number" + e.getMessage());
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Incorrect value, please try again with a correct integer number not zero" + e.getMessage());
            }

        } while (continueLooping);
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
