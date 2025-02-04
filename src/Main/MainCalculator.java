package Main;

import Output.Output;
import Input.Input;
import Validator.Validator;
import Mathematical.Mathematical;
import Mathematical.Vector;
import Mathematical.ComplexNumber;

/**
 *
 * @author Mario Ascaso
 */

public class MainCalculator {

    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    private static final int ADD_VECTORS = 5;
    private static final int ADD_COMPLEX_NUMBERS = 6;
    private static final int EXIT = 7;

    private static int optionMenu;

    private static int[] operandos;
    private static float[] listaFloat;
    private static Vector[] listaVector;
    private static ComplexNumber[] listaCN;

    private static Output output;
    private static Input input;
    private static Validator validator;
    private static Mathematical mathematical;
    private static Vector vector;
    private static ComplexNumber complexNumber;

    public static void main(String[] args) {
        output = new Output();
        input = new Input();
        validator = new Validator();
        mathematical = new Mathematical();
        vector = new Vector();
        complexNumber = new ComplexNumber();

        operandos = new int[2];
        listaFloat = new float[2];
        
        listaVector = new Vector[2];
        listaCN = new ComplexNumber[2];

        boolean isValidOptionMenu;
        boolean isValidDivide;
        int result;

        do {
            do {
                showMenu();
                askOptionMenu();
                getOptionMenu();
                isValidOptionMenu = isValidOptionMenu();
            }while(!isValidOptionMenu);

            switch (optionMenu) {
                case ADD:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = add();
                    System.out.println(result);
                    break;
                case SUBTRACT:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = subtract();
                    System.out.println(result);
                    break;
                case MULTIPLY:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = multiply();
                    System.out.println(result);
                    break;
                case DIVIDE:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    isValidDivide = isValidDivide();
                    if (!isValidDivide) {
                        do {
                            askOperator();
                            getOperator2();
                            isValidDivide = isValidDivide();
                        } while (!isValidDivide);
                    }
                    result = divide();
                    System.out.println(result);
                    break;
                case ADD_VECTORS:
                    askComponent();
                    getComponent1();
                    askComponent();
                    getComponent2();
                    listaVector[0] = new Vector(listaFloat[0], listaFloat[1]);
                    askComponent();
                    getComponent1();
                    askComponent();
                    getComponent2();
                    listaVector[1] = new Vector(listaFloat[0], listaFloat[1]);
                    Vector vector = addVector();
                    System.out.println(vector);
                    break;
                case ADD_COMPLEX_NUMBERS:
                    askRealPart();
                    getRealPart();
                    askImaginaryPart();
                    getImaginaryPart();
                    listaCN[0] = new ComplexNumber(listaFloat[0], listaFloat[1]);
                    askRealPart();
                    getRealPart();
                    askImaginaryPart();
                    getImaginaryPart();
                    listaCN[1] = new ComplexNumber(listaFloat[0], listaFloat[1]);
                    ComplexNumber complexNumber = addComplexNumber();
                    System.out.println(complexNumber);
                    break;
                default:
            }
        }while(optionMenu != EXIT);
        System.exit(0);

    }

    public static void showMenu(){output.showMenu();}
    public static void askOptionMenu(){output.askOptionMenu();}
    public static void getOptionMenu(){optionMenu = input.getInt();}
    public static boolean isValidOptionMenu(){return validator.isValidOptionMenu(optionMenu);}

    public static void askOperator(){output.askOperator();}
    public static void getOperator1(){operandos[0] = input.getInt();}
    public static void getOperator2(){operandos[1] = input.getInt();}
    public static boolean isValidDivide(){return validator.isValidDivide(operandos[1]);}

    public static int add(){return mathematical.add(operandos[0], operandos[1]);}
    public static int subtract(){return mathematical.subtract(operandos[0], operandos[1]);}
    public static int multiply(){return mathematical.multiply(operandos[0], operandos[1]);}
    public static int divide(){return mathematical.divide(operandos[0], operandos[1]);}

    public static void askComponent(){output.askComponent();}
    public static void getComponent1(){listaFloat[0] = input.getFloat();}
    public static void getComponent2(){listaFloat[1] = input.getFloat();}
    public static Vector addVector(){return vector.addVector(listaVector[0], listaVector[1]);}

    public static void askRealPart(){output.askRealPart();}
    public static void askImaginaryPart(){output.askImaginaryPart();}
    public static void getRealPart(){listaFloat[0] = input.getFloat();}
    public static void getImaginaryPart(){listaFloat[1] = input.getFloat();}
    public static ComplexNumber addComplexNumber(){return complexNumber.addComplexNumber(listaCN[0], listaCN[1]);}

}