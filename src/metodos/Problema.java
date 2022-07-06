/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Random;

/**
 *
 * @author Josue
 */
public class Problema {

    private int sumando1;
    private char operandor;
    private int sumando2;
    private int respuesta;
    
    public Problema() {
        char operadores[] = {'+', '-', '*', '/'};
        operandor = operadores[getAleatorio(operadores.length)];
        switch (operandor) {
            case '+':
                sumando1 = getAleatorio(10);
                sumando2 = getAleatorio(10);
                respuesta = sumando1 + sumando2;
                break;
            case '-':
                sumando1 = getAleatorio(10);
                sumando2 = getAleatorio(10);
                if (sumando1 < sumando2) {
                    int tmp = sumando1;
                    sumando1 = sumando2;
                    sumando2 = tmp;
                }
                respuesta = sumando1 - sumando2;
                break;
            case '*':
                sumando1 = getAleatorio(10);
                sumando2 = getAleatorio(10);
                respuesta = sumando1 * sumando2;
                break;
            case '/':
                respuesta = getAleatorio(9) + 1;
                sumando2 = getAleatorio(9) + 1;
                sumando1 = sumando2 * respuesta;
                break;
        }
    }

    public Problema(int sumando1, char operandor, int sumando2, int respuesta) {
        this.sumando1 = sumando1;
        this.operandor = operandor;
        this.sumando2 = sumando2;
        this.respuesta = respuesta;
    }

    public static int getAleatorio(int max) {
        return (int)(Math.floor(Math.random() * max));
    }

    public int getSumando1() {
        return sumando1;
    }

    public char getOperandor() {
        return operandor;
    }

    public int getSumando2() {
        return sumando2;
    }

    public int getRespuesta() {
        return respuesta;
    }

}
