package EjemplosBotones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseLayer
{
	private String sql;
	private Connection conn;
	private Statement stm;
	private String server= "localHost";
	private String db="progra3";
	private String user="root";
	private String pwd="morado10";
	private ResultSet rs;
	
	public DatabaseLayer()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://"+server+"/"+db,user,pwd);
			if(conn!=null)
			{
				System.out.println("coneccion establecida");
			}
			else
			{
				System.out.println("coneccion fallida");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isConnnected(){
		
		try {
			return !conn.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void queryEcex(String sql){
		try {
			stm= conn.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ResultSet resultQueryExec(String sql)
	{
		try {
			rs=stm.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	
	
}
