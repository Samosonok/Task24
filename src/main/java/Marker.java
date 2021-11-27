public class Marker extends WritingTools {

    private static final double MARKER_CONSUMPTION_PER_CHAR_20 = 1.0;
    private static final double MARKER_CONSUMPTION_PER_CHAR_21_40 = 1.09;
    private static final double MARKER_CONSUMPTION_PER_CHAR_41 = 1.21;
    private int writtenCharsCounterForMarker;

    public Marker(String name) {
        super(name);
    }

    @Override
    public void write(StringBuilder builder, char[] chars) {
        for (char m : chars) {
            builder.append(m);
            decreaseWritingItem();
            writtenCharsCounterForMarker++;
        }
    }

    @Override
    public void erase(StringBuilder builder) {
        throw new UnsupportedOperationException("Erasing is not supported");
    }

    @Override
    protected double getConsumptionPerChar() {
        if(writtenCharsCounterForMarker <= 20){
            return MARKER_CONSUMPTION_PER_CHAR_20;
        } else if(writtenCharsCounterForMarker > 40){
            return MARKER_CONSUMPTION_PER_CHAR_41;
        } else return MARKER_CONSUMPTION_PER_CHAR_21_40;
    }
}
