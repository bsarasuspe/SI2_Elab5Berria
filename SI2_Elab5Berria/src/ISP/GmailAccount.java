package ISP;

public class GmailAccount implements EmailSendable{
	
	String name, emailAddress;
	
	public void setName(String n) {
		name = n; 
	}

	 public void setEmail(String a) {
		 emailAddress = a; 
	 }

	@Override
	public String getEmail() {
		return emailAddress;
	}

}
