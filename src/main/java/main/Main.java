/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.IOException;
import session.Controller;

public class Main {
    
    public static void main(String[] args) {
        File file = new File("JSONProductsList.json");
        try {
            Controller.getInstance().ClearDatabase();
            Controller.getInstance().executeScript(file);
        } catch (IOException ex) {
            System.out.println("Path for file is bad!");
        }
    }
    
}
