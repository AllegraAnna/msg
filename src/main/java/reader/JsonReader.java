/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.ElementaryProduct;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    
    public List<ElementaryProduct> readElementaryProducts() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File("JSONProductsList.json"), 
                mapper.getTypeFactory().constructCollectionType(List.class, ElementaryProduct.class));
    }
    
    
    
}
