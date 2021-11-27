public class Pencil extends WritingTools {

    private static final double PENCIL_CONSUMPTION_PER_CHAR = 0.95;
    private int writtenCharsCounterForPencil;

    public Pencil(String name) {
        super(name);
    }

    @Override
    public void write(StringBuilder builder, char[] chars) {
        for (char s : chars) {
            builder.append(s);
            decreaseWritingItem();
            writtenCharsCounterForPencil++;
            if(writtenCharsCounterForPencil % 20 == 0){
                getSharpenedPencil();
            }
        }
    }

    @Override
    public void erase(StringBuilder builder) {
        builder.deleteCharAt(builder.length()-1);
    }

    @Override
    protected double getConsumptionPerChar() {
        return PENCIL_CONSUMPTION_PER_CHAR;
    }

    public void getSharpenedPencil(){
        writingItem -= 3;
    }
}
