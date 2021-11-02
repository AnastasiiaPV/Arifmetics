import java.util.ArrayList;
import java.util.List;

public class SD_HW_19_2 {
    //    Задача №2
//
//Создать лист со значениями от 100 до 1000.
    public static void main(String[] args) {
        task3(task1());
    }

    public static List<Integer> task1() {
        List<Integer> colors = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            colors.add(i);
        }
        return colors;
    }

    //Задача №3
    //
    //Удалить из листа, созданного в предыдущей задаче, все четные элементы.
    public static List<Integer> task3(List<Integer> list){
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
           if(list.get(i)%2==0){
               evenNumbers.add(i);
           }
        }
        System.out.println(evenNumbers);
        return evenNumbers;
    }
}
