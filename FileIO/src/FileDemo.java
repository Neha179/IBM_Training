import java.io.File;
public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		String path ="D://dekho.txt.txt";
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
			if(file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());
				
			}
			else {
				System.out.println("Conetnt of directory");
				String[] contents = file.list();
				for (String f: contents)
					System.out.println(f);
			}
		}
		else
			System.out.println("File doesnt exist");
		
	}

}
