/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.ElementaryProduct;

public class PremiumCalculation implements IPremiumCalculation {

    public double premiumEngine(ElementaryProduct product) {
        if (product.getProduct().getInsuredObject().getEngineCapacity() >= 60 && product.getProduct().getInsuredObject().getEngineCapacity() < 100) {
            return 0.0064;
        }
        if (product.getProduct().getInsuredObject().getEngineCapacity() >= 100 && product.getProduct().getInsuredObject().getEngineCapacity() < 140) {
            return 0.007;
        }
        if (product.getProduct().getInsuredObject().getEngineCapacity() >= 140 && product.getProduct().getInsuredObject().getEngineCapacity() <= 180) {
            return 0.008;
        }
        if (product.getProduct().getInsuredObject().getEngineCapacity() > 180 && product.getProduct().getInsuredObject().getEngineCapacity() <= 220) {
            return 0.009;
        }
        return 1;
    }

    public double premiumSuchargesYear(ElementaryProduct product) {
        if (product.getProduct().getConstructionYear() >= 2000 && product.getProduct().getConstructionYear() <= 2010) {
            return 0.05;
        }
        if (product.getProduct().getConstructionYear() >= 1990 && product.getProduct().getConstructionYear() <= 2000) {
            return 0.1;
        }
        if (product.getProduct().getConstructionYear() >= 1980 && product.getProduct().getConstructionYear() <= 2000) {
            return 0.2;
        }
        return 0;

    }

    public double premiumSuchargesMileage(ElementaryProduct product) {
        if (product.getProduct().getInsuredObject().getMileage() <= 250000 && product.getProduct().getInsuredObject().getMileage() >= 200000) {
            return 0.2;
        }
        if (product.getProduct().getInsuredObject().getMileage() <= 200000 && product.getProduct().getInsuredObject().getMileage() >= 150000) {
            return 0.15;
        }
        if (product.getProduct().getInsuredObject().getMileage() <= 150000 && product.getProduct().getInsuredObject().getMileage() >= 100000) {
            return 0.1;
        }
        if (product.getProduct().getInsuredObject().getMileage() >= 50000 && product.getProduct().getInsuredObject().getMileage() <= 100000) {
            return 0.05;
        }
        return 0;
    }

    public double premiumDiscounts(ElementaryProduct product) {
        if (Boolean.parseBoolean(product.getProduct().getGarage())) {
            return 0.05;
        }
        return 0;
    }

    @Override
    public double calculatePremium(ElementaryProduct elementaryProduct) {
        double premium = premiumEngine(elementaryProduct) * elementaryProduct.getProduct().getObjectValue();
        double surcharges = premium * premiumSuchargesYear(elementaryProduct)
                + premium * premiumSuchargesMileage(elementaryProduct);
        premium += surcharges;
        double disc = premium * premiumDiscounts(elementaryProduct);
        premium -= disc;
        premium = premiumEngine(elementaryProduct) * elementaryProduct.getProduct().getObjectValue() - elementaryProduct.getDeductible() * premiumEngine(elementaryProduct);
        premium += elementaryProduct.getBonusMalus();

        return premium;
    }

}
