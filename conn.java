import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conn {

    // JDBC URL, username, and password of Oracle database server
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:your_oracle_sid";
    private static final String USER = "ansh";
    private static final String PASSWORD = "pass";

    public static void main(String[] args) {
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Perform database operations
            executeDatabaseOperations(connection);

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeDatabaseOperations(Connection connection) throws SQLException {
        // Example: select data from a table
        String query = "SELECT * FROM STUDENT1";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                // Process the results
                int column1Value = resultSet.getInt("ROLLNO");
                String column2Value = resultSet.getString("NAME");

                System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
            }
        }
    }
}
