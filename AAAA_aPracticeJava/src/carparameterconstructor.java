public class carparameterconstructor {
  int modelYear;
  String modelName;

  public carparameterconstructor(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
	  carparameterconstructor myCar = new carparameterconstructor(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang