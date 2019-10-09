package com.company;

public class Main {

    public static void main(String[] args) {
// gnome sort
        int M[] = {10, 5, 2, 4, 11, 9, 1, 12, 3, 15, 6, 8, 7, 14, 13};
        int tmp;
        int i = 1;
        while (i < 15) {
            if (M[i - 1] <= M[i]) {
                i++;
            } else {
                tmp = M[i - 1];
                M[i - 1] = M[i];
                M[i] = tmp;
                if (i > 1) i--;
            }
        }
        for (int x = 0; x < 15; x++) System.out.println(M[x] + " ; ");
    }
}
