package case_study.views;

import case_study.controlers.FuramaControler;

public class Text {
    public static void main(String[] args) {
        try {
            FuramaControler.displayMainMenu();
        } catch (Exception e){
            System.out.println("ERROR");
        }
    }
}
