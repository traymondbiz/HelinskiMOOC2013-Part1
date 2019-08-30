import java.util.ArrayList;

public class Phonebook {
	private ArrayList<Person> list = new ArrayList<Person>();
	
	public void add(String name, String number){
		list.add(new Person(name, number));
	}
	
	public void printAll(){
		for (Person person : list){
			System.out.println(person);
		}
	}
	
	public String searchNumber(String name){
		for (Person person : list){
			if (name.equals(person.getName())){
				return person.getNumber();
			}
		}
		return "number not known";
	}
	
	
}
