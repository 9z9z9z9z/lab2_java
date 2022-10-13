public class WashingMachine {
    public Main.Color color;
    public int temperature;
    public String powdertype;
    public String conditioner;
    boolean flag = false;
    public ColoredLinen[] linens = new ColoredLinen[1];
    
    public WashingMachine()
    {
        this.color = Main.Color.light;
        this.temperature = 30;
        this.powdertype = "Mif";
        this.conditioner = "Same";
    }
    public WashingMachine(int temperature, Main.Color color,  String powdertype, String conditioner)
    {
        this.color = color;
        this.temperature = temperature;
        this.powdertype = powdertype;
        this.conditioner = conditioner;

    }

    public void Load(ColoredLinen linen)
    {
    	if (!flag && this.temperature == linen.gettWashing() && this.color == linen.getColor()) {
    		linens[0] = linen;
    		flag = true;
    	}
    	else if (flag && this.temperature == linen.gettWashing() && this.color == linen.getColor())
        {
            ColoredLinen[] tmp = new ColoredLinen[linens.length + 1];
            for (int i = 0; i < linens.length; i++)
            {
                tmp[i] = linens[i];
            }
            tmp[linens.length] = linen;
            linens = new ColoredLinen[tmp.length];
            for (int i = 0; i < tmp.length; i++)
            {
                linens[i] = tmp[i];
            }
        }
    }
}
