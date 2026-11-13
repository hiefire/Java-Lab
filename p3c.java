public class p3c {

    static int[] L = {100, 2, 13, 4, 15};
    static int[][] m = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    },
    n = {
        {0,8,7},
        {0,1,2},
        {0,0,5},
    };

    public static void main(String[] args) {
        print("L:");
        for (int i : L) print(""+i);

        for (int i=0; i<L.length;i++) for (int j=0; j<L.length;j++) if (L[i] < L[j]) {
            int t = L[i];
            L[i] = L[j];
            L[j] = t;
        };

        print("\nSorted L:");
        for (int i : L) print(""+i);

        print("\n\n3x3 Matrix Addition:");
        
        String row="", rowm="", rown="";
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                rowm += m[i][j]+" ";
                rown += n[i][j]+" ";
                m[i][j] += n[i][j];
                row += m[i][j]+" ";
            }
            rowm+="\n";
            rown+="\n";
            row+="\n";
        }
        
        print("\nM:\n"+rowm+"\nN:\n"+rown+"\nM + N:\n"+row);

    }

    static void print(String text) {
        System.out.println(text);
    }
    
}
