package ISP;

public class main {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Eki");
		p.setAddress("Donostia");
		p.setEmail("ekimendibil@ehu.eus");
		p.setTelephone("658390219");
		
		EmailSender email = new EmailSender();
		email.sendEmail(p, "Email bat da hau.");
		
		SMSSender sms = new SMSSender();
		sms.sendSMS(p, "SMS bat da hau.");
		
		GmailAccount g = new GmailAccount();
		g.setName("Eki");
		g.setEmail("ekimendibil@ehu.eus");
		email.sendEmail(g, "SMS bat da hau, GmailAccount erabilita.");
	}

}
