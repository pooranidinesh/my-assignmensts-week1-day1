package learn1.week3d1;

	public class javaconnection implements DatabaseConnection {
		
		public static void main(String[] args) {
			javaconnection conn=new javaconnection();
			conn.connect();
			conn.disconnect();
			conn.executeUpdate();
		
		}

		private void disconnect() {
			System.out.println("disconnected sucessfullly");
			// TODO Auto-generated method stub
			
		}
		
	}


