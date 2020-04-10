import java.util.*;

class Checker implements Comparator<Player>{
    @Override
    
    public int compare(Player p1,Player p2)
    {
        if(p1.score==p2.score){
           return p1.name.compareTo(p2.name); //alphabetically means a-z order
        }
        else if(p1.score<p2.score){ // if this condition satisfy, it will return 1 means swap.
            return 1;
        }
        else{
            return -1; // if this condition satisfy, it will return -1 means no swap.
        }
        
    }
        
        /*Java does nothing on the ording when it sees a negative number be return. 
        It only flip order when it sees a positive number*/
}



class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparatorHackerRank{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}