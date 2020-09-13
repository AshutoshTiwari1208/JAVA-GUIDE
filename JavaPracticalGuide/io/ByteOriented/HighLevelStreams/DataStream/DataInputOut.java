import java.io.*;





class DataInputOut {

	public static void main(String args []) {

		// Implicit close() call demo

		try(
			FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\DataStream\\datainout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			FileInputStream fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\DataStream\\datainout.txt");
			DataInputStream din = new DataInputStream(fin); 
			){

			dout.writeUTF("Ashutosh");
			dout.writeInt(12);
			dout.writeInt(99);
			dout.writeDouble(324.234);

			System.out.println(din.readUTF());
			System.out.println(din.readInt());
			System.out.println(din.readInt());
			System.out.println(din.readDouble());

		}catch(FileNotFoundException e){
		
			e.printStackTrace();
		
		}catch(EOFException eof){
	
			System.out.println("Reached end of file");
	
		}catch(IOException ie){
		
			ie.printStackTrace();
	
		}
	}
}