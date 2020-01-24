package university.model.util;

public class ArrayUtils {

    private ArrayUtils() {
    }

    public static boolean isEmptyArray(Object[] array) {
        return array == null || array.length == 0;
    }

}
