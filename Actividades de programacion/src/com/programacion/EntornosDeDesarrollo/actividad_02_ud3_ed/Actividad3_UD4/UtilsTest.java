package com.programacion.EntornosDeDesarrollo.actividad_02_ud3_ed.Actividad3_UD4;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @org.junit.jupiter.api.Test
    void concatWords() {

    }

    @org.junit.jupiter.api.Test
    void computeFactorial() {
    }

    @org.junit.jupiter.api.Test
    void normalizeWord() {
    }

    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException {
        final int factorialOf = 1 + (int)(30000*Math.random());

        System.out.println("informatica" + factorialOf + "!");

        System.out.println(factorialOf+"!="+Utils.computeFactorial(factorialOf));
    }

    @Test
    public void checkExpectedException(){
        final int factorialOf = -5;
        System.out.println(factorialOf+"!="+Utils.computeFactorial(factorialOf));
    }

    @Test
    public void testHelloWorld(){
        System.out.println("*UtilsJUnit3Test:test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello",","," world","!"));
    }
}