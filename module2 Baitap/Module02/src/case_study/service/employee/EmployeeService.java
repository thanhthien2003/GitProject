package case_study.service.employee;

import case_study.models.person.Customer;
import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
   static List<Employee> employeeList = new ArrayList<>();
   static Employee employee =new Employee();
    static Scanner sc = new Scanner(System.in);


    @Override
    public void display() {
        for (Employee e:employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        employee = entryEmployee();
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("nhap id cua Employee muon check");
    int id = Integer.parseInt(sc.nextLine());
    int size = employeeList.size();
        for (int i = 0; i < size ; i++) {
            if(id == employeeList.get(i).getId()){
                employee = entryEmployee();
                employeeList.set(i,employee);

            }
        }
    }
    public Employee entryEmployee(){
        System.out.println("nhap ID employee");
        int id  = Integer.parseInt(sc.nextLine());
        System.out.println("nhap name employee");
        String name = sc.nextLine();
        System.out.println("nhap ngay thang sinh");
        String date = sc.nextLine();
        System.out.println("nhap gioi tinh");
        String gender = sc.nextLine();
        System.out.println("nhap so CMND");
        int idCountry = Integer.parseInt(sc.nextLine());
        System.out.println("nhap sdt");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("nhap email");
        String email = sc.nextLine();
        System.out.println("nhap cap do ");
        String lever = sc.nextLine();
        System.out.println("nhap dia chi");
        String address = sc.nextLine();
        System.out.println("muc luong");
        float wage = Float.parseFloat(sc.nextLine());
        employee = new Employee(id,name,date,gender,idCountry,phoneNumber,email,lever,address,wage);
        return employee;
    }
}
