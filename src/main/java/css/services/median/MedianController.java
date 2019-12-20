package css.services.median;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MedianController {

    @RequestMapping("/")
    public String calcMedian(String values)
    {
        int median = 0;
        if (values == null || values.isEmpty())
            return "Unable to calculate median.  No input values received.";

        String[] tokens = values.split(",");
        System.out.println("tokens count = "+tokens.length);
        int[] data = new int[tokens.length];
        try {
            for (int i = 0; i < tokens.length; i++) {
                data[i] = Integer.parseInt(tokens[i]);
            }
        } catch (Exception e)
        {
            return "ERROR parsing input string: " + e.toString();
        }
        System.out.println("data count = "+data.length);
        Arrays.stream(data).forEach(System.out::println);
        System.out.println("data count = "+data.length);
        //calc median
        Arrays.sort(data);
        Arrays.stream(data).forEach(System.out::println);
        int midIndex = (int)data.length / 2;
        if (data.length % 2 > 0)
        {
            median = data[midIndex];
        }
        else
        {
            midIndex--;
            median = (int) ((data[midIndex] + data[midIndex+1]) / 2);
        }
        return "The median for the input string is " + median;
    }
}
