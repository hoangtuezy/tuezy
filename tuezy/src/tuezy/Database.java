package tuezy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Database instance =new Database();
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/source?useUnicode=true&characterEncoding=utf-8";
	static String username="root";
	static String password="";
	 private static Connection con;
	private Database(){}

	public static Database getDatabase() {
		return instance;
	}


	public synchronized Connection getConnection() throws ClassNotFoundException {
		if(con==null) {
			try {
				Class.forName(driver);
				con=DriverManager.getConnection(url, username, password);
			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			if(con.isClosed()){
				Class.forName(driver);
				con=DriverManager.getConnection(url, username, password);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

//	public static Connection getConnection() {
//			try {
//				Class.forName(driver);
//				con=DriverManager.getConnection(url, username, password);
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return con;
//			
//		
//			
//}
//	public static synchronized Database getDatabase(){
//	if(instance==null) 
//	instance = new Database();	
//	return instance;
//	
//}
}
