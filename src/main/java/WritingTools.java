public abstract class WritingTools {

    protected double writingItem = 100.0;
    protected String name;

    public WritingTools(String name) {
        this.name = name;
    }

    public abstract void write(StringBuilder builder, char[] chars);

    public abstract void erase(StringBuilder builder);

    protected abstract double getConsumptionPerChar();

    protected void decreaseWritingItem(){
        writingItem -= getConsumptionPerChar();
    }
}
