/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJamQualification;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class PancakeTest {
   
    /**
     * Test of countFlip method, of class Pancake.
     */
    @Test
    public void testCountFlip() {
        
        Pancake pancake = new Pancake();

        assertEquals(3, pancake.countFlip("---+-++-", 3));
        assertEquals(0, pancake.countFlip("+++++", 4));
        assertEquals(-1, pancake.countFlip("-+-+-", 4));        

    }
    
}
