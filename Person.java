
public class Person {
	private String name;
	private String city;
	private int age;
	
	public Person(){
		
		
	}
	public Person(String name, String city, int age){
		this.name = name;
		this.city = city;
		this.age =age;
	}
	
	public String getName(){
		return name;
	}
	public String getCity(){
		return city;
	}
	public int getAge(){
		return age;
	}
	
	public void setName(String newName){
		name = newName;
	}
	public void setCity(String newCity){
		city = newCity;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	
	public String getDes(){
		String result = this.name +  "\n" + this.city + " \n" +this.age +"\n" ;
		return result;
	}

}
