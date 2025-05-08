public class Computer{
public static String os="Windows";
public String ram;
public static void main(String [] args){
       Computer obj1=new Computer();
       obj1.ram="8GB";
      Computer obj2=new Computer();
      obj2.ram="16GB";

      System.out.println("Os:"+Computer.os);
System.out.println("Computer 1 RAM:"+obj1.ram);
System.out.println("Computer 2RAM:"+obj2.ram);

}
}