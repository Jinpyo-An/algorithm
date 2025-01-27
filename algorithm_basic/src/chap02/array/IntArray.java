package chap02.array;

public class IntArray {

    public static void main(String[] args) {
        final var intArr = new int[5];

        intArr[1] = 37;
        intArr[2] = 51;
        intArr[4] = intArr[1] * 2;

        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
