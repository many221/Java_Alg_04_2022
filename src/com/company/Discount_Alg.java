package com.company;

public class Discount_Alg {

    public static double discount(int price, int percentage) {
        double totalDiscount =price - price * percentage/100;
        double decimalRemoval = Math.round(totalDiscount * 100.0) / 100.0;
        return decimalRemoval;

    }

}
