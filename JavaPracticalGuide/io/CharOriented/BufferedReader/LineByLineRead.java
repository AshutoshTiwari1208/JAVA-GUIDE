import java.io.*;

class LineByLineRead {

	public static void main(String args[]) {

		try(
			FileReader fre= new FileReader(new File(System.getProperty("user.dir"), "textStore.txt"));
			BufferedReader bre = new BufferedReader(fre);
		){

		while(true){
			String alpha = bre.readLine();
			if(alpha == null){
				break;
			}
			System.out.println(alpha);
			// System.out.println(bre.readLine());
			// System.out.println(bre.readLine());
		}




		}catch(IOException ioe) {
			ioe.printStackTrace();
		}










	}

}