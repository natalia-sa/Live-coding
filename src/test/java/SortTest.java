import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTest {
    private Sort sort;


    @Test
    public void sortTest() {
        this.sort = new Sort();
        String[] input = {"gato","abacaxi","dado", "faca", "faca", "faca","faca","abacate"};
        String[] expected = {"abacate","abacaxi", "dado", "faca", "faca", "faca","faca","gato"};
        String[] result = sort.sort(input);


        Assertions.assertArrayEquals(expected, result);
    }

}
