import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pen pen = new Pen("Pen");
        Pencil pencil = new Pencil("Pencil");
        Marker marker = new Marker("Marker");

        WritingTools[] writingTools = new WritingTools[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(3);
            if (randomNumber == 1) {
                writingTools[i] = pen;
            } else if (randomNumber == 2) {
                writingTools[i] = pencil;
            } else
                writingTools[i] = marker;
        }

        StringBuilder builder = new StringBuilder();

        for (Object o : writingTools) {
            int max = 5;
            int min = 3;
            Scanner sc = new Scanner(System.in);
            if (o.equals(pen)) {
                char[] penSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a PEN and press enter");
                for (int d = 0; d < penSymbols.length; d++) {
                    penSymbols[d] = sc.next().charAt(0);
                }
                pen.write(builder, penSymbols);
            } else if (o.equals(pencil)) {
                char[] pencilSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a PENCIL and press enter");
                for (int d = 0; d < pencilSymbols.length; d++) {
                    pencilSymbols[d] = sc.next().charAt(0);
                }
                pencil.write(builder, pencilSymbols);
                pencil.erase(builder);
            } else if (o.equals(marker)) {
                char[] markerSymbols = new char[rand.nextInt((max - min) + 1) + min];
                System.out.println("Write some character with a MARKER and press enter");
                for (int d = 0; d < markerSymbols.length; d++) {
                     markerSymbols[d] = sc.next().charAt(0);
                }
                marker.write(builder, markerSymbols);
            }
        }

        String penRemainder = Rounder.roundValue(pen.writingItem);
        String pencilRemainder = Rounder.roundValue(pencil.writingItem);
        String markerRemainder = Rounder.roundValue(marker.writingItem);

        String[] sortedTools = {penRemainder + " = " + pen.name,
                pencilRemainder + " = " + pencil.name,
                markerRemainder + " = " + marker.name};
        Arrays.sort(sortedTools);
        System.out.println(Arrays.toString(sortedTools));
    }
}
