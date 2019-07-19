package training.day3;

public class AmountTooSmall extends Exception{
private String amountMessage;

public AmountTooSmall(String amountMessage) {
	super();
	this.amountMessage = amountMessage;
}

public AmountTooSmall() {
	this.amountMessage="amount too small";
}

@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return this.amountMessage+"sdasdas";
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "["+this.amountMessage+"]";
}


}
