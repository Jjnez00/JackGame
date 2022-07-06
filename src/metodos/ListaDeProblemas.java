/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Josue
 */
public class ListaDeProblemas {
    private int sumando1;
    private char operandor;
    private int sumando2;
    private int respuesta;

    public ListaDeProblemas(int sumando1, char operandor, int sumando2, int respuesta) {
        this.sumando1 = sumando1;
        this.operandor = operandor;
        this.sumando2 = sumando2;
        this.respuesta = respuesta;
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
