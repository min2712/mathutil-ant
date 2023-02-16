/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhncn.mathutil.core.test;

import com.minhncn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author minh2
 */
public class MathUtilityTest {

    @Test
    //Trong hàm này sẽ chứa các testcase để chứa getF() với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); // thuc te getF() tra ve may
        //TESTCASE 1 : Test getF() with n = 0, expected result = 1
        //HOPE THAT : 0! = 1
        Assert.assertEquals(expectedValue, actualValue);
        
        //TESTCASE 2 : Test getF() with n = 5, expected result 5! = 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //TESTCASE 3 : Test getF() with n = 6, expected 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //TESTCASE 4 : Test getF() with n = 4, expected 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        
        //Test thu ngoai le, neu dua input ca chon thi function phai nem ra ngoai le
        //Tuc la getF(-5) thi expected == ngoai le illegalArgument 
        //Thay ngoai le la thay tet    
    }
    
    //trong dau ngoac la de bat ngoai le, khong co thi cut
    //phai bat dung exception
//    @Test(expected = NumberFormatException.class)
//    public void testFactorialGivenWrongArgumentThrowsException(){
//        //TESTCASE 5 : getF() with wrong argument n = -5
//        //JUnit 4 khong dung ham assert de do ngoai le 
//        //JUnit 5 dung ham assert de do ngoai le
//        MathUtility.getFactorial(-5);
//        }
}
