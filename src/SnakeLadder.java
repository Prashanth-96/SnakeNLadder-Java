import java.util.*;
public class SnakeLadder{
	public static List<Integer> GamePlay(int player) {
		int sl=1;
		int die_c=0;
		while (sl==1) {
			int die= (int) (((Math.random()*10)%6)+1);
			die_c+=1;
			sl= (int) ((Math.random()*10)%3);
			if (sl==1) { // Ladder condition
				if (player+die<=100) {
					player=player+die;
					System.out.println(player);
				}
			}
			else if (sl==2) { // snake condition
				if (player-die<0) {
					player=0;
				}
				else {
					player=player-die;
				}
			}	
		}
		return Arrays.asList(player,die_c); 
	}
	
	public static void main(String[] args) {
		int player1=0;
		int player2=0;
		int die1=0;
		int die2=0;
		int chance=1;
		while((player1<100 && player2<100)) {
			if (chance==1) {
				List<Integer> result = GamePlay(player1);
				player1=result.get(0);
				die1=die1+(int) result.get(1);
				chance += 1;
				//System.out.println("Player 1: "+player1);
			}
			else {
				List<Integer> result = GamePlay(player2);
				player2= result.get(0);
				die2=die2+ (int) result.get(1);
				chance -= 1;
				//System.out.println("Player 2: "+player2);
			}
		}
		if (player1==100) {
			System.out.println("Player 1 wins....!");
			System.out.println("Number of Die Rolls: "+die1);
		}
		else {
			System.out.println("Player 2 wins....!");
			System.out.println("Number of Die Rolls: "+die2);
		}
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

			
