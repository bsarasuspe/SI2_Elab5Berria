package DIP;

public class main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Deduction d1 = new Deduction();
		Preconditions p1 =  new Preconditions();
		SubjectQuotes sq1 = new SubjectQuotes();
		
		s1.setDeduction(d1);
		s1.setPrecondition(p1);
		s1.setSubjectQuotes(sq1);
		
		s1.register("Matematika");
	}
}
