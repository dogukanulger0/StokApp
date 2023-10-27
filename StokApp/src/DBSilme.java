import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBSilme {
	static void sil() {
		String path = "jdbc:mysql://localhost:3306/urunler";
		String dbUser = "root";
		String dbPassWord = "3249";
		
		 try {
			 Connection conn = DriverManager.getConnection(path, dbUser, dbPassWord);
			 Statement statement = conn.createStatement() ;
		            String sql = "DELETE FROM urunler";
		            int affectedRows = statement.executeUpdate(sql);
		            if (affectedRows > 0) {
		                System.out.println("Veri silindi.");
		            } else {
		                System.out.println("Veri bulunamadı veya silinemedi.");
		            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
