package singletonpattern;
/**
 * A Singleton Pattern creates only 1 instance of the class through it's private constructor. That instance also becomes a global access point for other classes to access.
 * This class implements the singleton pattern.
 * Singleton pattern relies on creating only 1 instance of an object.
 * @author Ghouse
 */


public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get an instance(does not create another object) of the object
		  
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	   }
	}
