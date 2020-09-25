import java.util.*;
public class ludoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1=0;
		int count=0;
		while(player1!=100) {
			int diceRoll =(int) (Math.floor(Math.random()*10)%6) +1;
			int option =(int) (Math.floor(Math.random()*10)%3);
			if(option==1){
				player1+=diceRoll;
				if(player1>100) {
					player1-=diceRoll;
				}
			}else if(option==2) {
				player1-=diceRoll;
			}
			if(player1<0) {
				player1=0;
			}
			if(player1>100) {
				player1-=diceRoll;
			}
			System.out.println(player1);
			count++;
		}
		System.out.println("the total number of dice rolls are: "+count);
		
	}

}
