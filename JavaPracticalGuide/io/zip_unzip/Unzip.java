import java.io.*;
import java.util.zip.*;


class Unzip {

	public static void main(String str[] ){

		File zippedFile = new File(System.getProperty("user.dir"), "outputZipped");
		File outputFile = new File(System.getProperty("user.dir"), "unzipped.txt");



		try(
			FileInputStream fin = new FileInputStream(zippedFile);
			InflaterInputStream dein = new InflaterInputStream(fin);
			FileOutputStream fout = new FileOutputStream(outputFile);
		){

			while(true) {
				int x = dein.read();
				if(x==-1){
					break;
				}
				fout.write((char) x);
			}




		}catch(IOException ioe){
			ioe.printStackTrace();
		}





	}
}