package com.fashi.constants;

public class DBConfiguration {
	public class DbConfiguration {
		 
	    public static final String HOST_NAME = "remotemysql.com";
	    public static final String DB_NAME = "GAY4DNCVEB";
	    public static final String DB_PORT = "3306";
	    public static final String USER_NAME = "GAY4DNCVEB";
	    public static final String PASSWORD = "QBGsvaSscl";
	    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	    public static final int DB_MIN_CONNECTIONS = 2;
	    public static final int DB_MAX_CONNECTIONS = 4;
	    public static final String CONNECTION_URL = "jdbc:mysql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;
	     
	    private DbConfiguration() {
	        super();
	    }
	}
}