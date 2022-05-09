package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSqrIntoRangeLimits() {
        SQRService service = new SQRService();
        //количество квадратов в границах диапозона
        int lowb = 200;
        int highb = 300;
        int expected = 3;

        int actual = service.countSqr(lowb,highb);

        assertEquals(expected,actual);
    }
    @Test
    void countSqrOutRangeLimits() {
        SQRService service = new SQRService();
        //количество квадратов вне диапозона
        int lowb = 0;
        int highb = 99;
        int expected = 0;

        int actual = service.countSqr(lowb,highb);

        assertEquals(expected,actual);
    }
    @Test
    void countSqrLowerRangeLimit() {
        SQRService service = new SQRService();
        //нижнее граничное значение
        int lowb = 99;
        int highb = 101;
        int expected = 1;

        int actual = service.countSqr(lowb,highb);

        assertEquals(expected,actual);
    }
    @Test
    void countSqrUpperRangeLimit() {
        SQRService service = new SQRService();
        //верхнее граничное значение
        int lowb = 9800;
        int highb = 9802;
        int expected = 1;

        int actual = service.countSqr(lowb,highb);

        assertEquals(expected,actual);
    }
}