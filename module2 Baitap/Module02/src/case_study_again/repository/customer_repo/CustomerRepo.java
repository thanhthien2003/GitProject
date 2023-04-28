package case_study_again.repository.customer_repo;

import case_study.models.person.Customer;
import case_study_again.models.persons.Customers;
import case_study_again.util.ReadAndWriteCustomer;
import case_study_again.util.ReadAndWriteEmployee;

import java.util.List;

public class CustomerRepo implements ICustomerRepo{
    List<Customers> customerList =ReadAndWriteCustomer.readFileCustomer();
    @Override
    public List<Customers> display() {
        return customerList;
    }

    @Override
    public void add(Customers customer) {
        customerList.add(customer);
        ReadAndWriteCustomer.writeFileCustomer(customerList,false);
    }

    @Override
    public void edit(Customers customer,int i) {
        for (int j = 0; j < customerList.size(); j++) {
            if (j==i){
                customerList.set(j,customer);
                break;
            }
        }
        ReadAndWriteCustomer.writeFileCustomer(customerList,false);
    }
}
