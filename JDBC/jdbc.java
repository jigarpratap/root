package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class jdbc {
    private static final String url="";
    private static final String username="";
   private static final String pass="";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       
        String query="Select * from Student";
        Class.forName("com.mysql.jdbc.driver");
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();
        ResultSet s=st.executeQuery(query);
        while(s.next())
        {
            String data=s.getInt(1)+s.getString(2);
        }
        st.close();
        con.close();


    }
    public void MovieDao(Movie m)
    {
        String query="Insert into movie(movieName,MovieFeedBack) values(?,?)";
        try(PreparedStatement st=con.PreparedStatement(query,Statement.RETURN_GENERATED_KEYS)){
            
        }
    }
}
