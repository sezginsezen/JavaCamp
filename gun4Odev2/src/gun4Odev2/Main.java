package gun4Odev2;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main
{

	public static void main(String[] args)
	{
		BaseCustomerManager customerManager = new NeroCustomerManager();

		Customer customer = new Customer();
		customer.setDateOfBirth(LocalDate.of(1975, 2, 10));
		customer.setFirstName("Ali");
		customer.setLastName("Can");
		customer.setNationalityId("12345678901");

		customerManager.save(customer);

	}

}
