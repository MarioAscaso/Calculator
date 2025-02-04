package Input;
import java.util.Scanner;

public class Input{

    Scanner sc = new Scanner(System.in);
    private int valorInt;
    private float valorFloat;

    public void getI(){valorInt = sc.nextInt();}
    public int getInt(){
         getI();
         return valorInt;
    }
    public void getF(){valorFloat = sc.nextFloat();}
    public float getFloat(){
        getF();
        return valorFloat;}
}



