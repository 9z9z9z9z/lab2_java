public class ColoredLinen extends Linen
{
    private Main.Color color;
    
    ColoredLinen()
    {
    	this.tWashing = 40;
    	this.tIroning = 30;
        this.color = Main.Color.light;
    }

    ColoredLinen(int tWashing, int tIroning, Main.Color color)
    {
    	this.tWashing = tWashing;
    	this.tIroning = tIroning;
        this.color = color;
    }

    public Main.Color getColor() {
        return this.color;
    }
    
    @Override
    public String toString()
    {
        return "\nTemperature of washing:\t" + String.valueOf(this.tWashing)
        + "\nTemperature of ironing:\t" + String.valueOf(this.tIroning) + "\nColor:\t" + color;
    }
}
