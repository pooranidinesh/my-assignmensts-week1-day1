package learn1.week3d2;
	

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SortingCollection {

		public static void main(String[] args) {

			//List has been declared and elements has been added 
			List <String> collection = new ArrayList<String>();
		    collection.add("HCL");
		    collection.add("Wipro");
		    collection.add("Aspire Systems");
		    collection.add("CTS");
		    
		    //The List has been sorted in ascending order
		  Collections.sort(collection);
		    
		  //Size of the ArrayList has been found
		  int sizeOfCollection = collection.size();
		  System.out.println(sizeOfCollection);
		  
		  //The List has been iterated and printed in Reverse Order
		  for(int i= sizeOfCollection-1; i>=0 ; i-- ) {
			  
			  System.out.println(collection.get(i));
		  }
		    
			
			
		}

	}


