package case_study.utils;

import case_study.models.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static String customerFile = "src\\case_study\\service\\customer\\CustomerService.java";
    static List<Customer> customerList = new ArrayList<>();
    public static List<Customer> readFileCustomer(){
        File file = new File(customerFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                String [] arr = line.split(",");
                customerList.add(new Customer(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],arr[7],arr[8]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
    public static void writeFileCustomer(List<Customer> customerList,boolean flag){
        File file = new File(customerFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < customerList.size(); i++) {
                bufferedWriter.write(customerList.get(i).getInforToCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file eror");
        }
    }
}
