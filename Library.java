//package week2.day1;

public class Library {
		//Phone -makeCall, sendSms, takePhoto
		
		public void addBook(String testlef) {
			System.out.println("\"Book added successfully");
            return ;
		}
		
	    public void issueBook() {
			System.out.println("\"Book issued successfully");
		}
		
		
		public static void main(String[] args) {
			Library obj=new Library();
			obj.addBook("testlef");
			obj.issueBook();
			
		}
		
		}


