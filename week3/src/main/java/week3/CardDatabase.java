package week3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardDatabase 
implements IDatabase<Card>{

	private static final String DB_Name = "cards.dat";
	
	public boolean save(Card item) {
		boolean success = false;
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(DB_Name)
					);
			oos.writeObject(item);
			oos.flush();
			success = true;
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			   if(oos != null)oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public Card readFirstRecord() {
		Card data = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(
					new FileInputStream(DB_Name)
					);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}

	

