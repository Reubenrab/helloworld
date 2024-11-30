package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testcalc {

        @Test
        public void testcalcmultiply() {
        Integer var1=5;
        Integer var2=10;
        Calc calc1 = new Calc();
        assertEquals(calc1.multiply(var1,var2), 50);

}
        @Test
        public void testcalcmultiply2() {
                Integer var1=3;
                Integer var2=15;
                Calc calc1 = new Calc();
                assertEquals(calc1.multiply(var1,var2), 45);

        }

}



