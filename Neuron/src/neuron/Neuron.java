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
public class Neuron {

    private int NoOfInput;
    private float[] inputs;
    private float[] weights;
    private float sum;
    int i = 0;
    private float Threshhold;
    int value;

    public Neuron(float Threshhold) {

        this.Threshhold = Threshhold;
        NoOfInput = 4;
        inputs = new float[NoOfInput];
        weights = new float[NoOfInput];
    }

    public void input(float input, float weight) {
        inputs[i] = input;
        weights[i] = weight;
        i++;
        if (i == 4) {
            calculate();
        }
    }

    public void calculate() {

        for (int x = 0; x < NoOfInput; x++) {
            sum += (inputs[x] * weights[x]);
        }
        if (sum > Threshhold) {
            System.out.println("1");

        } else {
            System.out.println("0");
        }

    }

}
