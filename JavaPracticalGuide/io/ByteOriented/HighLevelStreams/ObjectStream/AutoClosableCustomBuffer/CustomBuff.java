import java.io.*;


//Custom Exception
class MyException extends Exception {

	MyException(String str){
		super(str);
	}

}


//Autoclosable calls object.close whenever put under try
class MyBuff implements AutoCloseable{ 

	public void close(){
		System.out.println("Close is Called before Leaving !");
	}

}


class CustomBuff {
	public static void main(String args[]) {

		try(MyBuff myb = new MyBuff()){

			throw new MyException("My Custom Exception Message");

		}catch(MyException myex){
			myex.printStackTrace();

		}

	}
}