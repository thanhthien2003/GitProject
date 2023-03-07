package introduction_to_java;

import java.util.Scanner;

public class bai_2_chuyen_doi_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon doc");
        int a = sc.nextInt();
        int m, n, i, j;
        String result = " ";
        m = a / 10;
        n = a % 10;
        i = m / 10;
        j = m % 10;
        if (a >= 0 && a < 10) {
            switch (a) {
                    case 0:
                    result = "Zero";
                    break;
                    case 1:
                    result = "One";
                    break;
                    case 2:
                    result = "Two";
                    break;
                    case 3:
                    result = "Three";
                    break;
                    case 4:
                    result = "Four";
                    break;
                    case 5:
                    result = "Five";
                    break;
                    case 6:
                    result = "Six";
                    break;
                    case 7:
                    result = "Seven";
                    break;
                    case 8:
                    result = "Eight";
                    break;
                    case 9:
                    result = "Nine";
            }
            System.out.print(result);
        } else if (a<20) {
            switch (a){
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
                case 13:
                    result = "Thirteen";
                    break;
                case 14:
                    result = "Fourteen";
                    break;
                case 15:
                    result = "Firteen";
                    break;
                case 16:
                    result = "Sixteen";
                    break;
                case 17:
                    result = "Seventeen";
                    break;
                case 18:
                    result = "Eighteen";
                    break;
                case 19:
                    result = "Nineteen";
                    break;
            }
            System.out.print(result);
        } else if (a<100) {
            switch (m){
                case 2:
                    result = "Twenty";
                    break;
                case 3:
                    result = "Thirty";
                    break;
                case 4:
                    result = "Forty";
                    break;
                case 5:
                    result = "Fifty";
                    break;
                case 6:
                    result = "Sixty";
                    break;
                case 7:
                    result = "Seventy";
                    break;
                case 8:
                    result = "Eighty";
                    break;
                case 9:
                    result = "Ninety";
            }
            System.out.print(result);
            switch (n) {
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
            }
            System.out.print(result);
        } else if (a<1000) {
            switch (i){
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
            }
            System.out.print(result + " hundred");
            switch (j){
                case 2:
                    result = " Twenty";
                    break;
                case 3:
                    result = " Thirty";
                    break;
                case 4:
                    result = " Forty";
                    break;
                case 5:
                    result = " Fifty";
                    break;
                case 6:
                    result = " Sixty";
                    break;
                case 7:
                    result = " Seventy";
                    break;
                case 8:
                    result = " Eighty";
                    break;
                case 9:
                    result = " Ninety";
            }
            System.out.print(result);
            switch (n){
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
            }
            System.out.print(result);
        } else {
            System.out.println("so nho hon 1000 thui nha ban oi");
        }
    }
}
