import java.util.HashSet;
import java.util.Set;

public class Homework {

//    1.1 Создание множества. Создайте HashSet<String>, добавьте 5 слов и выведите все элементы.
    public static Set<String> newSetString() {
        Set<String> set = new HashSet<>();
        set.add("Один");
        set.add("Два");
        set.add("Три");
        set.add("Четыре");
        set.add("Пять");
        return set;
    }

//    1.2 Проверка на наличие элемента. Проверьте, содержится ли слово "java" в множестве.
    public static boolean chekWordJava(Set<String> set) {
        boolean chek = false;
        for (String str : set) {
            if (str.equals("java")) {
                chek = true;
            }
            return chek;
        }


    }


}
