package jdbcex;

import java.sql.*;



public class JdbcEx {
    
    public static void main(String[] args) {
        Connection conn;
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
        System.out.println("connection established");
//        PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?)");
//        
//        ps.setInt(1, 300);
//        ps.setString(2, "pooja");
//        ps.setInt(3, 3000);
//        ps.execute();
//       
//       
//        ResultSet rs=ps.executeQuery("select * from employee where id=300");
//       
//        while(rs.next())
//        {
//            System.out.println(rs.getInt(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getInt(3));
//        }
        
        }
        
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
        
        
    }

 

}
 
