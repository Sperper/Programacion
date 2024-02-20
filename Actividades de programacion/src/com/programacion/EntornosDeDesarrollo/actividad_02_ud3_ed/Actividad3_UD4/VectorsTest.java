package com.programacion.EntornosDeDesarrollo.actividad_02_ud3_ed.Actividad3_UD4;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

class VectorsTest {

    @Test
    void equal() {
    }

    @Test
    void scalarMultiplication() {
    }

    @Test
    public void testEqual() {
        System.out.println("vectorsJUnit3Test:testEqual()");
        assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vectors.equal(new int[]{0,0}, new int[]{0,0}));
        assertTrue(Vectors.equal(new int[]{0,0,0}, new int[]{0,0,0}));
        assertTrue(Vectors.equal(new int[]{1,2,3}, new int[]{1,2,3}));

        assertFalse(Vectors.equal(new int[]{}, new int[]{1}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{1}));
        assertFalse(Vectors.equal(new int[]{0,2}, new int[]{1,3}));
        assertFalse(Vectors.equal(new int[]{1,2,3}, new int[]{4,5,6}));
    }




}