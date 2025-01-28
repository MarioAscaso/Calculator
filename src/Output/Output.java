package Output;

/**
 *
 * @author Mario Ascaso
 */

public class Output {
    public void showMenu() {
        System.out.println("""
                1 - ADD
                2 - SUBTRACT
                3 - MULTIPLY
                4 - DIVIDE
                5 - ADD VECTORS
                6 - ADD COMPLEX NUMBERS
                7 - EXIT
                """);
    }
    public void askOptionMenu(){System.out.print("Enter option to perform: ");}
    public void askOperator(){System.out.print("Enter operator: ");}
    public void askComponent(){System.out.print("Enter component: ");}
    public void askRealPart(){System.out.print("Enter real part: ");}
    public void askImaginaryPart(){System.out.print("Enter imaginary part: ");}

}