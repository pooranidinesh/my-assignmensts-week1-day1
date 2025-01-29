package learn1.week3d2;
import java.util.ArrayList;
import java.util.List;
public class Lintersection {
		public static void main(String[] args) {
			int l1[] = {3,2,11,4,6,7};
				int l2[] = {1,2,8,4,9,7};
				
				//List has been declared to store the values 
				List<Integer> list = new ArrayList<Integer>();
			
				//Nested Iteration loop has been created to iterate through the arrays
				for(int i=0; i<l1.length; i++) {
					
					for(int j =0; j<l2.length;j++ ) {
						
						//If conditional statement has been added to check if the values in both the arrays are matching
						if(l1[i]==l2[j]) {
							
							list.add(l1[i]);
						}
					}
					
				}
					
				System.out.println(list);

			}

		}


