package MyprojrctPackage;

import java.util.Scanner;

class Guesser{
	int Guessernum;
	
	public int takeNumberGuesser(){
		System.out.println("Guesser guess a Number");
		Scanner Scan = new Scanner(System.in);
		Guessernum=Scan.nextInt();
		
		return Guessernum;
	}
}

 class Player{
	 int Playernum;
	 public int takeNumberPlayer(){
		 System.out.println("Playernum guess a Number");
			Scanner Scan = new Scanner(System.in);
		    Playernum =Scan.nextInt();
			
			return Playernum;
		} 
 }
 class Umpire{
	 int numfromGuesser;
	 int numfromPlayer1;
	 int numfromPlayer2;
	 int numfromPlayer3;
	 
	 void CollectfromGuesser() {
		 Guesser g= new Guesser();
		 numfromGuesser=g.takeNumberGuesser();
	 }
	 void CollectfromPlayer() {
		 Player P1 =new Player();
		 numfromPlayer1=P1.takeNumberPlayer();
		 
		 Player P2 =new Player();
		 numfromPlayer2=P2.takeNumberPlayer();
		 
		 Player P3 =new Player();
		 numfromPlayer3=P3.takeNumberPlayer();
		 
	 }   
	 void compare() {
		if(numfromPlayer1==numfromGuesser) {
			 if(numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser) {
				 System.out.println("All player won the game");
			 }
			 else if(numfromPlayer2==numfromGuesser) {
				 System.out.println("only Player1 and Player2 won the game");
			 }
			 else if( numfromPlayer3==numfromGuesser) {
				 System.out.println("Player1 and Player3 won the game");
			 }else
			 {
				 System.out.println("Only Player 1 won the game");
			 }
		 }
		 else if(numfromPlayer2==numfromGuesser) {
			 if(numfromPlayer3==numfromGuesser){
				 System.out.println("Only Player 2 and 3 won the game");
			 }else {
				 System.out.println("Only Player 2 won the game");
			 }
		 }
		 else if(numfromPlayer3==numfromGuesser) {
			 System.out.println("Only player 3 won the Game");
		 }else {
			 System.out.println("No player one the game");
		 }
	 }
 }
public class GuessGameProject {

	public static void main(String[] args) {
		Umpire U= new Umpire();
		U.CollectfromGuesser();
		U.CollectfromPlayer();
		U.compare();  
	}

}
