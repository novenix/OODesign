package edu.escuelaing.arsw;

public class Mean {
    private double mean;
    private double sum = 0;
    private LinkedList<Double> lista;
    private void setMean(){
        mean = sum / lista.size();
    }
    public double getMean(){
        return mean;
    }
    public Mean(LinkedList<Double> listica) {
        lista=listica;
        for(Double i: lista){
            sum += i;
            System.out.println(i);
        }
        setMean();
    }
}
