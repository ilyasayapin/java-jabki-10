import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1.1 Создание множества. Создайте HashSet<String>, добавьте 5 слов и выведите все элементы.
        System.out.println(Homework.newSetString());

        // 1.2 Проверка на наличие элемента. Проверьте, содержится ли слово "java" в множестве.
        System.out.println("Есть ли слово 'java' в множестве? - " + Homework.chekWordJava(Homework.newSetString()));

        // 1.3 Удаление элемента. Удалите слово "python" из множества (если оно есть).
        System.out.println("Удалено ли слово 'python' из множества? - " + Homework.RemoveFromSet(Homework.newSetString()));

        // 1.4 Подсчёт уникальных. Дан список строк с повторами. Добавьте их в HashSet и выведите количество уникальных слов.
        List<String> food = new ArrayList<String>();
        food.add("Арбуз");
        food.add("Арбуз");
        food.add("Тыква");
        food.add("Абрикос");
        food.add("Абрикос");
        System.out.print(food);
        System.out.println(" Число уникальных слов: " + Homework.countUnique(food));

        // 2.1 Создание и вывод Map. Создайте HashMap<String, Integer> с названиями предметов и оценками. Выведите все пары ключ-значение.
        System.out.println(Homework.newMap());

        // 2.2 Получение значения по ключу. Выведите значение по ключу "Math".
        System.out.println("Оценка за Math: " + Homework.getMathMark(Homework.newMap()));

        // 2.3. Изменение значения. Измените значение по ключу "English" на 5.
        Homework.setEnglishMark(Homework.newMap());

        // 2.4 Проверка наличия ключа. Проверьте, есть ли в мапе ключ "History".
        System.out.println("В мапе есть ключ 'History?' - " + Homework.chekKeyHistory(Homework.newMap()));

        // 2.5. Удаление ключа. Удалите ключ "Physics" из мапы.
        Homework.removeKeyPhysics(Homework.newMap());

        // 3.1 Анаграммы.
        String a = "abc";
        String b = "acb";
        System.out.println("Эти строки анаграммы? - " + Homework.areAnagrams(a, b));

        // 3.2 Поиск дубликатов с помощью Set.
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("Есть ли дубпликаты в этом списке? - " + Homework.hasDuplicates(list));

        // 3.3 Рейтинг студентов.
        Map<String, Integer> students = new HashMap<>();
        students.put("Иванов", 5);
        students.put("Петров", 10);
        students.put("Сидоров", 4);
        System.out.println(students);
        System.out.println("Самый умный студент: " + Homework.getStudent(students));

        // 3.4 Словарь синонимов.





    }
}