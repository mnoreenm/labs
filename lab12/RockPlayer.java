package lab12;

public class RockPlayer extends Player{

	public RockPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Roshambo generateRoshambo() {   //not static method ,instance method
		return Roshambo.ROCK;                
		                                  //return super.generateRoshambo();   //overide
	
	                                       //it will inherit  class Player.

}
}
