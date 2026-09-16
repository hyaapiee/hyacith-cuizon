
package lending.system;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Data {
     private static final String URL = "jdbc:mysql://localhost:3306/records_lending";
    private static final String ACCOUNT = "root";
    private static final String NUMBER = "";
    
    public static Connection dbConnect()throws  SQLException{
        return DriverManager.getConnection(URL, ACCOUNT, NUMBER);
    }
}
