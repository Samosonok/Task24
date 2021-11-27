public abstract class WritingTools {

    protected double writingItem = 100.0;

    public abstract void write(StringBuilder builder, char[] chars);

    public abstract void erase(StringBuilder builder);

    protected abstract double getConsumptionPerChar();

    protected void decreaseWritingItem(){
        writingItem -= getConsumptionPerChar();
    }
}
