import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main
{

    public static void main(String[] args)
    {
       pi();
       System.out.println();
       System.out.println(max(new int[]{1,2, 5, 8, 11, 6, 10, 10, 5, 7})); 
       System.out.println();
       drawRectangle(5, 20);
       System.out.println();
       System.out.println(countWords("Hello world...    I am doing my   tasks."));
       System.out.println();
       String[] arr = filter(new String[] {"one", "two", "tree", "four", "five", "six", "seven"});
       System.out.println(Arrays.toString(arr));
    }
    
    private static void pi()
    {
        System.out.print("Pi: ");
        BigDecimal pi = new BigDecimal(Math.PI);
        for(int i = 1; i < 6; i++)
        {
            System.out.print(pi.setScale(i, RoundingMode.HALF_EVEN)+"; ");
        }
    }

    private static int max(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
               if (max < arr[i])
                   max = arr[i];
        }
        
        return max; 
    }
    
    private static void drawRectangle(int height, int width)
    {
        for(int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
    private static int countWords(String s)
    {
        int length = s.split(" +").length;
        return length;
    }
    
    private static String[] filter(String[] input)
    {
        String[] arr = Arrays.stream(input).
                filter(string -> string.length() > 3).
                toArray(String[]::new);
        return arr;
    }
}
