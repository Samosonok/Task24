import java.util.*;

public class Main {

    public static void main(String[] args) {
        WritingTools[] writingTools = new WritingTools[10];
        Random rand = new Random();
        int max = 5;
        int min = 3;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int randomNumber = rand.nextInt(3);
            if (randomNumber == 1) {
                Pen pen = new Pen();
                writingTools[i] = pen;
                char[] penSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a PEN and press enter");
                for (int d = 0; d < penSymbols.length; d++) {
                    penSymbols[d] = sc.next().charAt(0);
                }
                pen.write(builder, penSymbols);
                System.out.println("Remainder: " + pen.writingItem);
            } else if (randomNumber == 2) {
                Pencil pencil = new Pencil();
                writingTools[i] = pencil;
                char[] pencilSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a PENCIL and press enter");
                for (int d = 0; d < pencilSymbols.length; d++) {
                    pencilSymbols[d] = sc.next().charAt(0);
                }
                pencil.write(builder, pencilSymbols);
                pencil.erase(builder);
                System.out.println("Remainder: " + pencil.writingItem);
            } else {
                Marker marker = new Marker();
                writingTools[i] = marker;
                char[] markerSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a MARKER and press enter");
                for (int d = 0; d < markerSymbols.length; d++) {
                    markerSymbols[d] = sc.next().charAt(0);
                }
                marker.write(builder, markerSymbols);
                System.out.println("Remainder: " + marker.writingItem);
            }
        }
        System.out.println(Arrays.toString(writingTools));
        MyComparator myComparator = new MyComparator();
        Arrays.sort(writingTools, myComparator);
        System.out.println(Arrays.toString(writingTools));
    }
}
