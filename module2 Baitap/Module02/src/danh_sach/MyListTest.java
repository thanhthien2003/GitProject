package danh_sach;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> new1 = new MyList<>();
        new1.add(2);
        new1.add(25);
        new1.add(24);
        new1.add(28);
        System.out.println(Arrays.toString(new1.clone()));
        new1.remove(2);
        System.out.println(Arrays.toString(new1.clone()));
        new1.add(1, 5);
        System.out.println(Arrays.toString(new1.clone()));
        System.out.println(new1.contains(2));
        System.out.println(new1.indexOf(3));
        System.out.println(new1.get(2));
        new1.clear();
        System.out.println(Arrays.toString(new1.clone()));

    }
}
