package try_catch;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            int c = Integer.parseInt(sc.nextLine());
            checkTriangle(a,b,c);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (IlLegalTriangleException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e){
            System.out.println("nhập sai định dạng số rồi ");
        }
    }
   public static boolean checkTriangle(int a,int b,int c) throws IlLegalTriangleException {
        if(a <= 0 || b <= 0 || c <= 0){
            throw new IlLegalTriangleException("cạnh của tam giác không âm , không bằng 0 ");
        } else if (a+c <= b) {
            throw new IlLegalTriangleException("2 cạnh của tam giác cộng lại phải lớn hơn 1 cạnh ");
        } else if (c+b <=a ) {
            throw new IlLegalTriangleException("2 cạnh của tam giác cộng lại phải lớn hơn 1 cạnh ");
        } else if (a+b <=c) {
            throw new  IlLegalTriangleException("2 cạnh của tam giác cộng lại phải lớn hơn 1 cạnh  ");
        } else {
            return  true;
        }
   }

}
