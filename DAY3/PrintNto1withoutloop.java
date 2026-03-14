
public class PrintNto1withoutloop {

    public static void main(String[] args) {
        int N = 10;
        PrintNto1withoutloop p = new PrintNto1withoutloop();
        p.printNos(N);
    }

    void printNos(int N) {
        // code here
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }
}
