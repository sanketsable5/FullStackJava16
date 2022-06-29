package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStatement {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java14oct", "root", "Root@123");

            String insert = "insert into employee (id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

//            for (int i = 1; i < 10; i++) {
//                PreparedStatement.setInt(1, i);
//                PreparedStatement.setString(2, "name " + i);
//                PreparedStatement.setString(3, "address " + i);
//                PreparedStatement.addBatch();
//
//            }
            int[] i = preparedStatement.executeBatch();
            System.out.println("Record inserted=>" + i.length);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
