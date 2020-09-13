import java.io.*;
import java.util.*;

class InputOutputEx {

	public static void main(String args []) throws IOException {


		FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\FileInputOutput\\inoutex.txt", true);

		Scanner cin = new Scanner(System.in);

		String name;
		System.out.println("Enter your name : ");
		name = cin.nextLine();

		int age;
		System.out.println("Enter your age : ");
		age = cin.nextInt();

		double salary;
		System.out.println("Enter your Salary");
		salary  = cin.nextDouble();

		// write(byte arr[]);
		fout.write(name.getBytes());
		fout.write(10);
		fout.write(String.valueOf(age).getBytes());
		fout.write(10);
		fout.write(String.valueOf(salary).getBytes());
		fout.write(10);

		//Mind it, above dataTypes are lost! Can you revert back salary in double? NO

		FileInputStream fin  = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\FileInputOutput\\inoutex.txt");

		int x;
		try{
			while(true) {

				x= fin.read();
				if(x == -1){
					break;
				}

				System.out.print((char)x);
			}
		}finally{
			fin.close();
			fout.close();
		}
	
	}
}