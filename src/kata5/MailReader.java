package kata5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailReader {
    
    public static ArrayList <String> read(String name) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        Class.forName("org.sqlite.JDBC");
        Connection cn = DriverManager.getConnection("jdbc:sqlite:people");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT mail from mails");
        ArrayList <String> mailList = new ArrayList<>();
        while (rs.next ()) {
            String mail = rs.getString("mail");
            if(!mail.contains("@")){
                continue;
            }
            mailList.add(mail);
        }
        
            return mailList;
    }
}
