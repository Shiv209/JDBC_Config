import java.sql.*;
public class FullDB {
    public static void main(String[] args) {

        //void createConnection(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection commect = DriverManager.getConnection("jdbc:mysql:localhost:3306/GroceryList", "root", "pass1234");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

