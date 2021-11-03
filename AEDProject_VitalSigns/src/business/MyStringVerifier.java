package business;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author RamCharan
 */
public class MyStringVerifier extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[a-zA-Z0-9 ]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 ||
                    text.matches(pattern) != true) {
                input.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(input,"Please do not enter special characters", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                input.setBorder(BorderFactory.createLineBorder(Color.white));
                return true;
            }
        }
        else
        {
            input.setBackground(Color.white);
            input.setBorder(BorderFactory.createLineBorder(Color.white));
            return true;
        }
    }
}
