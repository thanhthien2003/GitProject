package case_study_again.util;

import case_study.models.person.Customer;
import case_study_again.models.persons.Customers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static final String PATH_FILE_CUSTOMER = "src\\case_study_again\\data\\customer.csv";
    public static void writeFileCustomer(List<Customers>customerList, boolean flag){
        File file =new File(PATH_FILE_CUSTOMER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter=new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customers c:customerList) {
                bufferedWriter.write(c.getInforToCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<Customers> readFileCustomer(){
        List<Customers> customerList = new ArrayList<>();
        File file =new File(PATH_FILE_CUSTOMER);
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line =null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arr = line.split(",");
                customerList.add(new Customers(arr[0],arr[1],arr[2],arr[3],
                        arr[4],arr[5],arr[6],arr[7],arr[8]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
