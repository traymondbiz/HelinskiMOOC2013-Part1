import java.util.ArrayList;

public class Team {
	private String name;
	private int maxSize;
	private ArrayList<Player> playerList;
	
	public Team(String name){
		this.name = name;
		this.playerList = new ArrayList<Player>();
		this.maxSize = 16;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addPlayer(Player player){
		if (playerList.size() < maxSize) {
			playerList.add(player);
		}
	}
	
	public void setMaxSize(int maxSize){
		this.maxSize = maxSize;
	}
	
	public int size(){
		return playerList.size();
	}
	
	public int goals(){
		int sum = 0;
		for (Player player : playerList){
			sum += player.goals();
		}
		return sum;
	}
	
	public void printPlayers(){
		for (Player player : playerList){
			System.out.println(player);
		}
	}
}
