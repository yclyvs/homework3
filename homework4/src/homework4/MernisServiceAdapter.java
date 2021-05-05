package homework4;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.time.ZoneId;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(), customer.getLastName(),
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} 
		catch (Exception e) {
			e.printStackTrace();

		}
		
		if(result) {
			return(true);
		}
		else {
			return(false);
		}
	}

}
