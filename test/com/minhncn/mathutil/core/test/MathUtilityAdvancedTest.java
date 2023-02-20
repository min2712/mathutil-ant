/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhncn.mathutil.core.test;

import com.minhncn.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author minh2
 */

@RunWith(value = Parameterized.class)
//bao voi JUnit rang code trong class nay se taach data va ham so sanh rieng biet
//Data Driven Testing
//tach phai co ki thuat nhoi/fill data tro lai lenh so sanh
//fill tro lai thong qua bien - bien chua valu dc thay doi 
//ddt co anh em nuong tua voi parameterized - tham so hoa data
public class MathUtilityAdvancedTest {
    //chuan bi mang 2 chieu de chua data trong cac testcase
    //quy uoc mang phai la static public
    //Parameters: 1 tap cac data
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
                              };
    }
    
    //Map tung cap data o tren vao 2 bien cuc bo va se day 2 bien nay vao ham assertEquals() da quen
    @Parameterized.Parameter(value = 0) //lay cot 0 cua mang gan vao n
    //Parameter : nhieu data trich ra tung manh
    public int n;
    @Parameterized.Parameter(value = 1) //lay cot 1 cua mang gan vao expected
    public long expected;
    
    //test ham 
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
