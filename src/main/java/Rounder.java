import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue(double value){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }
}