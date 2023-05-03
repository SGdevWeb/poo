package rpg;

import java.sql.*;
import java.util.Scanner;

public class SQL {

    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("Le driver n'a pas été trouvé !");
            System.exit(1);
        }
        Connection conn = null;
        Scanner scan = new Scanner(System.in);
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://mysql.snx.ovh/poejava_2",
                    "poejava_2",
                    "poejava"
            );
            System.out.println("Connection réussie");
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM city WHERE city_id = ?"
            );
            stmt.setInt(1,scan.nextInt());
            ResultSet resultat = stmt.executeQuery();
            while(resultat.next())
                System.out.println(resultat.getString("city"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null){
                conn.close();
            }
        }
    }

}
