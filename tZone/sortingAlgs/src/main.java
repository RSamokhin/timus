import java.io.*;

public class main {
    public static void main(String[] args) 
    {
        PrintWriter out = new PrintWriter(System.out);
        int n = 10;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i]=(int)(Math.random()*1000);
            out.print(a[i]+" ");
        }
        a = mergeSort(a,n);
        //a = bubbleSort(a);
        out.println();
        for (int i:a)
            out.print(i+" ");
        out.flush();
    }
    ////bubblesort
    private static int[] bubbleSort(int[] a){
        for (int j=a.length-1 ; j>=0 ; j--){
            for (int g = 0 ; g < j; g++){
                if (a[j]<a[g]){
                    int t = a[j];
                    a[j]=a[g];
                    a[g]=t;
                }
            }
        }
        return a;
    }
    ////mergesort
    private static int[] mergeSort(int[] a,int n){
        if (n == 1) 
                return a;
        int middle = n/2;
        int [] left =  new int[middle];
        int [] right = new int[n-middle];
        for (int i = 0 ; i < n ; i++)
            if(i<middle)
                left[i]=a[i];
            else
                right[i-middle]=a[i];
        return merge(mergeSort(left,middle),mergeSort(right,n-middle));         
        
    }
    static int[] merge(int[] a,int[] b){
        if (a.length==0)
            return b;
        if (b.length==0)
            return a;
        if (a[0]<b[0]){
            int t = a[0];
            int[] r = new int[a.length-1];
            for(int i = 0 ; i < r.length ; i++){
                r[i]= a[i+1];
            }
            return mergeConcat(t,merge(r,b));
           
        }
        else{
            int t = b[0];
            int[] r = new int[b.length-1];
            for(int i = 0 ; i < r.length ; i++){
                r[i]= b[i+1];
            }
            return mergeConcat(t,merge(a,r));
        }
    }
    static int[]mergeConcat(int f,int[]s){
        int[] b = new int[1+s.length];
        b[0]=f;
        for (int i = 1 ; i < b.length ; i++)
            b[i]=s[i-1];
        return b;
    }
}