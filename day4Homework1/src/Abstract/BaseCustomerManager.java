package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	public void Save(Customer customer) {
    	System.out.println("Veri tabanina kaydedildi: " + customer.getFirstName() +" "+ customer.getLastName());
    }
}
