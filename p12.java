import java.sql.*;

public class p12 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpp","root","");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("show tables");

            while (rs.next()) System.out.println(rs.getString(1));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
