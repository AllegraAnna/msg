package db;

import java.sql.*;
import helpers.ElementaryProductHelper;

public class DBBroker {

    protected Connection connection = null;
    private String dataSource;

    public DBBroker(String dataSource) {
        try {
            Class.forName("org.sqlite.JDBC");
            this.dataSource = dataSource;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void openConnection() {
        try {
            connection = DriverManager.getConnection(dataSource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void saveElementaryProductPOJO(ElementaryProductHelper elementaryProduct) throws Exception {
        String query = "INSERT INTO elementary_product " +
                "VALUES " + elementaryProduct.getValues();
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    }
    
    public void clearDatabase() throws Exception{
        String query = "DELETE FROM elementary_product";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    }
}
