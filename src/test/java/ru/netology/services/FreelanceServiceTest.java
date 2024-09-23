package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    public void FreelanceServiceTestOption1() {
        FreelanceService service = new FreelanceService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void FreelanceServiceTestOption2() {
        FreelanceService service = new FreelanceService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Test.csv")
    public void FreelanceServiceTestParams(int income, int expenses, int threshold, int expected) {
        FreelanceService service = new FreelanceService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, expected);
    }
}