package database;

public class MySql extends DataBase
{
	public void connect()
	{
		System.out.println("connected to MySql");
	}
	
	public void disconnect()
	{
		System.out.println("disconnected to MySql");
	}
}
