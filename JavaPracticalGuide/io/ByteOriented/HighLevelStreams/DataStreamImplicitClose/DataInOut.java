import java.io.*;




class DataInOut {

	public static void main(String args []) {

		//	Data is Encrypted when using DataOutputStream !!
		//Decryption happens when we read it back !!

		DataOutputStream dout = null;
		FileOutputStream fout = null;
		FileInputStream fin = null;
		DataInputStream din = null;

		try{
		fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\datainout.txt");
		dout = new DataOutputStream(fout);
		dout.writeUTF("Ashutosh");
		dout.writeInt(23);
		dout.writeDouble(2332.2323);

		fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\datainout.txt");
		din = new DataInputStream(fin);

		System.out.println(din.readUTF());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());


		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
			dout.close();
			fout.close();	
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}
}