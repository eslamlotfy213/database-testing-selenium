package DB;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) throws SQLException {

        //String url = "jdbc:mysql://localhost:3306/your_database_name";
        String host = "localhost";
        String port = "1433";
        String username = "root";
        String password = "Azaz123#";


        // String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Qadbt;user=root;password=Azaz123#;";

        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Qadbt;user=root;password=Azaz123#;");
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("Select * from Employeeinfo where id=1");


//       while (resultSet.next())
//       {
//           System.out.print(resultSet.getString("name")+ " |");
//           System.out.print(resultSet.getString("id")+ " |");
//           System.out.print(resultSet.getString("location")+ " |");
//           System.out.print(resultSet.getString("age")+ " |");
//
//           System.out.println();
//       }

      while (resultSet.next())
      {
            String name = resultSet.getString("name");
            String id = resultSet.getString("id");

            //System.out.println(name);
            //System.out.println(id);

        }



    }






}
