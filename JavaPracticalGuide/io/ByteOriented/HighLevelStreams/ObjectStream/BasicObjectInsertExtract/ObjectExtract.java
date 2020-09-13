import java.io.*;

class ObjectExtract  {

	public static void main(String args[]){

		try(
			FileInputStream fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\ObjectStream\\BasicObjectInsertExtract\\objectStore.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			){

			// oout.writeObject(per);

			
		Person ob = (Person)oin.readObject();
			ob.getDetails();
			System.out.println(ob.save);

		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException fnf){
			fnf.printStackTrace();
		}
	
	}
}