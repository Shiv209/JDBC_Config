import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc.mysql://localhost:3306/GroceryList";
        String user = "root";
        String password = "pass1234";


        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("connection established...!");
        Statement st = con.createStatement();

        String query = "select * from user";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        con.close();
        st.close();
        rs.close();


    }

}
