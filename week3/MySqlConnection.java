package homeassign.week3;

public abstract class MySqlConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("connect the database");
	}
	public void disconnect() {
		System.out.println("disconnect the database");
	}
	public void executeUpdate() {
		System.out.println("execute the database update");
	}
	public abstract void executeQuery();
		
		}
	


