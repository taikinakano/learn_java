package chapter18;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main18_4 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		String dburl = "jbdc:h2:~/test";
		String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
		Connection conn = DriverManager.getConnection(dburl);
		conn.createStatement().executeUpdate(sql);
		conn.close();
	}
}
