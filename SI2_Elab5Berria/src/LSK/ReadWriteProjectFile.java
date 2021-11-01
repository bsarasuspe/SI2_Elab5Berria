package LSK;

public class ReadWriteProjectFile implements ReadWriteInterface{

	public String filePath;
	
	public ReadWriteProjectFile(String filePath){
		this.filePath=filePath;
	}
	
	
	public void loadFile(){
		System.out.println("file loaded from "+filePath);
	}
	
	public void storeFile(){
		System.out.println("file saved to "+filePath);
	}
}
