package training.day3;

public class NameTooSmallException extends Exception{
	private String message;

	public NameTooSmallException(String message) {
		super();
		this.message = message;
	}

	public NameTooSmallException() {
		this.message="name too small";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message+"sdasdas";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.message+"]";
	}
	

}
