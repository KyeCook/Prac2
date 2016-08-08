import javax.swing.JOptionPane;

/**
 * Created by kyecook on 8/08/2016.
 */
public class Initials {
    public static void main(String[] args)
    {
        String initialFirst;
        String initialMiddle;
        String initialLast;

        initialFirst = JOptionPane.showInputDialog(null, "Please enter first initial.");
        initialMiddle = JOptionPane.showInputDialog(null, "Please enter middle initial.");
        initialLast = JOptionPane.showInputDialog(null, "Please enter last initial.");

        JOptionPane.showMessageDialog(null, "Your initials are : " + initialFirst + "." + initialMiddle + "." + initialLast);
    }
}
