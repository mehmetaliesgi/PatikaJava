package Arrays;

public class DuplicateValues {
    public static void main(String[] args) {
        int [] list = {1, 3, 55, 1, 24, 4, 3, 9, 12, 55, 94, 1};
        int [] dup = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length - i; j++) {
                if (list[i] == list[j]) {
                    if(!isFind(dup, list[i])) {
                        dup[index++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : dup) {
            if(value != 0) {
                System.out.println(value);
            }
        }
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
