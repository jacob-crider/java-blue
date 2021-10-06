package com.techelevator;

public class FlowerShopOrder {

    private String bouquetType;
    private int numberOfRoses;
    private double subtotal = 19.99;
    private double addForRoses = 2.99;

    public FlowerShopOrder() {

    }

    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    public double deliveryTotal(boolean sameDayDelivery, int zipCode) {
        double costOfDelivery;
        double sameDayFee = 5.99;
        if (zipCode > 10000 && zipCode <= 19999) {
            costOfDelivery = 0.0;
            if (sameDayDelivery) {
                costOfDelivery += sameDayFee;
            }
        } else if (zipCode > 20000 && zipCode <= 29999) {
            costOfDelivery = 3.99;
            if (sameDayDelivery) {
                costOfDelivery += sameDayFee;
            }
        } else if (zipCode > 30000 && zipCode <= 39999) {
            costOfDelivery = 6.99;
                if (sameDayDelivery) {
                    costOfDelivery += sameDayFee;
                }
        } else {
            costOfDelivery = 19.99;
        }
        return costOfDelivery;
    }

    @Override
    public String toString() {
        return "ORDER - " + bouquetType + " - " + numberOfRoses + " roses" + " - " + subtotal + addForRoses;
    }
}
