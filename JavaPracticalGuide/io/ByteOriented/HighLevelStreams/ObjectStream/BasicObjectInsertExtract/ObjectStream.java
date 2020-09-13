import java.io.*;

class Person implements Serializable {

	String name;
	int age;
	double salary;
	static int save;

	Person(String name, int age, double salary){
		this.name =  name ;
		this.age = age;
		this.salary= salary;
		this.save = 100;
	}

	void getDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
	}

	static void call(){
		System.out.println("Yes, it's called");
	}

}


class ObjectStream  {

	public static void main(String args[]){

		Person per = new Person("Ashutosh Tiwari", 23, 50000.23432);
		try(
			FileOutputStream fout = new FileOutputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\ObjectStream\\BasicObjectInsertExtract\\objectStore.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("F:\\Sites\\JavaPracticalGuide\\io\\ByteOriented\\HighLevelStreams\\ObjectStream\\BasicObjectInsertExtract\\objectStore.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			){

			oout.writeObject(per);

			
			Person ob = (Person)oin.readObject();
			ob.getDetails();
			System.out.println(ob.save);

		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException fnf){
			fnf.printStackTrace();
		}
	
	}
}