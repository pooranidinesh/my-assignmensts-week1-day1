package learn1.week3d1;

public interface DatabaseConnection{
	
	     public default void connect() {
	    	 System.out.println("databsae connected successfully");
	     }
		
	     public static void disconnect()  {
			System.out.println("disconnected sucessfullly");
		}
		
		 public default void executeUpdate() {
			System.out.println("executed updated query");
		}

	}

	



