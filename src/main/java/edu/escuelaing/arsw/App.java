package edu.escuelaing.arsw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Double meanR;
    public static Double stdR;
    public static Double getMeanR() {
        return meanR;
    }

    public static Double getStdR() {
        return stdR;
    }


    public static void main( String[] args )
    {
        String filename = args [0];
        Path path = Paths.get(filename);
        LinkedList<Double> listica = new LinkedList<>();


        try (Stream<String> stream = Files.lines(path)) {
            for(String i:stream.collect(Collectors.toList())){
                listica.add(Double.parseDouble(i.trim()));
            }
            for(Double i: listica){
                System.out.println(i);
            }
            Mean mean = new Mean(listica);
            System.out.println(mean.getMean());
            StandartDeviation std = new StandartDeviation(listica,mean.getMean());
            System.out.println(std.getStandardDeviation());
            stdR=std.getStandardDeviation();
            meanR=mean.getMean();
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}
