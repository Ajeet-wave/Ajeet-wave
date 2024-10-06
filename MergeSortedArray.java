public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {0,3,4,31};
        int[] b = {4,6,30};
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
    }

}
