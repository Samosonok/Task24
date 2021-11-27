public class Pen extends WritingTools {

    private static final double PEN_CONSUMPTION_PER_CHAR = 1.15;

    public Pen(String name) {
        super(name);
    }

    @Override
    public void write(StringBuilder builder, char[] chars) {
        for (char c : chars) {
            builder.append(c);
            decreaseWritingItem();
        }
    }

    @Override
    public void erase(StringBuilder builder) {
        throw new UnsupportedOperationException("Erasing is not supported");
    }

    @Override
    protected double getConsumptionPerChar() {
        return PEN_CONSUMPTION_PER_CHAR;
    }
}
