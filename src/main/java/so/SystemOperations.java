/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import db.DBBroker;

public abstract class SystemOperations {
    
    protected DBBroker dbb;
    
    public void dbOperation(){
        dbb = new DBBroker("jdbc:sqlite:Database.s3db");
        try {
            dbb.openConnection();
            operation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                dbb.closeConnection();
            } catch (Exception ex) {
                System.out.println("Connection is already closed!");
            }
        }
    }
    
    protected abstract void operation();
    
}
