package LSK;

public class main {

	public static void main(String[] args) {
		
		ReadProjectInterface p = new ProjectReadWrite();
		ProjectInterface p2= new ProjectReadOnly();
		
		ReadWriteProjectFile f1 = new ReadWriteProjectFile("SI");
		ReadOnlyProjectFile f2 = new ReadOnlyProjectFile("PKE");
		ReadWriteProjectFile f3 = new ReadWriteProjectFile("WS");
		
		p.addProject(f1);
		p2.addProject(f2);
		p.addProject(f3);
		
		p.loadAllFiles();
		p.storeAllFiles();
		//((ProjectReadWrite) p).storeAllFiles();
	}

}