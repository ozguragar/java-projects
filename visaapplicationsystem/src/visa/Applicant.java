package visa;

public class Applicant {

	private String name;
	private String passportNumber;
	private boolean hasWorkPermit;
	
	public Applicant(String name, String passportNumber, boolean hasWorkPermit) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.hasWorkPermit = hasWorkPermit;
	}

	public String getName() {
		return name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public boolean isHasWorkPermit() {
		return hasWorkPermit;
	}

	@Override
	public String toString() {
		return "Applicant [name=" + name + ", passportNumber=" + passportNumber + ", hasWorkPermit=" + hasWorkPermit
				+ "]";
	}
	
	
}
