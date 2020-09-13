import java.io.*;
import java.util.*;

 class FileReaderDemo {

 	public static void main(String args[]) {

 		try(
 			FileWriter fwr = new FileWriter("F:\\Sites\\JavaPracticalGuide\\io\\CharOriented\\BasicReaderWriter\\fileText.txt");
 			FileReader fre = new FileReader("F:\\Sites\\JavaPracticalGuide\\io\\CharOriented\\BasicReaderWriter\\fileText.txt"); 
 		){

 			for(char ch = 'A'; ch<'Z'; ch++){
 				fwr.write(ch);
 			}

 			//Important to close as otherwise the content won't be written and you will be reading it //
 			fwr.close();

 			System.out.println(fre.read());
 			System.out.println(fre.read());


 		}catch(IOException e) {
 			e.printStackTrace();
 		}

 	}

 }