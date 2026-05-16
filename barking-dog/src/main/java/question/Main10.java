package question;

public class Main10 {

    // 최대 개수 설정
    static final int MX = 1000005;
    // 데이터를 저장할 배열
    static int[] dat = new int[MX];
    // 스택의 상단을 가리킬 포인터 (다음에 데이터가 들어올 위치)
    static int pos = 0;

    // 스택에 데이터를 넣는 함수
    /**
     * 1. pos 인덱스 위치에 x를 넣는다.
     * 2. pos를 1 증가 시킨다.
     *
     */
    public static void push(int x) {
        dat[pos++] = x;
    }

    // 스택에서 데이터를 빼는 함수
    /**
     * 1. pos-1 인덱스 위치의 원소를 제거한다.
     * 2. pos를 1 감소 시킨다.
     */
    public static void pop() {
        if ((pos - 1) > 0) pos--;

    }

    // 스택의 최상단 데이터를 확인하는 함수
    public static int top() {
        return dat[pos - 1];
    }

    public static void test() {
        // 테스트 로직이 들어갈 자리입니다.
    }

    public static void main(String[] args) {
        test();
    }
}
