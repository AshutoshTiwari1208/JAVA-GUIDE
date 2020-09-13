import java.io.*;

class LineByLineRead {

	public static void main(String args[]) {

		try(
			/*
			 * System.in (Keyboard ref buffer is of type byte oriented)
			 * V changed it to CharOriented using BridgeClass- InputStreamReader
			 * Input Stream reader constructor accepts parent class so any Input Class can be sent
			 * Here System.in -> in is of type PrintStream(InputStream)
 			 */
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bre = new BufferedReader(isr);
		){

			while(true){
				String alpha = bre.readLine();
				if(alpha.equals("exit")){
					break;
				}
				System.out.println(alpha);
			}

		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}
}