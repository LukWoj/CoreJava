package equals.human.samouczekprogramisty.pl;

public class Human {
	private String name;
	private String surname;
	private String pesel;
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getPesel() {
		return pesel;
	}
	
	public Human(String name, String surname, String pesel) {
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
	}
	
	public boolean equals(Object otherObject) {
		if	(this == otherObject) {
			return true;
		}
		if	(otherObject == null) {
			return false;
		}
		
		if (!(otherObject instanceof Human)) {
			return false;
		}
		if (getClass() != otherObject.getClass()) {
			return false;
		}
		Human other = (Human) otherObject;
		
		return name.equals(other.getName()) && surname.equals(other.getSurname()) && pesel.equals(other.getPesel());
		
	}
	
	public int hashcode () {
		return 17 * pesel.hashCode();
	}

	public String toString() {
		return getName() + " " + getSurname() + ": " + getPesel();
	}
}
