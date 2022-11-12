import java.util.Arrays;
import java.util.Random;

public class ClassA implements IClassA{
    private final int[] arr=new int[15];
    private static final Random random=new Random();



    @Override
    public void setValue(int min,int max) {
        max=Math.max(min,max);
        min=Math.min(min,max);
        for (int i = 0; i <arr.length ; i++)
        {arr[i]=random. nextInt((max - min) + 1) + min;
        }
    }

    public int getMoreThanIndex(){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<i){
                sum+=arr[i];
            }

        }
        return sum;
    }

    public int getLessThanIndex(){
        boolean exists=false;
        int mult=1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>i){
                exists=true;
                mult=mult*i;
            }
        }
        if(!exists){
            return 0;
        }
        return  mult;
    }

    public void getEven(){
        for (int i = 0; i <arr.length ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}


