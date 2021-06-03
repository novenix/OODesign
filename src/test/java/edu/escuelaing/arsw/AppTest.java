package edu.escuelaing.arsw;

import static org.junit.Assert.assertTrue;

//import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testCase1()
    {

        String path ="example.txt";
        App.main(new String[]{path});
        Assert.assertEquals(638.9,App.meanR ,0.1);
        Assert.assertEquals(625.6339806770231,App.stdR ,0.1);
    }
    @Test
    public void testCase2()
    {
        String path ="example2.txt";
        App.main(new String[]{path});
        Assert.assertEquals(60.32000000000001,App.meanR ,0.1);
        Assert.assertEquals(62.25583060601187,App.stdR ,0.1);

    }

}
