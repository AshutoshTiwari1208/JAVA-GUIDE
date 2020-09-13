import java.io.*;


class OutRefChange  {

	public static void main(String args[] ){

		try(
			FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\PrintStream\\OutBufferRefChange\\outStore.txt");
			PrintStream pout = new PrintStream(fout);
		){

			// System.out is of PrintStream type so keeping it's reference //
			PrintStream temp = System.out;
			System.setOut(pout); // Changing out's reference //

			System.out.println("Hey this is coming from Java App");


			System.setOut(temp);

			System.out.println("Yeah, we gave desktop ref back to out in System!! (It's of PrintStream type)");



		}catch(IOException ioe){
			ioe.printStackTrace();

		}



	}
}