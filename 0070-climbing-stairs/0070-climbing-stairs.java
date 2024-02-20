import java.util.Scanner;
class Solution {

    public static int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        int[] a=new int[n+1];
        a[1]=1;
        a[2]=2;
        for(int i=3;i<=n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
        
    }
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int res=climbStairs(n);
        System.out.print(res);

        

    }
}