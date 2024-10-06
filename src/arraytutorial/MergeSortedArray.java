package src.arraytutorial;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {2};
        mergeSortedArray(a,b);
    }
    private static void mergeSortedArray(int[] a, int[] b) {
        int firstArrayLength = a.length;
        int secondArrayLength = b.length;

        int[] c = new int[firstArrayLength + secondArrayLength];
        int i = 0;
        int j = 0;
        int k=0;
        while(i< firstArrayLength && j < secondArrayLength) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < firstArrayLength)
            c[k++] = a[i++];

       while (j < secondArrayLength)
            c[k++] = b[j++];

        for(int l=0;l<=c.length-1;l++){
            System.out.println(c[l]);
        }
        int x=c.length;
        double d=0.00;
        if((x)%2 ==0 ){
            int h= c[(x/2)-1]+c[(x/2)];
            d= (double) h/2;
        }else{
            d= c[((x+1)/2)-1];

        }

        System.out.println(d);

    }

}
