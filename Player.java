public class Player{
public static int totalPlayers =0;
public String playerName;
public static void main(String [] args){
         Player obj1=new Player();
         obj1.playerName="Teja";
         Player.totalPlayers++;

        Player obj2=new Player();
        obj2.playerName="Lokesh";
        Player.totalPlayers++; 
System.out.println("Total Players:"+Player.totalPlayers);
}
}