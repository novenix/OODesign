package edu.escuelaing.arsw;

public class StandartDeviation {
    private LinkedList<Double> lista;

    public double getStandardDeviation() {
        return standardDeviation;
    }

    private double standardDeviation;
    public StandartDeviation(LinkedList<Double> listica, double mean) {
        lista=listica;


        for(double num: listica) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        standardDeviation= Math.sqrt(standardDeviation/(lista.size()-1) );

    }
}
