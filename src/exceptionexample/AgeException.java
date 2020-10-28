package exceptionexample;

public class AgeException extends Exception {
	
	public String exceptionMessage;
	
	public AgeException(String message) {
		this.exceptionMessage = message;
	}

	@Override
	public String toString() {
		return "AgeException [ " + exceptionMessage + " ]";
	}

	
}
