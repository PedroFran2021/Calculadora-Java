package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 */

class oeracoestest  {

    Operacoes operacoes = new Operacoes();




    @Test

    //Caso de Teste 1
    void deveriaTestarMaiorValor() {
       Operacoes operacoes = new Operacoes();
       double result = operacoes.maior(16, 9);
        //Comparar o valor retornado com o que era esperado
        assertEquals(16,result);
    }

    //Caso de Teste 2
    @Test
    void deveriaTestarMaiorValor2() {
     double result = operacoes.maior(16,9);
     assertEquals(17,result,0,"valor maior é 16");

    }
    //Caso de Teste 3
    @Test
    void deveriaTestarMaiorValor3() {
        double result = operacoes.maior(16,9);
        assertEquals(15,result,0);

    }
    //Caso de Teste 4
    @Test
    void deveriaTestarMenorValor() {
        double result = operacoes.menor(16,9);
        assertFalse(16 < 9, "16 é maior que 9 " );

    }
    //Caso de Teste 5
    @Test
    void deveriaTestarMenorValor2() {
        double result = operacoes.menor(16,9);
        assertTrue(9 < 16);

    }
    //Caso de Teste 6
    @Test
    void deveriaCompararDoisObjetos() {
       assertSame(operacoes.soma(2,2),operacoes.soma(2,2));

    }
    //Caso de Teste 7

    @Test
    void deveriaCompararDoisObjetos2() {
        assertNotSame(operacoes.soma(2,2), operacoes.soma(2,2));

    }

    //Caso de Teste 8
    @Test
    void deveriaTestarRaizQuadrada(){
        double  result = operacoes.radiciacao(88);
                assertEquals(9.380,result,3,"Resultado deve ser arredondado para 9");
    }

    // Caso de Teste 9
    @Test
    void deveriaTestarDivisao(){
        double result = operacoes.divisao(50, 2);
        assertEquals(25,result);
    }

    // Caso de Teste 10
    @Test
    void deveriaTestarDivisao2() {

        double result = operacoes.divisao(50, 0);
        double resultadoEsperado = Double.POSITIVE_INFINITY; // Espera-se Infinity para divisão por 0

        if (resultadoEsperado != result) {
            throw new AssertionError("Teste falhou: esperado " + resultadoEsperado + ", mas foi " + result);
        }
    }

    //Caso de Teste 11
        @Test
        void deveriaTestarDivisao3() {
            double result = operacoes.divisao(0, 0);
            // Verifica se o resultado é NaN (Not a Number)
            if (!Double.isNaN(result)) {
                throw new AssertionError("Teste falhou: esperado NaN, mas foi " + result);
            }
        }

    // Caso de Teste 12
    @Test
    void deveriaTestarProduto() {

        double result = operacoes.potenciacao(1000000, 1000000);
        double resultadoEsperado = Double.POSITIVE_INFINITY;

        if (resultadoEsperado != result) {
            throw new AssertionError("Teste falhou: esperado " + resultadoEsperado + ", mas foi " + result);

        }
    }

    //Caso de Teste 13,14 e 15 (Soma)
    @Test
    public void deveriaTestarSoma(){

        double result = operacoes.soma(10,10);

        assertEquals(20,result,0);
        assertFalse(20 == 21, "valor esperado é 21, porem o valor certo é " + result );
        assertTrue(20 == 20);
    }




}





