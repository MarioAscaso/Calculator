package Mathematical;

public class Mathematical{

    public int add(int operator1, int operator2){return operator1 + operator2;}

    public int subtract(int operator1, int operator2){return operator1 - operator2;}
    public int multiply(int operator1, int operator2){
        int multiply = operator2;
        for(int i = 1; i < operator1; i++){
            multiply += operator2;
        }
    return multiply;
    }
    public int divide(int operator1, int operator2){
        int divide = operator1;
        int quotient = 0;
        do{
            divide -= operator2;
            quotient++;
        }while(divide > 0 && operator2 !=0);
        return quotient;
    }
}