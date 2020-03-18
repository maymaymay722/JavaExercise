import java.io.*;

public class FileDemo{
	static int level;
	
	public static void main(String[] args) throws IOException{
		File file=new File("D:\\代码");
		parseFile(file);
	}
	
	public static void parseFile(File file){
		if(file == null || !file.exists()){
			return;
		}
		level++;
		
		File[] files=file.listFiles();
		for(File f:files){
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}

			System.out.println(f.getName());
			if(f.isDirectory()){
				parseFile(f);
			}
		}
		level--;
	}
}