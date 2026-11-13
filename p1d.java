public class p1d {
    public static void main(String[] args) {
        int L[] = {1,2,3,4,5}, sum = 0;

        System.out.println("Elements: ");
        for (int i = 0; i<L.length; i++) {
            sum += L[i];
            System.out.println(L[i]);
        }
        
        System.out.println("\nSum: "+sum);
    }
    
}
