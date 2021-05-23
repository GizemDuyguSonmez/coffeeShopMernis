package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		boolean personControl;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
		try {
			personControl = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			personControl = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			personControl = false;
			e.printStackTrace();
		}  
		return personControl;
	}
}
