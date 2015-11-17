package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection cn = DriverManager.getConnection("jdbc:sqlite:people");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from people");
        
        while (rs.next ()) {
            System.out.println("id = " + rs.getInt("id"));
            System.out.println("name = " + rs.getString("name"));
        }
        
        rs.close();
        st.close();
        cn.close();
    }
    
}
