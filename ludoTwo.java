import java.util.*;
public class ludoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1=0;
		int player2=0;
		int count1=0;
		int count2=0;
		while(player1!=100) {
			int diceRoll =(int) (Math.floor(Math.random()*10)%6) +1;
			int option =(int) (Math.floor(Math.random()*10)%3);
			if(option==1){
				player1+=(int) (Math.floor(Math.random()*10)%6) +1;
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
			count1++;
		}
		while(player2!=100) {
			int diceRoll =(int) (Math.floor(Math.random()*10)%6) +1;
			int option =(int) (Math.floor(Math.random()*10)%3);
			if(option==1){
				player2+=(int) (Math.floor(Math.random()*10)%6) +1;;
				if(player2>100) {
					player2-=diceRoll;
				}
			}else if(option==2) {
				player2-=diceRoll;
			}
			if(player2<0) {
				player2=0;
			}
			if(player2>100) {
				player2-=diceRoll;
			}
			System.out.println(player2);
			count2++;
		}
		if(count1<count2) {
			System.out.println("The winnner is Player1 with total number of dice rolls: "+count1);
		}else {
			System.out.println("The winnner is Player2 with total number of dice rolls: "+count2);
		}
		
	}

}
