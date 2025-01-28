package Validator;

public class Validator{
    public boolean isValidOptionMenu(int optionMenu){
        return 0 < optionMenu && optionMenu < 8;
    }

    public boolean isValidDivide(int operator2){
        return operator2 > 0;
    }
}