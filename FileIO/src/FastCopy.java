import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {

	public static void main(String[] args) {
		FileInputStream ifile = null;
		FileOutputStream ofile = null;
		BufferedInputStream iBuffer = null;
		BufferedOutputStream oBuffer = null;
		iBuffer = new BufferedInputStream(ifile, 1024*16);
		oBuffer = new BufferedOutputStream(ofile, 1024*16);
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

