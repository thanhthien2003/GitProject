package case_study_again.service.employee_service;

import case_study_again.models.persons.Employees;
import case_study_again.repository.employee_repo.EmployeeRepo;
import case_study_again.repository.employee_repo.IEmployeeRepo;
import case_study_again.util.RegExEmployees;
import regex_lam_lai.CheckRegEx;

import java.util.Scanner;

public class EmployeeService  implements IEmployeeService{
    IEmployeeRepo employeeRepo = new EmployeeRepo();
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (Employees e:employeeRepo.display()) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }
    public Employees entryEmployees(){
        boolean flag=true;
//        String id, String name, String date, String gender, String idCountry, String phoneNumber, S
//        tring email, String lever, String address, float wage
        do {
            System.out.print("Enter id:");
            String id = sc.nextLine();
            if (RegExEmployees.checkIdEmployees(id)){
                flag = false;
            } else {
                System.out.println("Please enter correct format:: NV-YYYY ( Y : 0-9)");
                flag = true;
            }
        }while (flag);
        do {
            System.out.print("Enter name:");
            String name = sc.nextLine();
            if (RegExEmployees.checkNameEmployee(name)){
                flag = false;
            }else {
                System.out.println("Please re-enter, maybe you forgot UpperCase a firts key ");
                flag = true;
            }
        }while (flag);
        do {
            System.out.print("Enter date:");
            String date = sc.nextLine();
            if (RegExEmployees.checkDate(date)){
                flag = false;
            } else {
                flag  = true;
            }
        }while (flag);
        String gender =null;
        do {
            System.out.print("Choose one gender:"+
                    "\n 1. Male"+
                    "\n 2. Female");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    gender = "Male";
                    flag = false;
                    break;
                case "2":
                    gender = "Female";
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice not exist , please re-enter");
                    flag = true;
                    break;
            }
        } while (flag);
        String idCountry=null;
        do {
            System.out.print("Enter your IdCountry:");
            idCountry=sc.nextLine();
            if (RegExEmployees.checkIdCountry(idCountry)){
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter");
                flag = true;
            }
        }while (flag);
        String phoneNumber = null;
        do {
            System.out.print("Enter your phone number:");
            phoneNumber = sc.nextLine();
            if (RegExEmployees.checkPhoneNumber(phoneNumber)){
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter with format: 0XXXXXXXXX");
                flag= true;
            }
        }while (flag);
        return null;
    }
}
