/*
입력값
- enroll: 각 판매원의 이름
- referral: 각 판매원을 추천


1. key가 판매원, value가 추천인인 해시맵 선언 referMap
2. key가 판매원, value가 이익금인 해시맵 선언 priceMap
3. enroll과 referral을 순회한다.
   3-1. referMap에 key를 enroll, value를 referral의 원소값을 대입
4. seller와 amount을 순회한다.
   4-1. seller에 해당하는 amount를 선언
   4-2. referMap에서 seller의 추천인에게 10를 때주고, 90를 priceMap에 넣는다.
 */

package chapter08;


import java.util.HashMap;

public class Solution27 {

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> referMap = new HashMap<>();
        HashMap<String, Integer> priceMap = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            referMap.put(enroll[i], referral[i]);
        }

        for (String s : enroll) {
            priceMap.put(s, 0);
        }

        for (int i = 0; i < seller.length; i++) {
            String sell = seller[i];
            int price = amount[i] * 100;
            String refer = referMap.get(sell);

            if (!refer.equals("-")) {
                priceMap.put(refer, (int) (priceMap.get(refer) + (price * 0.1)));
                priceMap.put(sell, (int) (priceMap.get(refer) + (price * 0.9)));
            } else {
                priceMap.put(sell, (priceMap.get(refer) + price));
            }
        }

        int[] result = new int[priceMap.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = priceMap.get(enroll[i]);
        }

        return result;
    }

    public int[] solution02(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> parent = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < seller.length; i++) {
            String curName = seller[i];
            int money = amount[i] * 100;

            while (money > 0 && !curName.equals("-")) {
                total.put(curName, total.getOrDefault(curName, 0) + money - (money / 10));
                curName = parent.get(curName);
                money /= 10;
            }
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}
