import java.util.Scanner;
class adam {
    public static void main(String[] args) {
        int x, i, s, r, y, p, s1, r1;
        for (i = 1; i <= 1000; i++) {
            x = i;
            s = 0;
            y = i * i;
            while (x > 0) {
                r = x % 10;
                s = s + r;
                x = x / 10;
            }
            p = s * s;
            s1 = 0;
            while (p > 0) {
                r1 = p % 10;
                s1 = s1+r1;
                p = p / 10;
            }
            if (s1 ==s)
            {
                System.out.print(i+" ");
            }
        }

    }
}
