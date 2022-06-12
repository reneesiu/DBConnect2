package dbconnect2;

import java.sql.*;

public class DBConnect2 {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/bootcamp";
        String username="root";
        String password="";
        
        Connection conn=null;
        Statement myquery;
        ResultSet results;

        try {
            conn=DriverManager.getConnection(url, username, password);
            myquery=conn.createStatement();
            results=myquery.executeQuery("select * from Employee;");
            while(results.next()) {
                System.out.print(results.getInt(1)+"\t");
                System.out.print(results.getString("EmpLname")+"\t");
                System.out.print(results.getString("EmpFname")+"\t");
                System.out.print(results.getString("EmpAddress1")+"\t");
                System.out.print(results.getString("EmpAddress2")+"\t");
                System.out.print(results.getString("EmpCity")+"\t");
                System.out.print(results.getString("EmpState")+"\t");
                System.out.print(results.getString("EmpDOB")+"\t");
                System.out.println(results.getDouble("EmpBaseSalary"));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
            System.out.println("Database error!!");
        }
        
    }
}
    
