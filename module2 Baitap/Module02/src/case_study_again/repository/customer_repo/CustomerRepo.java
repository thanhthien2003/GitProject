package case_study_again.repository.customer_repo;

import case_study.models.person.Customer;
import case_study_again.models.persons.Customers;
import case_study_again.util.ReadAndWriteCustomer;

import java.util.List;

public class CustomerRepo implements ICustomerRepo{
    @Override
    public List<Customers> display() {
        List<Customers> customerList =ReadAndWriteCustomer.readFileCustomer();
        return customerList;
    }

    @Override
    public void add(Customers customer) {

    }

    @Override
    public void edit() {

    }
}
