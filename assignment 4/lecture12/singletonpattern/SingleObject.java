package singletonpattern;
/**
 * A Singleton Pattern creates only 1 instance of the class through it's private constructor. That instance also becomes a global access point for other classes to access.
 */

public class SingleObject {

	   //creates an instance of SingleObject class
	   private static SingleObject instance = new SingleObject();

	   public SingleObject(){}

	   //Get the only instance of the object
	   // or simply an instance getter function
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public String showMessage(){
	      return "Hello World!";
	   }
	}
