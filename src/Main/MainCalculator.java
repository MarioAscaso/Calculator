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
    private static int operator1;
    private static int operator2;
    private static float component1;
    private static float component2;
    private static float realPart;
    private static float imaginaryPart;

    private static int[] listaInt;
    private static float[] listaFloat;

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

        listaInt = new int[2];
        listaFloat = new float[2];

        boolean isValidOptionMenu;
        boolean isValidDivide;
        int result;

        do {
            do {
                showMenu();
                askOptionMenu();
                getOptionMenu();
                isValidOptionMenu=isValidOptionMenu();
            }while(!isValidOptionMenu);

            switch (optionMenu) {
                case ADD:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = add(operator1, operator2);
                    System.out.println(result);
                    break;
                case SUBTRACT:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = subtract(operator1, operator2);
                    System.out.println(result);
                    break;
                case MULTIPLY:
                    askOperator();
                    getOperator1();
                    askOperator();
                    getOperator2();
                    result = multiply(operator1, operator2);
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
                    result = divide(operator1, operator2);
                    System.out.println(result);
                    break;
                case ADD_VECTORS:
                    askComponent();
                    getComponent1();
                    askComponent();
                    getComponent2();
                    Vector v1 = new Vector(component1, component2);

                    askComponent();
                    getComponent1();
                    askComponent();
                    getComponent2();
                    Vector v2 = new Vector(component1, component2);

                    Vector vector = addVector(v1, v2);

                    System.out.println(vector);
                    break;
                case ADD_COMPLEX_NUMBERS:
                    askRealPart();
                    getRealPart();
                    askImaginaryPart();
                    getImaginaryPart();
                    ComplexNumber cn1 = new ComplexNumber(realPart, imaginaryPart);

                    askRealPart();
                    getRealPart();
                    askImaginaryPart();
                    getImaginaryPart();
                    ComplexNumber cn2 = new ComplexNumber(realPart, imaginaryPart);

                    ComplexNumber complexNumber = addComplexNumber(cn1, cn2);

                    System.out.println(complexNumber);
                    break;
                default:
            }
        }while(optionMenu != EXIT);
        System.exit(0);

    }

    public static void showMenu(){output.showMenu();}
    public static void askOptionMenu(){output.askOptionMenu();}
    public static void getOptionMenu(){optionMenu = input.getOptionMenu();}
    public static boolean isValidOptionMenu(){return validator.isValidOptionMenu(optionMenu);}

    public static void askOperator(){output.askOperator();}
    public static void getOperator1(){operator1 = input.getOperator();}
    public static void getOperator2(){operator2 = input.getOperator();}
    public static boolean isValidDivide(){return validator.isValidDivide(operator2);}

    public static int add(int operator1, int operator2){return mathematical.add(operator1, operator2);}
    public static int subtract(int operator1, int operator2){return mathematical.subtract(operator1, operator2);}
    public static int multiply(int operator1, int operator2){return mathematical.multiply(operator1, operator2);}
    public static int divide(int operator1, int operator2){return mathematical.divide(operator1, operator2);}

    public static void askComponent(){output.askComponent();}
    public static void getComponent1(){component1=input.getComponent();}
    public static void getComponent2(){component2=input.getComponent();}
    public static Vector addVector(Vector v1, Vector v2){return vector.addVector(v1, v2);}

    public static void askRealPart(){output.askRealPart();}
    public static void askImaginaryPart(){output.askImaginaryPart();}
    public static void getRealPart(){realPart = input.getComponent();}
    public static void getImaginaryPart(){imaginaryPart = input.getComponent();}
    public static ComplexNumber addComplexNumber(ComplexNumber cn1, ComplexNumber cn2){return complexNumber.addComplexNumber(cn1, cn2);}

}