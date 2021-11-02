import java.util.ArrayList;
import java.util.List;

public class SD_HW_19_List {
    //Задача №1
    //
    //Создать лист и добавить в него следующие слова:
    //White.
    //Tan.
    //Yellow.
    //Orange.
    //Red.
    //Pink.
    //Purple.
    //Blue.
    //Затем удалить из этого списка все цвета в которых встречается буква “L”
    //
    public static void main(String[] args) {
        deleteWithL(task1());
    }
    public static List<String> task1(){
        List<String> colors = new ArrayList<>();

                colors.add("White");
                colors.add("Tan");
                colors.add("Yellow");
                colors.add("Orange");
                colors.add("Red");
                colors.add("Pink");
                colors.add("Purple");
                colors.add("Blue");

        return colors;
    }

    public static void deleteWithL(List<String> colors){
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).contains("l")){
                colors.remove(i);
            }
        }
       // colors.remove(colors.size()-1);
        System.out.println(colors);
    }

}
