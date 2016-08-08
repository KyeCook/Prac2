/**
 * Created by kyecook on 8/08/2016.
 */
public class QuartsToGallons {
    public static void main(String[] args)
    {
        int QUARTS_IN_A_GALLON = 4;
        int paintingJob = 18;
        int calculatedPaintingJobQuarts;
        int calculatedPaintingJobGallons;

        calculatedPaintingJobQuarts = paintingJob%QUARTS_IN_A_GALLON;
        calculatedPaintingJobGallons = paintingJob/QUARTS_IN_A_GALLON;

        System.out.println("A job that needs " + paintingJob + " quarts requires " + calculatedPaintingJobGallons
                + " Gallons plus " + calculatedPaintingJobQuarts + " Quarts.");

    }
}
