import java.io.*;



class ReadingMulFiles {

	public static void main(String args []){

		try(
			FileInputStream fin1 = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInputOutput\MultipleFillesRead\\demo1.txt");
			FileInputStream fin2 = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInputOutput\MultipleFillesRead\\demo2.txt");
			FileInputStream fin3 = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInputOutput\MultipleFillesRead\\demo3.txt");
			FileInputStream fin4 = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\LowLevelStreams\\BasicInputOutput\MultipleFillesRead\\demo4.txt");
			){


			int x=0;
			while(true){
				x=fin1.read();

				if(x == -1){
					break;
				}
				System.out.print((char)x);
			}
			System.out.println();

			while(true){
				x=fin2.read();

				if(x == -1){
					break;
				}
				System.out.print((char)x);
			}
			System.out.println();

			while(true){
				x=fin3.read();

				if(x == -1){
					break;
				}
				System.out.print((char)x);
			}
			System.out.println();

			while(true){
				x=fin4.read();

				if(x == -1){
					break;
				}
				System.out.print((char)x);
			}
			System.out.println();


		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}