import java.util.Comparator;

public class MyComparator implements Comparator<WritingTools> {

    @Override
    public int compare(WritingTools o1, WritingTools o2) {
        return Double.compare(o1.writingItem, o2.writingItem);
    }
}
