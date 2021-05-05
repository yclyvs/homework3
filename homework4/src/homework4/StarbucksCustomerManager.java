package homework4;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService checkService;

	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		  if (checkService.CheckIfRealPerson(customer)) {
	            super.save(customer);
	        }
		  else {
			  System.out.println("Kullanýcý bulunamadý!");
	        }
	} 
}