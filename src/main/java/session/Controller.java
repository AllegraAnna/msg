/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import domain.ElementaryProduct;
import java.io.File;
import java.io.IOException;
import java.util.List;
import logic.BusinessRulesValidation;
import logic.IBusinessRulesValidation;
import operations.ClearDatabaseOperation;
import operations.InsertElementaryProductOperation;
import reader.IJsonReader;
import reader.JsonReader;
import so.SystemOperations;

public class Controller {
    
    private static Controller instance;
    
    public static Controller getInstance(){
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void executeScript(File file) throws IOException{
        IJsonReader reader = new JsonReader();
        List<ElementaryProduct> elementaryProducts = reader.readElementaryProducts();
        IBusinessRulesValidation validator = new BusinessRulesValidation();
        for (ElementaryProduct ep : elementaryProducts) {
            try {
                validator.isProductValid(ep);
                if (ep.getProduct().getProductType().toLowerCase().equals("car")) {
                    validator.isCarValid(ep);
                }
                SystemOperations so = new InsertElementaryProductOperation(ep);
                so.dbOperation();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void ClearDatabase(){
        SystemOperations so = new ClearDatabaseOperation();
        so.dbOperation();
    }
    
}
