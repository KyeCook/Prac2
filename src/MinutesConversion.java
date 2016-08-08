import javax.swing.JOptionPane;

/**
 * Created by kyecook on 8/08/2016.
 */
public class MinutesConversion {
    public static void main(String[] args)
    {
        float MINUTES_IN_HOUR = 60;
        float HOURS_IN_DAY = 24;
        String userInput = JOptionPane.showInputDialog(null, "Enter number of minutes");
        float minutes = Integer.parseInt(userInput);

        float calculatedMinutesHours = minutes/MINUTES_IN_HOUR;
        float calculatedMinutesDays = calculatedMinutesHours/HOURS_IN_DAY;

        JOptionPane.showMessageDialog(null, minutes + " minutes is equal to: " + calculatedMinutesHours + " hours and "
                + calculatedMinutesDays + " days");

    }
}
