package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomarCorretamente(){
        int a = 4;
        int b = calculadoraService.somar(2, 2);
        Assert.assertEquals(a, b);
    }
    @Test
    public void deveDividirCorretamente(){
        Assert.assertTrue(calculadoraService.dividir(1,1) == 1);
    }
    @Test
    public void deveSubtrairCorretamente(){
        Assert.assertTrue(calculadoraService.subtrair(1,1) == 0);
    }

    @Test
    public void deveMultiplicarCorretamente(){
        Assert.assertTrue(calculadoraService.multiplicar(1,1) == 1);
    }

    @Test
    public void deveCalcularAreaTriangulo(){
        Triangulo triangulo = new Triangulo(2.0, 2.0);
        double area = 2.0;
        Assert.assertTrue(calculadoraService.calcularArea(triangulo) == area);
    }


    @Test
    public void deveCalcularAreaQuadrado(){
        Quadrado quadrado = new Quadrado(4.0);
        double area = 16.0;
        Assert.assertTrue(calculadoraService.calcularArea(quadrado) == area);
    }

    @Test
    public void deveCalcularMenorTriangulo(){
        Triangulo triangulo1 = new Triangulo(2.0, 2.0);
        Triangulo triangulo2 = new Triangulo(1.0, 1.0);
        Triangulo trianguloMenorArea = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        Assert.assertEquals(triangulo2, trianguloMenorArea);
    }
    @Test
    public void deveRetornarNullEmTriangulosDeAreasIguais(){
        Triangulo triangulo1 = new Triangulo(2.0, 2.0);
        Triangulo triangulo2 = new Triangulo(2.0, 2.0);
        Triangulo trianguloMenorArea = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        Assert.assertNull(trianguloMenorArea);
    }

    @Test
    public void deveCalcularMenorQuadrado(){
        Quadrado quadrado1 = new Quadrado(2.0);
        Quadrado quadrado2 = new Quadrado(1.0);
        Quadrado quadradoMenorArea = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        Assert.assertEquals(quadrado2, quadradoMenorArea);
    }

    @Test
    public void deveRetornarNullEmQuadradosDeAreasIguais(){
        Quadrado quadrado1 = new Quadrado(1.0);
        Quadrado quadrado2 = new Quadrado(1.0);
        Quadrado quadradoMenorArea = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        Assert.assertNull(quadradoMenorArea);
    }



}
