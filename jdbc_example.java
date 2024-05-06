import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class jdbc_example {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ansh","pass"); 

            Statement smt=(Statement) con.createStatement();
            ((java.sql.Statement) smt).executeUpdate("create table op(rollno number, name varchar2(20))");

            System.out.println("table created succesfully");

            con.close();

        }
        catch(Exception e){

            System.out.println(e);

        }
    }
    
}
