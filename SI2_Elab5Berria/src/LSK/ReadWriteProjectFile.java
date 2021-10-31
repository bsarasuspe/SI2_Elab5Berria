package LSK;

public class ReadWriteProjectFile implements ProjectFile {

	public String filePath;
	
	public ReadWriteProjectFile(String filePath){
		this.filePath=filePath;
	}
	
	@Override
	public void loadFile(){
		System.out.println("file loaded from "+filePath);
	}
	
	public void storeFile(){
		System.out.println("file saved to "+filePath);
	}
}
