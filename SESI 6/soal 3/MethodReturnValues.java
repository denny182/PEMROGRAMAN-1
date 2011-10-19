public class MethodReturnValues {
   public static void main (String[] args) {
          myMethod();
		  int myINT = 0;
		  System.out.println(myINT);
		  myINT =myMethod();
		  System.out.println(myINT);
   }
   
   static int myMethod() {
        System.out.println("This computer is lagging!");
		    return 4;
	}
}

		  