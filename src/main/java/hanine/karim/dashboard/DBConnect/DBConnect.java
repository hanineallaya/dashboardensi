package hanine.karim.dashboard.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect
{
    private static final String DATABASE_DRIVER = "org.h2.Driver";
    private static final String DATABASE_CONNECTION = "jdbc:h2:tcp://localhost/~/test";
    private static final String DATABASE_USER = "datawoman";
    private static final String DATABASE_PASSWORD = "hellothere";

    public static void main(String[] args)
    {

        createDBTable();
    }

    public static void createDBTable()
    {

        String CreateSQLQuery = "CREATE TABLE IDENTITY (LoginID integer auto_increment primary key, "
                + "                                DisplayName varchar(100), "
                + "                                FirstName varchar (100),  "
                + "                                LastName varchar(100), "
                + "                                Email varchar(100),"
                + "                                Function varchar(10))";


        Connection connection = getDBConnection();

        try
        {

            connection.setAutoCommit(false);


            Statement statement = connection.createStatement();


            statement.execute(CreateSQLQuery);



            statement.close();


            connection.commit();

        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }

        System.out.println("Successfully Created Identity Table!");

    }


    private static Connection getDBConnection()
    {

        Connection H2DBConnection = null;

        try
        {
            Class.forName(DATABASE_DRIVER);
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.toString());
        }
        try
        {
            H2DBConnection = DriverManager.getConnection(DATABASE_CONNECTION, DATABASE_USER, DATABASE_PASSWORD);

            return H2DBConnection;
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }

        return H2DBConnection;
    }
}