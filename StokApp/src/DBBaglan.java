import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBBaglan {
	static ResultSet baglan() {

		String path = "jdbc:mysql://localhost:3306/urunler";
		String dbUser = "root";
		String dbPassWord = "3249";

		Connection conn;
		Statement st;
		PreparedStatement pst;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(path, dbUser, dbPassWord);
			if (conn != null) {
				String sql = "select * from urunler";
				st = conn.createStatement();
				rs = st.executeQuery(sql);
				while (rs.next()) {
					String id = rs.getString("id");
					String urun_kodu = rs.getString("urun_kodu");
					String urun_tanimi = rs.getString("urun_tanimi");
					String urun_tipi = rs.getString("urun_tipi");
					String aciklama = rs.getString("aciklama");
					String malzeme_turu = rs.getString("malzeme_turu");
					String tedarik_tipi = rs.getString("tedarik_tipi");
					String olcu_birimi = rs.getString("olcu_birimi");
					String depo = rs.getString("depo");

					System.out.println(id + " " + urun_kodu + " " + urun_tanimi + " " + urun_tipi + " " + aciklama + " "
							+ malzeme_turu + " " + tedarik_tipi + " " + olcu_birimi + " " + depo);
				}

			} else {
				System.out.println("BAĞLANTI BAŞARISIZ!!!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rs ;

	}
}
