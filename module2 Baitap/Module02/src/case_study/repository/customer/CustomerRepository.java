package case_study.repository.customer;

import case_study.models.person.Customer;
import case_study.utils.ReadAndWriteCustomer;
import case_study.utils.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public void addCustomer(List<Customer> customerList) {
        ReadAndWriteCustomer.writeFileCustomer(customerList,false);
    }

    @Override
    public List<Customer> displayCustomer() {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        return customerList;
    }

    @Override
    public void editCustomer(List<Customer> customerList) {
        ReadAndWriteCustomer.writeFileCustomer(customerList,false);
    }
}
