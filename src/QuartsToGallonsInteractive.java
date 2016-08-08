import javax.swing.JOptionPane;

/**
 * Created by kyecook on 8/08/2016.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args)
    {
        int QUARTS_IN_A_GALLON = 4;
        int paintingJob;
        int calculatedPaintingJobQuarts;
        int calculatedPaintingJobGallons;
        String userInput;

        userInput = JOptionPane.showInputDialog(null, "Please Enter quarts needed for painting job.");

        paintingJob = Integer.parseInt(userInput);

        calculatedPaintingJobQuarts = paintingJob%QUARTS_IN_A_GALLON;
        calculatedPaintingJobGallons = paintingJob/QUARTS_IN_A_GALLON;

        JOptionPane.showMessageDialog(null, "A job that needs " + paintingJob + " quarts requires " +
                calculatedPaintingJobGallons + " Gallons plus " + calculatedPaintingJobQuarts + " Quarts.");

    }
}
