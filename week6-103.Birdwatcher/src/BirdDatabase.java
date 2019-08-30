import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
	private ArrayList<Bird> birdBase;
	
	public BirdDatabase(){
		this.birdBase = new ArrayList<Bird>();
	}
	
	public void addBird(String name, String latinName){
		this.birdBase.add(new Bird(name, latinName));
	}
	
	public void addObservation(String name){
		for (Bird bird : birdBase){
			if (bird.getName().equals(name)){
				bird.addObservation();
				return;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public void statistics(){
		for (Bird bird : birdBase){
			System.out.println(bird);
		}
	}
	
	public void show(String name){
		for (Bird bird : birdBase){
			if (bird.getName().equals(name)){
				System.out.println(bird);
				return;
			}
		}
		throw new IllegalArgumentException();
	}
}
