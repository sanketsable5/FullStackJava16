package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java14oct", "root", "Root@123");
            Class.forName("com.mysql.cj.jdbc.Driver");

            String select="select * from employee";
            Statement statement=connection.createStatement();

            ResultSet rs= statement.executeQuery(select);

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
