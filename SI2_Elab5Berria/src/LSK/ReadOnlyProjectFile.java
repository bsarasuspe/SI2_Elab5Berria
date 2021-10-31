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

	@Override
	public void storeFile() {
		// TODO Auto-generated method stub
		
	}
}

