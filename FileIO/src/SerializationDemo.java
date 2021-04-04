import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person("Neha", 22);
		System.out.println(p);
		
		String path = "src/pers.dat";
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;
		
		//serialization code
		ostream = new ObjectOutputStream(new FileOutputStream(path));
		ostream.writeObject(p);
		ostream.close();
		System.out.println("Object Serialised...");
		
		//de
		istream = new ObjectInputStream(new FileInputStream(path));
		Object obj = istream.readObject();
		System.out.println(obj);
		istream.close();
		

	}

}
