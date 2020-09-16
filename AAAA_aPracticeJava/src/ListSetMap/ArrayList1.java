package ListSetMap;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	  public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println(cars);
	    Collections.sort(cars); 
	    
	    System.out.println(cars);
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	  }
	}
