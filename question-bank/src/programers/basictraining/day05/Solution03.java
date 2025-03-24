package programers.basictraining.day05;

public class Solution03 {

    public int solution(int a, int b, int c) {
        if (a != b && a != c && b != c) return (a + b + c);
        if ((b == a && a != c) || (b == c && c != a) || (a == c && c != b)) return (a + b + c) * (a * a + b * b + c * c);
        else return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
    }
}
