
 
class MyException extends Exception {

	MyException(String str){
		super(str);
	}
}


class Student  {
	int age;

	void setAge(int age) throws MyException{
		if(age>18){
			throw new  MyException("Age can't be more than 18 ");
		}
	}
}

class Demo {
	public static void main(String str[]) throws MyException  {

		Student stu = new Student ();
try {

		stu.setAge(20);

}catch(Exception e){
	System.pou=e.getMessage();
}


	}
}