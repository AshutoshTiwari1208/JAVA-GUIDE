import java.io.*;

class  PrintWithSleep {

	public static void main(String args []) throws InterruptedException {

		try(
			FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\PrintStream\\printWithSleep.txt");
			PrintStream pout = new PrintStream(fout);
		){
			int i=40;
			while(i>0){

				// Autoflush
				pout.println("Hey -> "+ i);
				Thread.sleep(600);
				i--;

			}

			pout.close();
			fout.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}


	}
}