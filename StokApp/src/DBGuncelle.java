import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBGuncelle {
	static void guncelle() {

		String path = "jdbc:mysql://localhost:3306/urunler";
		String dbUser = "root";
		String dbPassWord = "3249";

		try {
			Connection conn = DriverManager.getConnection(path, dbUser, dbPassWord);

			String sql = "UPDATE urunler SET * from";

			Statement statement = conn.createStatement();

			int affectedRows = statement.executeUpdate(sql);

			System.out.println("Toplam " + affectedRows + " kayıt güncellendi.");

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
