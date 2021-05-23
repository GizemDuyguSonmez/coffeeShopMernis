package Concretes;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	public NeroCustomerManager() {
		
	}
	/*
	private CustomerCheckService customerCheckService ;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
	}
	
	*/
}
