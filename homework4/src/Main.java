import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import homework4.BaseCustomerManager;
import homework4.Customer;
import homework4.MernisServiceAdapter;
import homework4.NeroCustomerManager;
import homework4.StarbucksCustomerManager;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		Customer customer1 = new Customer(1,"yücel","yavaþ",new GregorianCalendar(1986, 04, 03).getTime(),"69760013316");
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(customer1);
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(customer1);

	}

}
