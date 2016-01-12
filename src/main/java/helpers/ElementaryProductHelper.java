/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import domain.ElementaryProduct;

public class ElementaryProductHelper {

    private ElementaryProduct elementaryProduct;
    private double premiumCalculation;

    public ElementaryProductHelper(ElementaryProduct elementaryProduct, double premiumCalculation) {
        this.elementaryProduct = elementaryProduct;
        this.premiumCalculation = premiumCalculation;
    }

    public String getValues() {
        return "(" + elementaryProduct.getElementaryProductId() + ", " + elementaryProduct.getBonusMalus() + ", " + elementaryProduct.getDeductible() + ", "
                + elementaryProduct.getComprehensive() + ", " + elementaryProduct.getPartial() + ", " + elementaryProduct.getLegacyPremium() + ", " + elementaryProduct.getProduct().getProductId() + ", '"
                + Boolean.parseBoolean(elementaryProduct.getProduct().getGarage()) + "', " + elementaryProduct.getProduct().getConstructionYear() + ", '" + elementaryProduct.getProduct().getRegion() + "', '" 
                + elementaryProduct.getProduct().getDateOfBirthYoungest() + "', " + elementaryProduct.getProduct().getObjectValue() + ", '" + elementaryProduct.getProduct().getType() + "', '"
                + elementaryProduct.getProduct().getProductType() + "', '" + elementaryProduct.getProduct().getInsuredObject().getName() + "', '" + elementaryProduct.getProduct().getInsuredObject().getOwnersName() + "', "
                + elementaryProduct.getProduct().getInsuredObject().getMileage() + ", " + elementaryProduct.getProduct().getInsuredObject().getEngineCapacity() + ", " + elementaryProduct.getProduct().getSalesProduct().getSalesProductId() + ", '"
                + elementaryProduct.getProduct().getSalesProduct().getCurrency() + "', '" + elementaryProduct.getProduct().getSalesProduct().getContractStart() + "', '" + elementaryProduct.getProduct().getSalesProduct().getContractEnd() + "', "
                + premiumCalculation + ")";
    }

}
