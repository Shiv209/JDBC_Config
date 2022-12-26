import java.sql.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class MyJDBC {
    public static void main(String[] args)   {
        try {
            Connection con = DriverManager.getConnection("com.mysql.cj.jdbc.Driver", "root", "pass1234");
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("select * from people");

            while (result.next()) {
                System.out.println(result.getString("firstname"));

            }
        } catch (Exception e){
            e.printStackTrace();
        }




    }
}
