import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	private static ArrayList<Profile> profList = new ArrayList<Profile>();
	
	public static void main(String[] args) throws FileNotFoundException {

//		profList = (ArrayList<Profile>) deserData("Profiles");
//			System.out.println(profList.size());
//		Profile profile = new Profile();
//		profile.setName(JOptionPane.showInputDialog(null, "Enter your name: "));
//		profile.setSurname(JOptionPane.showInputDialog(null, "Enter your surname: "));
//		}
//			System.out.println(profList.size());
//		serData("Profiles", profList);
//			
	}

//	private static Object deserData(String file_name) {
//		Object returnObject = null;
//	
//		try {    
//			FileInputStream fileIn = new FileInputStream(file_name + ".ser");
//			try {
//				ObjectInputStream in = new ObjectInputStream(fileIn);
//				try {
//					returnObject = in.readObject();
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					System.out.println("Class not found.");
//					System.exit(3);
//					e.printStackTrace();
//				}
//				fileIn.close();
//				in.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error of entering-exit.");
//				System.exit(2);
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block 
//			System.out.println("File not found.");
//			System.exit(1);
//			e.printStackTrace();
//		}
//		return returnObject;
//	}
//ô
//	private static void serData(String file_name, Object obj) {
//		
//		try {    
//			FileOutputStream file = new FileOutputStream(file_name + ".ser");
//			try {
//				ObjectOutputStream out = new ObjectOutputStream(file);
//				out.writeObject(obj);
//				file.close();
//				out.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error of entering-exit.");
//				System.exit(2);
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File not found.");
//			System.exit(1);
//			e.printStackTrace();
//		}
//		
	//}

}
