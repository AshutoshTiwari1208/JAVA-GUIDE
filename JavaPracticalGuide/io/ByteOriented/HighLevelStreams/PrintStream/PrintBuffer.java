import java.io.*;

class Rect { 

	int length = 10;
	int breadth = 20;

	void setParams(int length, int breadth) {
		this.length = length;
		this.breadth  = breadth;
	}

	//function called when we pass Object in print()
	public String toString(){
		return String.valueOf(this.length * this.breadth);
	}
}


class PrintBuffer { 

	public static void main(String args[]) {



		// =====> PrintStream is child of OutputStream
		// =====> Here we won't give file for input, rather it will come from keyboard
		try(
			FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\PrintStream\\printStream.txt");
			PrintStream pout = new PrintStream(fout);
			FileInputStream fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\PrintStream\\printStream.txt");
		){
			
			// print&println accepts any type of value -> ?How => Overloading
			pout.println("Hello there by Print Stream");
			pout.print("Hey line 1: ");
			pout.print("Hey line 2: ");
			pout.print(false);
			pout.print(232.2132);
			// PrintStream works on "Autoflushing" mode - as soon as data comes, write it in sink.

			pout.println();
			Rect rec = new Rect();
			pout.println(rec);
		

			// Just to prove it's still in bytes //
			int x = fin.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fin.read();
			}

		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}
}