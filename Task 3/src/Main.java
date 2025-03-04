import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i] == -1)
                continue;
            int count = 1;
            for (int j = i + 1; j < arrayCopy.length; j++){
                if (arrayCopy[i] == arrayCopy[j]){
                    count++;
                    arrayCopy[j] = -1;
                }
            }
            if (count > 1)
                System.out.printf("\nЧисло '%d' встречается %d раза", arrayCopy[i], count);
        }
    }
}