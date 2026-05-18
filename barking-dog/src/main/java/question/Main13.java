package question;

public class Main13 {

    // 최대 개수 설정
    static final int MX = 1000005;
    // 앞뒤로 자유롭게 확장하기 위해 배열 크기를 2배 이상으로 설정
    static int[] dat = new int[2 * MX + 1];
    // 시작 위치를 배열의 정중앙으로 지정
    static int head = MX;
    static int tail = MX;

    // 덱의 맨 앞(head 쪽)에 데이터를 추가하는 함수
    public static void push_front(int x) {
        dat[--head] = x;
    }

    // 덱의 맨 뒤(tail 쪽)에 데이터를 추가하는 함수
    public static void push_back(int x) {
        dat[tail++] = x;
    }

    // 덱의 맨 앞(head 쪽)에서 데이터를 제거하는 함수
    public static void pop_front() {
        head++;
    }

    // 덱의 맨 뒤(tail 쪽)에서 데이터를 제거하는 함수
    public static void pop_back() {
        tail--;
    }

    // 덱의 맨 앞 데이터를 확인하는 함수
    public static int front() {
        return dat[head];
    }

    // 덱의 맨 뒤 데이터를 확인하는 함수
    public static int back() {
        return dat[tail - 1];
    }

    public static void test() {
        // 테스트 로직이 들어갈 자리입니다.
    }

    public static void main(String[] args) {
        test();
    }
}
