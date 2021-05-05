package homework4;

public abstract class BaseCustomerManager implements ICustomerServices {

	@Override
	public void save(Customer customer){
		System.out.println("Save to db "+ customer.getFirstName());
		
	}

}