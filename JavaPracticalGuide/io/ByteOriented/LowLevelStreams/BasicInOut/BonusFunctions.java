import java.io.*;


class BonusFunctions {

	public static void main(String args[]) {

		try {
		FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInOut\\fileInputOutput.txt");
		FileInputStream fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInOut\\fileInputOutput.txt");
		

		String insert = "My name is Ashutosh";
		fout.write(insert.getBytes());

		int x;

		byte arr[] = new byte[100];


		//These methods are given by Input Stream Class (Parent Class)
		//===> fin.skip(4): 	To Skip 4 Characters
		//===> fin.available(): To get no. of Bytes Remaining
	

		//====> To read data into byte array
		fin.read(arr);
		for(byte w: arr) {
			System.out.print((char)w);
		}

		//====> start from 3 and read 5 bytes
		fin.read(arr, 3, 5); 
		for(byte w: arr) {
			System.out.print((char)w);
		}


		fin.close();
		fout.close();

	}catch(IOException err){
		err.printStackTrace();
	}
	}
}