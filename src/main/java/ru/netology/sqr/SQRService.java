package ru.netology.sqr;

public class SQRService {
    public int countSqr (int lowb, int highb) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ( i * i >= lowb && i * i <= highb) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
