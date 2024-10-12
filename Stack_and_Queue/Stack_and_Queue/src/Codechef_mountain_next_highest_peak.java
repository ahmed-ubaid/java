import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Codechef_mountain_next_highest_peak {
    public static Scanner sc=new Scanner(System.in);
    public static int[] mountain(int[] hei){
        int n=hei.length;
        int[] ret=new int[n];
        Arrays.fill(ret,-1);
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && hei[i]>hei[st.peek()]){
                int idx=st.pop();
                ret[idx]=hei[i];
            }
            st.push(i);
        }
        return ret;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of the mountain range");
        int n=sc.nextInt();

        int[] height=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter height of mountain["+i+"]: ");
            height[i]=sc.nextInt();
        }

    }
}
