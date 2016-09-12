package lab12;

public class Player {
	
	private  String playerName;
	
	
	public Player(String playerName) { //constructor)
	this.playerName = playerName;//this(playerName) will call Player constructor not paent
		                                //or super 
	}

	public Roshambo generateRoshambo() {   
		return Roshambo.ROCK;
	
	}
	
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	public String getPlayerName(){
		return playerName;	
	
}
}
