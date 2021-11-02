import java.util.ArrayList;
import java.util.List;

public class SD_HW_19_2 {
    //    Задача №2
//
//Создать лист со значениями от 100 до 1000.
    public static void main(String[] args) {
        task1();
    }

    public static List<Integer> task1() {
        List<Integer> colors = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            colors.add(i);
        }
        System.out.println(colors);
        return colors;
    }
}
