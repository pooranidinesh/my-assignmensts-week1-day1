package learn1.week3d2;

public class APIClient {


	
	//Addition Function
	
	public void sendRequest(String endpoint) {
	System.out.println(endpoint);
      
	}
	
	public void sendRequest(String endpoint,String requestBody, String requestStatus) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);

	}
	
	
	
	public static void main(String[] args) {
		APIClient cli=new APIClient();
		cli.sendRequest("created");
		cli.sendRequest("created" , "requestBody" , "requestStatustrue");
		
	}

}



