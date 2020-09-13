import java.io.*;
import java.util.*;
import java.util.zip.*;

class Zip {

	public static void main(String str []) {

		/*
		* @inputFile is file to be compressed.
		* @outputZipped file will be created after running this program.
		*/

		File inputFile = new File(System.getProperty("user.dir"), "textStore.txt");
		File outputFile = new File(System.getProperty("user.dir"), "outputZipped");

		try(
			FileInputStream fin = new FileInputStream(inputFile);
			FileOutputStream fout = new FileOutputStream(outputFile);
			DeflaterOutputStream dout = new DeflaterOutputStream(fout);
		){
			int x;
			while(true){
				x=fin.read();
				if(x== -1){
					break;
				}
				dout.write((char)x);
			}

		}catch(IOException ioe){

			ioe.printStackTrace();
		}

	}
}