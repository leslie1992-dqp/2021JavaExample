import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//控制数组的数并且排序
public class LotteryDrawing {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("How many numbers do you want to draw? ");
        int k=in.nextInt();
        System.out.println("What is the highest number you want to draw? ");
        int n=in.nextInt();
        int [] numbers=new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        int [] results=new int[k];
        for(int i=0;i<numbers.length;i++){
            int r=(int) (Math.random()*n);
            results[i]=numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(results);
        System.out.println("Bet the combination,I will let you rich!");
        for(int r:results){
            System.out.println(r);
        }
    }
}
