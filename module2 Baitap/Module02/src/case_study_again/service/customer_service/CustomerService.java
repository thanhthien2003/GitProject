package case_study_again.service.customer_service;

import case_study_again.models.persons.Customers;
import case_study_again.models.persons.Employees;
import case_study_again.repository.customer_repo.CustomerRepo;
import case_study_again.repository.customer_repo.ICustomerRepo;

public class CustomerService implements ICustomerService{
    ICustomerRepo customerRepo =new CustomerRepo();
    static String [] styleCustomer = {
            "Diamond","Platinium","Gold","Silver","Member"
    };
    @Override
    public void display() {
        for (Customers c:customerRepo.display()) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }
    public Employees entryEmployees(){

        return null;
    }
}
