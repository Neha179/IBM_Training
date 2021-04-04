import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		FileInputStream ifile = null;
		FileOutputStream ofile = null;
		
		System.out.println("Copying file");
		try {
			ifile = new FileInputStream("D:/Desktop/python.exe"); //
			ofile = new FileOutputStream("D:/Desktop/p2.exe");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = ifile.read(); //reading a byte from the stream
				if(ch == -1)
					break;
				ofile.write(ch);
				
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in " + (ms2-ms1) + "ms");
		}
			
		catch(IOException e) {
				e.printStackTrace();
			}
		finally {
				try {
					ifile.close();
					ofile.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		
	}
}
