package ru.appline;

public class Variables {
    public static void main(String[] args) {
        Variables test = new Variables();
        test.printVar();
    }
    public void printVar() {
        double double_var;
        double_var = 12.5;
        byte byte_var;
        byte_var = 127;
        System.out.println(double_var);
        System.out.println(byte_var);
    }
}
