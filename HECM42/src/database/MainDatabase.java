package database;

import java.util.Scanner;
public class MainDatabase
{
	public static void main(String[] args)
	{
		boolean oracleConnectFlag = false;
		boolean oracleDisconnectFlag = false;
		
		boolean db2ConnectFlag = false;
		boolean db2DisconnectFlag = false;
		
		boolean mysqlConnectFlag = false;
		boolean mysqlDisconnectFlag = false;
		toConnectToDisconnect(oracleConnectFlag,oracleDisconnectFlag,db2ConnectFlag,db2DisconnectFlag,mysqlConnectFlag,mysqlDisconnectFlag);
	}
	public static void toConnectToDisconnect(boolean oracleConnectFlag,boolean oracleDisconnectFlag,boolean db2ConnectFlag,boolean db2DisconnectFlag,boolean mysqlConnectFlag,boolean mysqlDisconnectFlag)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1.oracle\n2.d2b\n3.mysql\n4.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
		switch (choice)
		{
		      
		case 1: Oracle o = new Oracle();
				System.out.println("press 1 to connect to oracle database\npress 2 to disconnect to oracle database");
				System.out.println("enter your choice");
				int pick1 = sc.nextInt();
				
				switch(pick1)
				{
				case 1: 
					if (!oracleConnectFlag)
					{
					o.connect();
					oracleConnectFlag = true;
					oracleDisconnectFlag = true;
					break;
					}
					else
					{
						System.out.println("oracle is already connected");
						break;
					}
				case 2:
					if(oracleDisconnectFlag)
					{
						o.disconnect();
						oracleConnectFlag = false;
						oracleDisconnectFlag = false;
						break;
					}
					else
					{
						System.out.println("oracle is no not yet connected");
						break;
					}
					default :System.out.println("please check your option");
					         break;
				}
				break;
				
		case 2: DB2 d = new DB2();
				System.out.println("press 1 to connect to db2 database\npress 2 to disconnect to db2 database");
				System.out.println("enter your choice");
				int pick2 = sc.nextInt();
				
				switch(pick2)
				{
				case 1: 
					if (!db2ConnectFlag)
					{
					d.connect();
					db2ConnectFlag = true;
					db2DisconnectFlag = true;
					break;
					}
					else
					{
						System.out.println("db2 is already connected");
						break;
					}
				case 2:
					if(db2DisconnectFlag)
					{
						d.disconnect();
						db2ConnectFlag = false;
						db2DisconnectFlag = false;
						break;
					}
					else
					{
						System.out.println("db2 is no not yet connected");
						break;
					}
				default :System.out.println("please check your option");
						break;
					
				}
				break;
		case 3: MySql m = new MySql();
				System.out.println("press 1 to connect to oracle database\npress 2 to disconnect to oracle database");
				System.out.println("enter your choice");
				int pick3 = sc.nextInt();
				
				switch(pick3)
				{
				case 1: 
					if (!mysqlConnectFlag)
					{
					m.connect();
					oracleConnectFlag = true;
					oracleDisconnectFlag = true;
					break;
					}
					else
					{
						System.out.println("mysql is already connected");
						break;
					}
				case 2:
					if(mysqlDisconnectFlag)
					{
						m.disconnect();
						oracleConnectFlag = false;
						oracleDisconnectFlag = false;
						break;
					}
					else
					{
						System.out.println("mysql is no not yet connected");
						break;
					}
				default :System.out.println("please check your option");
						break;
				}
				break;
		case 4:System.exit(0);
		
			}
		
		}
	}
}
