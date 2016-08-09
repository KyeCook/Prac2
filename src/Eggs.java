import javax.swing.JOptionPane;

/**
 * Created by ACfan on 9/08/2016.
 */
public class Eggs {
    public static void main(String[] args)
    {
        double DOZEN_EGGS = 3.25;
        double SINGLE_EGG = 0.45;

        String userInput = JOptionPane.showInputDialog(null, "How many eggs would you like?");
        int userEggs = Integer.parseInt(userInput);

        double dozenAmount = (userEggs/12) * DOZEN_EGGS;
        double singleAmount = (userEggs%12) * SINGLE_EGG;

        JOptionPane.showMessageDialog(null, "You ordered " + userInput + " eggs. That's " + userEggs/12 + " dozen at $"
                + DOZEN_EGGS + " per dozen and " + userEggs%12 + " loose eggs at " + SINGLE_EGG + " each for a total of " +
                "$" + (dozenAmount + singleAmount));

    }
}
