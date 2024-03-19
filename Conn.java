package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-2UM4R4G:1521/xe","system","admin");
            s = c.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
