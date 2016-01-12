/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import so.SystemOperations;

public class ClearDatabaseOperation extends SystemOperations {

    @Override
    protected void operation() {
        try {
            dbb.clearDatabase();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
