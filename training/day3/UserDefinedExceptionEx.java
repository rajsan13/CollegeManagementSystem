package training.day3;

public class UserDefinedExceptionEx {
private static void performTransaction(Customer customer,int amount) 
	throws NameTooSmallException,AmountTooSmall{
    checkName(customer.getCustomerName());
	if(amount>100) {
		System.out.println();
	}
	else
	{
		throw new AmountTooSmall("Amount is too low");
	}
}

public static void checkName(String name) throws NameTooSmallException {
	if(name.length()<3) {
		throw new NameTooSmallException("Sorry transaction can't be performed due to " +name+" being so small");
	}
}
public static void main(String[] args) {
	Customer customer = new Customer();
	customer.setCustomerName("as");
	int amount=10;
	try {
		UserDefinedExceptionEx.performTransaction(customer,amount);
	} catch (NameTooSmallException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(AmountTooSmall a) {
		a.printStackTrace();
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
