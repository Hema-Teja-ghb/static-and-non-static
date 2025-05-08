public class Config{
public static String configName="System Config";
public String settingValue;
public static void main(String [] args){
       Config obj1=new Config();
      obj1.settingValue="Dark Mode";
      Config obj2=new Config();
      obj2.settingValue="Light Mode";
System.out.println("Config Name:"+Config.configName);
System.out.println("Setting 1:"+obj1.settingValue);
System.out.println("Setting 2:"+obj2.settingValue);

}
}