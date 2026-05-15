package question;

import java.util.Arrays;

public class Main8 {

    static final int MX = 1000005;
    static int[] dat = new int[MX];
    static int[] pre = new int[MX];
    static int[] nxt = new int[MX];
    static int unused = 1;

    public static void traverse() {
    }

    public static void insert(int addr, int num) {
        dat[unused] = num;
        pre[unused] = addr;
        nxt[unused] = nxt[addr];
        if (nxt[addr] != -1) pre[nxt[addr]] = unused;
        nxt[addr] = unused;
        unused++;
    }

    public static void erase(int addr) {
        nxt[pre[addr]] = nxt[addr];
        if (nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
    }

    public static void main(String[] args) {
        Arrays.fill(pre, -1);
        Arrays.fill(nxt, -1);

    }
}
