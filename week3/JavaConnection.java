package homeassign.week3;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		
	JavaConnection exe=new JavaConnection();
	exe.connect();
	exe.disconnect();
	exe.executeUpdate();
	exe.executeQuery();
	

	}
public void executeQuery() {
	System.out.println("execute the query ");
}
}
