import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JLabel;

class Project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("How old are you?");
        JPasswordField passwordField = new JPasswordField(10);

        panel.add(label);
        panel.add(passwordField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Age Input", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            char[] input = passwordField.getPassword();
            String ageStr = new String(input);

            try {
                int age = Integer.parseInt(ageStr);

                if (age > 18) {
                    JOptionPane.showMessageDialog(null, "It doesn't matter, HABIBTI! <3");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid age.");
            }
        }
    }
}
