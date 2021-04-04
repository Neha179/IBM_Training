import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String path = "D://dekho.txt.txt";
		BufferedWriter w = null;
		try {
			w = new BufferedWriter(new FileWriter(path));
			w.write("I AM HIGH ON RELIVING ");
			w.newLine();
			w.write(" Girl you're thirsty ");
			w.newLine();
			System.out.println("Writing to fie completed . ");
			
		} catch(IOException e){
			e.printStackTrace();
			
		} finally {
			try {
				if (w != null)
					w.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
