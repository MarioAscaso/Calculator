package Input;
import java.util.Scanner;

public class Input{
    Scanner sc = new Scanner(System.in);

    public int getOptionMenu(){
        return sc.nextInt();
    }

    public int getOperator(){
        return sc.nextInt();
    }

    public float getComponent(){
        return sc.nextFloat();
    }
}



