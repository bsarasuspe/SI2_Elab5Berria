package LSK;

import java.util.Vector;

public class ProjectReadWrite implements ReadProjectInterface {

	public Vector<ReadWriteInterface> files=new Vector<ReadWriteInterface>();
	
	public void addProject(ReadWriteInterface p){
		files.add(p);
	}
	
	@Override
	public void loadAllFiles(){
		for (ReadWriteInterface f:files)
			f.loadFile();
	}
	
	public void storeAllFiles(){
		for (ReadWriteInterface f:files)
			f.storeFile();
	}
}
