import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	
	public static void main(String[] args) throws IOException{
		File file=new File("D:\\代码");
		parseFile(file);
	}
	
	public static void parseFile(File file){
		if(file == null || !file.exists()){
			return;
		}
		
		File[] files=file.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				parseFile(f);
			}else{
				f.delete();
			}
		}
		file.delete();
	}
}