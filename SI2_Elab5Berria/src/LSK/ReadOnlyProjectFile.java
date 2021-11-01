package LSK;

public class ReadOnlyProjectFile implements ProjectFile {

	public String filePath;
	
	public ReadOnlyProjectFile(String filePath){
		this.filePath=filePath;
	}
	
	@Override
	public void loadFile() {
		System.out.println("file loaded from "+filePath);
	}

	public void storeFile() {
		// TODO Auto-generated method stub
		
	}
}

