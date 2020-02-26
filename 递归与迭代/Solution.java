// 利用递归方式计算阶乘
public static long factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
// 利用迭代方式计算阶乘
public static long factorial2(int n) {
    int r = 1;
    for (int i = 1; i <= n; i++) {
        r *= i;
    }

    return r;
}

public static double calcE(int n) {
    double e = 0;
    for (int i = 0; i < n; i++) {
        e += (1.0 / factorial(i));
    }

    return e;
}


--------------------------------------------


public static double calcPi(int n) {
    double pi4 = 0;

    for (int i = 0; i < n; i++) {
        int fenmu = 2 * i + 1;
        double item = 1.0 / fenmu;

        if (i % 2 == 0) {
            pi4 += item;
        } else {
            pi4 -= item;
        }
    }

    return pi4 * 4;
}


--------------------------------------------


public static String reverse(String s) {
    int length = s.length();
    String r = "";
    for (int i = length - 1; i >= 0; i--) {
        r += s.charAt(i);
    }

    return r;
}


--------------------------------------------


public static String decToHex(int n) {
    String r = "";

    while (n > 16) {
        int yushu = n % 16;
        int shang = n / 16;

        if (yushu > 9) {
            char c = (char)((yushu - 10) + 'A');
            r += c;
        } else {
            r += yushu;
        }

        n = shang;
    }

    if (n > 9) {
        char c = (char)((n - 10) + 'A');
        r += c;
    } else {
        r += n;
    }

    return reverse(r);
}


















