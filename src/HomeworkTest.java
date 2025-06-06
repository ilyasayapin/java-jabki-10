import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    void cheсkWordJavaIsEmpty() {
        Set<String> set = new HashSet<>();
        set.add("Один");
        set.add("Два");
        set.add("Три");
        set.add("java");
        set.add("Пять");
        set.add("Пять");
        assertThrows(IllegalArgumentException.class, () -> Homework.cheсkWordJava(set));
    }

}