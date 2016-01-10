/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.ElementaryProduct;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import reader.JsonReader;

/**
 *
 * @author Bojanovic
 */
public class Test {

    public static void main(String[] args) {
        try {
            JsonReader jr = new JsonReader();
            for (ElementaryProduct e : jr.readElementaryProducts()) {
                try {
                    
                    BusinessRulesValidation b = new BusinessRulesValidation();
                    
                    b.isProductValid(e);
                    System.out.println(e);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
