import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class TinhdientichTest {
Tinhdientich bs =new Tinhdientich();
double am =-1;
        double khong=0;
double a=3;
double b=4 ;
double c=5;
double bu1=7;
double bu2=8;
double mongmuonk=-1;
    //tam giác vuông

    double chu ; // Ném ra NumberFormatException
    double kitu ; // Ném ra NumberFormatException
    double trong ; // Ném ra NumberFormatException

    @Test
    void Test1TG() {
      double thuc= bs.calculateTriangleArea(a,b,c);
      double mongmuon=6;
     assertEquals(mongmuon,thuc);

    }
    //tam giác err
    @Test
    void Test2TG() {
        double thuc= bs.calculateTriangleArea(a,b,bu1);

        assertEquals(mongmuonk,thuc);

    }

    @Test
    void Test3TG() {
        double thuc= bs.calculateTriangleArea(a,bu1,b);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test4TG() {
        double thuc= bs.calculateTriangleArea(bu1,a,b);

        assertEquals(mongmuonk,thuc);

    }
    //tam giac deu
    @Test
    void Test5TG() {
        double thuc= bs.calculateTriangleArea(bu1,bu1,bu1);
        double s = (bu1+ bu1+ bu1) / 2;
mongmuonk=Math.sqrt(s * (s - bu1) * (s - bu1) * (s - bu1));
        assertEquals(mongmuonk,thuc);

    }
    //tam giac can
    @Test
    void Test6TG() {
        double thuc= bs.calculateTriangleArea(a,bu1,bu1);
        double s = (a + bu1+ bu1) / 2;
        mongmuonk=Math.sqrt(s * (s - a) * (s - bu1) * (s - bu1));
        assertEquals(mongmuonk,thuc);

    }
    //Tam giac Bu

    @Test
    void Test7TG() {
        double thuc= bs.calculateTriangleArea(c,bu1,bu2);
        double s = (c+ bu1+ bu2) / 2;
        mongmuonk=Math.sqrt(s * (s - c) * (s - bu1) * (s - bu2));
        assertEquals(mongmuonk,thuc);

    }
    //Tam giac erro
    @Test
    void Test8TG() {
        double thuc= bs.calculateTriangleArea(khong,bu1,bu2);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test9TG() {
        double thuc= bs.calculateTriangleArea(khong,khong,bu2);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test10TG() {
        double thuc= bs.calculateTriangleArea(khong,khong,khong);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test11TG() {
        double thuc= bs.calculateTriangleArea(bu1,khong,bu2);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test12TG() {
        double thuc= bs.calculateTriangleArea(bu1,khong,khong);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test13TG() {
        double thuc= bs.calculateTriangleArea(khong ,khong,bu1);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test14TG() {
        double thuc= bs.calculateTriangleArea(am,am,am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test15TG() {
        double thuc= bs.calculateTriangleArea(am,bu2,am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test16TG() {
        double thuc= bs.calculateTriangleArea(am,bu1,bu1);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test17TG() {
        double thuc= bs.calculateTriangleArea(bu1,bu1,am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test18TG() {
        double thuc= bs.calculateTriangleArea(bu1,am,bu1);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test19TG() {
        double thuc= bs.calculateTriangleArea(bu1,bu1,am);

        assertEquals(mongmuonk,thuc);

    }
    //Hinh chu nhat
    @Test
    void Test20TG() {
        double thuc= bs.calculateRectangleArea(bu1,bu1);

        assertEquals(bu1*bu1,thuc);

    }
    @Test
    void Test21TG() {
        double thuc= bs.calculateRectangleArea(bu1,bu2);

        assertEquals(bu1*bu2,thuc);

    }
    @Test
    void Test22TG() {
        double thuc= bs.calculateRectangleArea(am,bu2);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test23TG() {
        double thuc= bs.calculateRectangleArea(bu2,am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test24TG() {
        double thuc= bs.calculateRectangleArea(0,0);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test25TG() {
        double thuc= bs.calculateRectangleArea(0,bu1);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test26TG() {
        double thuc= bs.calculateRectangleArea(bu1,0);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test27TG() {
        double thuc= bs.calculateRectangleArea(0,am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test28TG() {
        double thuc= bs.calculateRectangleArea(am,0);

        assertEquals(mongmuonk,thuc);

    }
    //Hinh tron

    @Test
    void Test29TG() {
        double thuc= bs.calculateCircleArea(bu1);

        assertEquals(bu1*bu1*Math.PI,thuc);

    }
    @Test
    void Test30TG() {
        double thuc= bs.calculateCircleArea(khong);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test31TG() {
        double thuc= bs.calculateCircleArea(am);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test32TG() {
        double thuc= bs.calculateCircleArea(chu = Double.parseDouble("a"));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test33TG() {
        double thuc= bs.calculateCircleArea(Double.parseDouble(""));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test34TG() {
        double thuc= bs.calculateCircleArea(Double.parseDouble("*"));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test35TG() {
        double thuc= bs.calculateRectangleArea(a,Double.parseDouble("*"));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test36TG() {
        double thuc= bs.calculateRectangleArea(a,Double.parseDouble(""));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test37TG() {
        double thuc= bs.calculateRectangleArea(a,Double.parseDouble(" "));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test38TG() {
        double thuc= bs.calculateRectangleArea(a,chu);

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test39TG() {
        double thuc= bs.calculateTriangleArea(a,b,Double.parseDouble(""));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test40TG() {
        double thuc= bs.calculateTriangleArea(a,b,Double.parseDouble("*"));

        assertEquals(mongmuonk,thuc);

    }
    @Test
    void Test41TG() {
        double thuc= bs.calculateTriangleArea(a,b,Double.parseDouble("a"));

        assertEquals(mongmuonk,thuc);

    }

}