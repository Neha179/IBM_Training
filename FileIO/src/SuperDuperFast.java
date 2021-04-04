import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SuperDuperFast {

	public static void main(String[] args) {
		FileInputStream ifile = null;
		FileOutputStream ofile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		// creating buffer in operaitng level
		try {
			ifile = new FileInputStream("D:/Desktop/python.exe"); //
			ofile = new FileOutputStream("D:/Desktop/p2.exe");
			inChannel = ifile.getChannel();
			outChannel = ofile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocateDirect(1024*16);
			System.out.println("Copying file");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;
				buffer.flip();
				outChannel.write(buffer);
				buffer.clear();
				
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

