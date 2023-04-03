package case_study.repository.customer;

import case_study.models.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    void addCustomer(List<Customer> customerList);
    List<Customer> displayCustomer();
    void editCustomer(List<Customer> customerList);
}
