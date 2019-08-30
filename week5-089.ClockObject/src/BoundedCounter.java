
public class BoundedCounter {
	private int value;
	private int upperLimit;
	
	public BoundedCounter(int upperLimit){
		this.upperLimit = upperLimit;
	}
	
	public void next(){
		this.value = (this.value + 1) % (this.upperLimit + 1);
	}
	
	public String toString(){
		StringBuilder returnString = new StringBuilder("");
		
		if (this.value < 10){
			returnString.append("0");
		}
		
		returnString.append(Integer.toString(this.value));
		
		return returnString.toString();
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		if (value < 0 || value > upperLimit){
			return;
		}
		else {
			this.value = value;
		}
	}
}
