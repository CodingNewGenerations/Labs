/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prostrmk
 */
public class DividersTest {
    
    public DividersTest() {
    }

    @Test
    public void testDeviders() {
        
        int n = 20;
        int expResult = 6;
        int result = Dividers.deviders(n);
        assertEquals(expResult, result);
        
    }
    
}
