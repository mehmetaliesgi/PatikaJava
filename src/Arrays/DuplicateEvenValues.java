package Arrays;

public class DuplicateEvenValues {
    public static void main(String[] args) {
        int [] list = {3, 45, 12, 3, 66, 42, 4, 4, 12, 66, 99, 102, 105, 99};
        int [] dupEven = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length - i; j++) {
                if (isEven(list[i]) && !isFind(dupEven, list[i])) {
                    dupEven[index++] = list[i];
                }
                break;
            }
        }
        for (int value : dupEven) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }

    static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isFind(int [] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
