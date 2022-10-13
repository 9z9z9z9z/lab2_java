import java.util.Scanner;

public class Main
{
    public static int inputInt(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input integer number\n");
            if (sc.hasNextInt()){
                return sc.nextInt();
            }
        }

    }
    public static ColoredLinen inputLinen()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================\n");
        System.out.println("Input temperature of washing\n");
        int tempW = inputInt();
        System.out.println("Input temperature of ironing\n");
        int tempI = inputInt();
        System.out.println("Input color of linen: dark / light / colored\n");

        Main.Color color = Main.Color.valueOf(sc.nextLine());
        ColoredLinen ans = new ColoredLinen(tempW, tempI, color);
        return  ans;
    }
    public enum Color
    {
        light("light"),
        dark("dark"),
        colored("colored");
        private String color;
        Color(String color)
        {
            this.color = color;
        }
        public String getColor(){
            return color;
        }
    };

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of linens\n");
        int num = inputInt();
        System.out.println("Input temperature of machine");
        int temp = inputInt();
        System.out.println("Input color of linen");
        Main.Color color = Color.valueOf(sc.nextLine());
        WashingMachine machine = new WashingMachine(temp, color, "Mef", "Ariel");
        ColoredLinen[] basket = new ColoredLinen[num];
        for (int i = 0; i < num; i++)
        {
            basket[i] = inputLinen();
        }
        for (ColoredLinen linen : basket)
        {
            machine.Load(linen);
        }
        for (int i = 0; i < machine.linens.length; i++) 
        {
        	if (machine.linens[i] != null) 
        		System.out.println(machine.linens[i].toString());
        	else {
        		System.out.println("This machine is a void!");
        		break;
        	}
        }
    }
}
