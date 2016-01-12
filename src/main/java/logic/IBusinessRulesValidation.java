/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.ElementaryProduct;

public interface IBusinessRulesValidation {
    
    void isProductValid(ElementaryProduct elementaryProduct) throws Exception;
    
    void isCarValid(ElementaryProduct elementaryProduct) throws Exception;
    
}
