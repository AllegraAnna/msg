/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import domain.ElementaryProduct;
import java.io.IOException;
import java.util.List;

public interface IJsonReader {
    
    List<ElementaryProduct> readElementaryProducts() throws IOException;
    
}
