package entities;

public class Converter {

    public static final double IOF = 0.06;
    public static final double DOLLAR_PRICE = 3.10;

    public static double finalAmount(double amount) {
        double brl_value = amount * DOLLAR_PRICE;
        return brl_value + (brl_value * IOF);
    }
}
