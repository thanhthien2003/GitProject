package case_study_again.repository.customer_repo;

import case_study.models.person.Customer;
import case_study_again.models.persons.Customers;
import case_study_again.repository.IRepository;

public interface ICustomerRepo extends IRepository<Customers> {
    void edit();
}
