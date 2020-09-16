
public class CastingWideningandNarrowing 
{

	public static void main(String[] args) 
	{
		System.out.println();
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
		System.out.println();
		
			    double myDouble1 = 9.78;
			    int myInt1 = (int) myDouble; // Manual casting: double to int

			    System.out.println(myDouble1);   // Outputs 9.78
			    System.out.println(myInt1);      // Outputs 9
			    
				System.out.println();	 //math.max
			    System.out.println(Math.max(5, 10)); 		
			    			    
			    System.out.println();
			    int day = 4;
			    switch (day) {
			      case 1:
			        System.out.println("Monday");
			        break;
			      case 2:
			        System.out.println("Tuesday");
			        break;
			      case 3:
			        System.out.println("Wednesday");
			        break;
			      case 4:
			        System.out.println("Thursday");
			        break;
			      case 5:
			        System.out.println("Friday");
			        break;
			      case 6:
			        System.out.println("Saturday");
			        break;
			      case 7:
			        System.out.println("Sunday");
			        break;
			        
			      default:
			    	    System.out.println("Looking forward to the Weekend");
			    }
			    System.out.println();
			    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			    for (String i : cars) {
			      System.out.println(i);
			    }
			    
			    System.out.println(); 
			    for (int i = 0; i < 10; i++) {
			    	  if (i == 4) {
			    	    break;
			    	  }
			    	  System.out.println(i);
			    	}
			    
			    int i = 0;
			    while (i < 10) {
			      System.out.print(i);
			      i++;
			      if (i == 4) {
			        break;
			      }
			    }
			    System.out.println();
			    int ii = 0;
			    while (ii < 10) {
			      if (ii == 4) {
			        ii++;
			        continue;
			      }
			      System.out.print(ii);
			      ii++;
			    }
			    
			    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			    int x = myNumbers[1][2];
			    System.out.println(x); // Outputs 7

	}

}
