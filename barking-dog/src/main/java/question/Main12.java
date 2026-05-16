package question;

public class Main12 {

    // 최대 개수 설정
    static final int MX = 1000005;
    // 데이터를 저장할 배열
    static int[] dat = new int[MX];
    // 큐의 시작점(가장 오래된 데이터)을 가리킬 head
    static int head = 0;
    // 큐의 끝점(다음에 데이터가 들어올 위치)을 가리킬 tail
    static int tail = 0;

    // 큐의 뒤(tail)에 데이터를 추가하는 함수
    public static void push(int x) {
        dat[tail++] = x;
    }

    // 큐의 앞(head)에서 데이터를 제거하는 함수
    public static void pop() {
        head++;
    }

    // 큐의 맨 앞(가장 먼저 나갈 데이터)을 확인하는 함수
    public static int front() {
        return dat[head];
    }

    // 큐의 맨 뒤(가장 최근에 들어온 데이터)를 확인하는 함수
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
