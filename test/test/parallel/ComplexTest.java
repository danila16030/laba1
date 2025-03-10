package test.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void subsruction() {
        Complex result = new Complex(7, 1).subsruction(new Complex(1, 2));
        Assert.assertEquals((int) result.getRe(), 6);
        Assert.assertEquals((int) result.getIm(), -1);
        if (result.getRe() == 6 && result.getIm() == -1) {
            System.out.println("successfully");

        }
    }

    @Test
    void divisionByZero() {
        Complex testNumber = new Complex(1,1);
        double divRe=testNumber.getRe();
        double divImg=testNumber.getIm();
        if (divRe==0 || divImg==0)
        {
            System.out.println("error");
        }
        else {System.out.println("ok");}

    }

    @Test
    void correctDivision() {
        Complex result = new Complex(10, 2).division(new Complex(10, 2));
        Assert.assertEquals((int) result.getRe(), 0);
        Assert.assertEquals((int) result.getIm(), 0);
        if (result.getRe() == 0 && result.getIm() == 0) {
            System.out.println("successfully");
        } else {
            System.out.println("wrong");
        }

    }
}