	class InvalidAgeException extends Exception {

		InvalidAgeException(String str){
			super(str);
		} 
	}

	class Student {

		int age;

		void setAge(int age) throws InvalidAgeException {

			if(age>18){
				throw new InvalidAgeException("Invalid age is given");
			}else {
				this.age = age;
			}
		}

		int showAge() {
			return this.age;
		}
	}

	class MyOwnExceptionClass {

		public static void main (String str[]) {

		try {
			Student ashu =  new Student ();
			ashu.setAge(22);
			System.out.println("Ashu's age is "+ ashu.showAge());
			}catch(InvalidAgeException e){
				// System.out.println(e.getMessage());
				// System.out.println(e.toString()); //toString and getMessage() is giving straight messages...

				e.fillInStackTrace();
				//?? fillInStackTrace() is changing output of error....//line is now this - 46
				
				e.printStackTrace();
			}
		}
	}