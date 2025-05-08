public class Department{
public static String departmentName ="HR";
public String  employeeName;
public static void main (String [] args){
 System.out.println("Department :"+Department.departmentName);
                          Department obj1= new Department();
                           Department obj2= new Department();
obj1.employeeName="John";
obj2.employeeName="Alice";
System.out.println("Employee 1:"+obj1.employeeName);
System.out.println("Employee 2:"+obj2.employeeName);
Department.departmentName="Marketing";
System.out.println("\nAfter modification:");
System.out.println("Department:"+Department.departmentName);
System.out.println("Employee 1:"+obj1.employeeName);
System.out.println("Employee 2:"+obj2.employeeName);
}
}