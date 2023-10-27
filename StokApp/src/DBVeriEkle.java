import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBVeriEkle {
	static void ekle() {
		String path = "jdbc:mysql://localhost:3306/urunler";
		String dbUser = "root";
		String dbPassWord = "3249";
		
		String[] veriler = null ;
		
		try {
			Connection conn = DriverManager.getConnection(path, dbUser, dbPassWord);
			 PreparedStatement statement = conn.prepareStatement("INSERT INTO urunler  VALUES (?, ?)");
			 for (String data : veriler ) {
	                
	                statement.addBatch();
	            }

	            int[] affectedRows = statement.executeBatch();

	            System.out.println(affectedRows.length + " kayıt eklendi.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
