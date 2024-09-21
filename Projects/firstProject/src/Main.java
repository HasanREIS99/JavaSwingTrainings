import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/car?user=root&password=2001hasan");
        Statement st = connection.createStatement();

        Scanner scanner = new Scanner(System.in);

      /*  System.out.println("Araba Modeli giriniz:");
        String model = scanner.nextLine();

        System.out.println("Araba yılını giriniz:");
        int year = scanner.nextInt();

        String query = "INSERT INTO cars (cars_model,cars_year) VALUES ('BMW',2023)";
        String query2 = "INSERT INTO cars (cars_model,cars_year) VALUES ('" + model + "',"+year+")";

        int result = st.executeUpdate(query2);
        System.out.println(result);
        st.close();

        String query3 = "INSERT INTO cars (cars_model,cars_year) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query3);
        preparedStatement.setString(1,"Fiat");
        preparedStatement.setInt(2,2020);
        preparedStatement.executeUpdate();
        preparedStatement.close();


        15 ABP 658
        18991367330
        Muhammed Karasoy

       */

        ResultSet resultSet = st.executeQuery("SELECT * FROM cars");

        while (resultSet.next()){
            System.out
                    .println(resultSet.getInt("cars_id")+"-"+resultSet.getString("cars_model")+"-"+resultSet.getString("cars_year"));
        }
    }
}