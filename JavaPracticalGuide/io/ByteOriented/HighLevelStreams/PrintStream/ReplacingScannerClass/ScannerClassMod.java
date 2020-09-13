import java.io.*;

class MyScanner  {

	private InputStream in;

	MyScanner(InputStream in) {
		this.in = in;
	}

	public String nextLine() throws IOException {

		StringBuffer sb  = new StringBuffer(1000);

		while(true) {
			int x;
			x = this.in.read();
			if(x==13){
				break;
			}
			sb.append((char)x);
		}
		return String.valueOf(sb);
	}

	public int nextInt() throws IOException{
	
				return Integer.parseInt(this.nextLine());

	}

	public double nextDouble() throws IOException{
		return Double.parseDouble(this.nextLine());

	}

}


class ScannerClassMod {

	public static void main(String str[]) {

		try{
			MyScanner cin = new MyScanner(System.in);
			System.out.println("Please Enter a Integer : ");
			int alpha =  cin.nextInt();

			System.out.println("You have entered" + alpha);
		}catch(IOException | NumberFormatException e){
			e.printStackTrace();
		}

	}

}