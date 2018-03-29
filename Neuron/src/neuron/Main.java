/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;

/**
 *
 * @author samit
 */
public class Main {

    public static void main(String[] args) {

        Neuron NN = new Neuron(0.5f);

        NN.input(1.5f, 0.3f);
        NN.input(2.2f, 0.4f);
        NN.input(7.7f, 0.1f);
        NN.input(0.42f, 0.8f);

    }

}
