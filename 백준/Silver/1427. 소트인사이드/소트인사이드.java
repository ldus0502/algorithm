import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int[] arrayN = new int[10];
        int j=0;
        int i=0;
        for(i=0; i<10;i++){
            arrayN[i]=n%10;
            n=n/10;

            if(n<1) {
                break;
            }
        }

        Integer[] arr2 = Arrays.stream(arrayN).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr2, Collections.reverseOrder());

        while(j<=i){
            System.out.print(arr2[j]);
            j++;
        }
    }
}
