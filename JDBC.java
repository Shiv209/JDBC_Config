import java.sql.*;
public class JDBC {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/testdb";
        String user="root";
        String password="";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established!");

        Statement st = con.createStatement();
        String query = "insert into user values('abc', 'xyz')";

        int result = st.executeUpdate(query);
        if(result>0)
            System.out.println("Record inserted!");

        ResultSet rs = st.executeQuery("select * from user");
        while(rs.next())
            System.out.println(rs.getString(1)+ " "+rs.getString("password"));


        con.close();
        st.close();
        rs.close();

    }
}
