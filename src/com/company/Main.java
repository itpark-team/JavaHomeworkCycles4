package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, w;
        int maxX, maxY, maxZ;

        int countVariants = 0;

        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        w = input.nextInt();

        maxX = w / x;
        maxY = w / y;
        maxZ = w / z;

        /*for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                for (int k = 0; k <= maxZ; k++) {
                    if (i * x + j * y + k * z == w) {
                        countVariants++;
                    }
                }
            }
        }*/

        int calcZ = 0;

        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                calcZ = w - i * x - j * y;
                if (calcZ>=0 && calcZ % z == 0) {
                    countVariants++;
                }
            }
        }

        System.out.print(countVariants);
    }
}
