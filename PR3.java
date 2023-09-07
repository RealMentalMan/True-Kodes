import java.util.*;

public class PR3 {
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);
        int sttr = scc.nextInt();
        double arr[] = new double[sttr];
        Random R = new Random();
        for (int i = 0; i < arr.length; i++){

            //arr[i] = Math.random() * 10;
            arr[i] = R.nextDouble() * 10;

        }
        System.out.println("До сортировки");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        Arrays.sort(arr);
        System.out.println("После сортировки");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
