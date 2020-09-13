import java.io.*;

class ScannerAlter {

	public static void main(String args[] ){ 

		try{

			StringBuffer sb = new StringBuffer(1000);
			
			int x=1;
			while(x != 13){
				x = System.in.read();
				sb.append((char)x);
			}

			System.out.println(sb);


		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}


}