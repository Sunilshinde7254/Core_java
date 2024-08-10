package Interfaces;
interface MyInterface {
  //  void myMethod();
	
	    int myVar = 10; // This is implicitly public, static, and final
	
    
    public static void main(String[] args) {
        // This will result in a compilation error
        System.out.println("This is a main method inside an interface");
        System.out.println(myVar);
    }
}
