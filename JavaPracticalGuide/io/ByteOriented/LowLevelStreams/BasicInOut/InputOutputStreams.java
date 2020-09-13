import java.io.*;


class InputOutputStreams {

	public static void main(String args[]) {

//-128 -> 127
		try {
		FileOutputStream fout = new FileOutputStream("F:\\Sites\\java Guide\\JavaPracticalGuide\\io\\fileInputOutput.txt");


		for(int i=-127;i<500;i++){

			fout.write(i);
			fout.write(10);
		}

		FileInputStream fin = new FileInputStream("F:\\Sites\\java Guide\\JavaPracticalGuide\\io\\fileInputOutput.txt");
		int x;

		while(true){ 

			x = fin.read();

			if(x== -1) {
				break;
			}
			System.out.println((char)x);
		}

		fin.close();
		fout.close();

	}catch(IOException err){
		err.printStackTrace();
	}
	}
}