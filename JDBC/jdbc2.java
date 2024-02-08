package JDBC;

import java.beans.Statement;
import java.security.DrbgParameters.Reseed;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.relation.RoleInfoNotFoundException;
import javax.xml.transform.Result;

public class jdbc2 {
   public void createMovie(Movie m)
   {
    String url="INSERT INTO patients(patientName, MedicalHistory) VALUES (?, ?)";
    try(PreparedStatement st=connection.PreparedStatement(url,Statement.Return_Generated_keys))
    {     st.setString(1, m.getPatientID);
        st.setString(2,m.getMedicalHistory);
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        if(rs.next())
        {
            m.setID(rs.getInt(1));
        }

    }catch(SQLException e)
    {
        e.printStackTrace();
    }
   }

 void patient MovieID(int patientid) throws RoleNotFoundException{
    String query="Select * from table where  patientID = ?";
    try(PreparedStatement st=connection.PreparedStatement(query))
    {
        st.setInt(1,patientid);
        ResultSet rs=st.executeQuery();
        if(rs.next())
        {
            movie m=new movie();
            m.setInt(rs.getInt(1));
        }else{
            throw new RoleInfoNotFoundException();
        }

    }catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }
 }  

    public static void main(String[] args) {
        
    }
}
