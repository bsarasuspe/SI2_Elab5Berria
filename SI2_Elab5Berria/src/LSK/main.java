package LSK;

public class main {

	public static void main(String[] args) {
		
		ProjectInterface p = new ProjectReadWrite();
		ReadWriteProjectFile f1 = new ReadWriteProjectFile("SI");
		ReadOnlyProjectFile f2 = new ReadOnlyProjectFile("PKE");
		ReadWriteProjectFile f3 = new ReadWriteProjectFile("WS");
		
		p.addProject(f1);
		p.addProject(f2);
		p.addProject(f3);
		
		p.loadAllFiles();
		((ProjectReadWrite) p).storeAllFiles();
	}

}
