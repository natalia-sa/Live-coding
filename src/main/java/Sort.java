import java.util.Arrays;

public class Sort {
    public Sort() {

    }

    public String[] sort(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i].compareTo(array[j]) > 0) {
                    count++;
                }
            }
            System.out.println(array[i] + ":" + count);
            int countResult = count;
            while(result[countResult] != null) {
                countResult++;
            }
            result[countResult] = array[i];

        }
        return result;
    }
}
