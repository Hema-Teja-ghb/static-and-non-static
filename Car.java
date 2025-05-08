public class Car{
    public static String companyName ="Honda";
    public String carModel;
public static void main(String [] args){
    System.out.println("Company Name :"+Car.companyName);
                         Car  obj1 =  new  Car();
                         Car  obj2 =  new  Car();
              obj1.carModel="Civic";
              obj2.carModel="Accord";
 System.out.println("Car Model :"+obj1.carModel);
 System.out.println("Car Model :"+obj2.carModel);
}
}