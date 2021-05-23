import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) {
		    BaseCustomerManager neroCustomer = new NeroCustomerManager();
		    BaseCustomerManager starbucksCustomer = new StarbucksCustomerManager(new MernisServiceAdapter());
		    
		    Customer customer1 = new Customer( "Ad", "Soyad",LocalDate.of(2002,2,26),"-----------");
		     starbucksCustomer.Save(customer1);
		     
		     Customer customer2 = new Customer( "Ad", "Soyad",LocalDate.of(2003,2,26),"-----------");
		     neroCustomer.Save(customer2);// yili yanlis vermemize ragmen veri tabanina kaydedilir.
		     
		     // starbuck icin ad soyad ve T.C. kimlik no degerlerinin dogru girilmesi durumunda program calisacaktir.
		     // nero icin veriler yanlis girilse bile sorun cikmayacaktir.
		    
		    
		}

	}


