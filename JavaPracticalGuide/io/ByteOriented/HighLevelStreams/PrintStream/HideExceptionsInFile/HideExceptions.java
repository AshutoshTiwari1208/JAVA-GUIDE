import java.io.*;
import java.util.*;

class HideExceptions  {


	public static void main(String args[] ){

		FileOutputStream fout = null;
		PrintStream pout = null;

		try {
			fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\PrintStream\\HideExceptionsInFile\\exceptionOccured.txt", true);
			pout = new PrintStream(fout);

			int a = Integer.parseInt(args[0]); // Single byte input from Keyboard (in buffer obj points to Keyboard)
			int b = Integer.parseInt(args[1]);
			int c = a/b;

			// System.in.read() will read only 1 byte //
			System.out.println("A is"+ a);
			System.out.println("B is"+ b);

			System.out.println("Value is ==> "+c);
		}catch(Exception  e) {

			java.util.Date date = new java.util.Date(System.currentTimeMillis());
			pout.println(date.toString());
			System.setErr(pout); // now monitor ref is removed from err and our file is set!
			e.printStackTrace(); // calls System.err.print(); 
			// err is seperate from out so to prevent clash from out while multithreading....
		}


	}
}