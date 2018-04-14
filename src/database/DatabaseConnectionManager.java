package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
	
	private Connection conn;
	
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	public static DatabaseConnectionManager getManagerInstance() {
		System.out.println("DbConnectionGot");
		return connectionInstance;
	}
	public void connect() throws SQLException {
		conn = DriverManager.getConnection("Some/Database/Url");
		System.out.println("connected");
	}
	public Connection getConnectionObject() {
		System.out.println("connection object");
		return conn;
	}
	public void disconnect() {
		System.out.println("disconnected");
	}
}
