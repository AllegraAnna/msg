/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import domain.ElementaryProduct;
import logic.IPremiumCalculation;
import logic.PremiumCalculation;
import helpers.ElementaryProductHelper;
import so.SystemOperations;

public class InsertElementaryProductOperation extends SystemOperations{
    
    private ElementaryProduct elementaryProduct;

    public InsertElementaryProductOperation(ElementaryProduct elementaryProduct){
        this.elementaryProduct = elementaryProduct;
    }

    @Override
    protected void operation() {
        IPremiumCalculation pc = new PremiumCalculation();
        try {
            dbb.saveElementaryProductPOJO(new ElementaryProductHelper(elementaryProduct, pc.calculatePremium(elementaryProduct)));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
    
}
