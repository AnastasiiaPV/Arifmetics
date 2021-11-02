import java.util.ArrayList;
import java.util.List;

public class Extra {
    //Экстра задача
    //
    //Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer
    // (не int, а Integer)
    // и добиться такого же результата как и с типом int.
    public static void main(String[] args) {
        task3(SD_HW_19_2.task1());
    }

    public static List<Integer> task3(List<Integer> list){
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                evenNumbers.add(list.get(i));
            }
        }
        System.out.println(evenNumbers);
        return evenNumbers;
    }
}
