package textfiles;
import java.io.IOException;
import java.util.Random;

public class FileData {
	public static void main(String[ ] args) throws IOException {
		String file_name="C:\\Users\\Vinzent\\workspace\\read a file!\\src\\unifiedBank.txt";
	
		try{
			ReadFile file= new ReadFile (file_name);
			String[]aryLines=file.OpenFile();	
			
			
			Random randx = new Random();
			Random randy = new Random();
			Random randz = new Random();
			int valuex= randx.nextInt(59-3)+1+3;
			int valuey= randy.nextInt(86-63)+1+63;
			int valuez= randz.nextInt(111-90)+1+90;
			
			System.out.println("We need "+ aryLines[valuex].toLowerCase()+ " to " + aryLines[valuey].toLowerCase()
					+" the "+ aryLines[valuez].toLowerCase()+".") ;
			
		}
		catch (IOException e){
			System.out.println(e.getMessage());
			
			
		}
	}
}
