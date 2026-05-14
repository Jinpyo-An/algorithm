package question;

public class Main5 {

    // 배열 삽입 로직
    public static void insert(int idx, int num, int[] arr, int[] len) {
        // 뒤에서부터 한 칸씩 밀기
        for (int i = len[0]; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = num;
        len[0]++; // 참조 타입인 배열을 이용해 길이 수정 효과
    }

    // 배열 삭제 로직
    public static void erase(int idx, int[] arr, int[] len) {
        // 앞에서부터 한 칸씩 당기기
        for (int i = idx; i < len[0] - 1; i++) {
            arr[i] = arr[i + 1];
        }
        len[0]--;
    }

    // 배열 출력 로직
    public static void printArr(int[] arr, int[] len) {
        for (int i = 0; i < len[0]; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = new int[100]; // 충분한 크기의 배열
        int[] len = {0}; // C++의 int& len을 흉내내기 위해 배열로 선언

        insert(0, 10, arr, len); // [10]
        insert(1, 20, arr, len); // [10, 20]
        insert(1, 15, arr, len); // [10, 15, 20]
        printArr(arr, len);

        erase(1, arr, len);      // [10, 20]
        printArr(arr, len);
    }
}
