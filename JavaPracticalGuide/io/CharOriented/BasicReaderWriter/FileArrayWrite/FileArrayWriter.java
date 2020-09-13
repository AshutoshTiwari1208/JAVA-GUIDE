import java.io.*;
import java.util.*;


class FileArrayWriter {


	public static void main(String args[]) {

		File file = new File(System.getProperty("user.dir"), "fileStore.txt");
			
		try(
			FileReader fin = new FileReader(file);
			FileWriter fout = new FileWriter(file, true);
		){
			String alpha;
			System.out.println("Please Enter Name to save in file : ");
			Scanner cin  = new Scanner(System.in);
			
			alpha = cin.nextLine();

			fout.write(alpha);

			fout.close();

			while(true){
				int x = fin.read();
				if(x == -1){
					break;
				}
				System.out.println((char) x);
			}

		}catch(IOException ioe) {

			ioe.printStackTrace();
		}



	}


}
