import java.io.*;

class SequenceBuffer {

	public static void main(String args[]) {

		try(
			FileInputStream fin1= new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\SequenceBuffer\\demo1.txt");
			FileInputStream fin2= new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\SequenceBuffer\\demo2.txt");
			FileInputStream fin3= new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\SequenceBuffer\\demo3.txt");
			FileInputStream fin4= new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\SequenceBuffer\\demo4.txt");
			SequenceInputStream sin1 = new SequenceInputStream(fin1, fin2);
			SequenceInputStream sin2 = new SequenceInputStream(fin3, fin4);
			SequenceInputStream sin3 = new SequenceInputStream(sin1, sin2);
		){

			int a = sin3.read();

			while(a!=-1){
				System.out.print((char) a);

				a = sin3.read();
			}



		}catch(IOException ioe){
			ioe.printStackTrace();

		}

	}

}