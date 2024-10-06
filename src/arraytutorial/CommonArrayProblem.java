package src.arraytutorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CommonArrayProblem {
    public static void main(String[] args) {
        int[] a = {'a', 'b', 'c', 'd'};
        int[] b = {'x', 'y', 'z', 'c'};
        boolean x=checkExistingValue(a, b);
        System.out.println(x);


    }

    private static boolean checkExistingValue(int[] a, int[] b) {
        for (int i = 0; i <= (a.length - 1); i++) {
            for (int j = 0; j <= (b.length - 1); j++) {

                if (a[i] == b[j]) {
                  return true;
                }

            }
        }

        return false;
    }
}
