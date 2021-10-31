package AP2;

import javax.swing.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Input {
    private String textString;
    private float textFloat;
    private Double textDouble;
    private int textInt;
    private char textChar;
    private Scanner Utils = new Scanner(System.in);
    public static int modo = 0; //modo = 0 - modo Scanner / modo > 0 - modo JOptionPane

    // 1- String

    public String lerString() {
        if (modo==0) {
            System.out.println("Escreva uma String: ");
            return textString = Utils.nextLine();
        }else{
            return JOptionPane.showInputDialog("Escreva uma String:");
        }
    }
    public String lerString(String msg) {
        if (modo==0) {
            System.out.println(msg);
            return textString = Utils.nextLine();
        }else{
            return JOptionPane.showInputDialog(msg);
        }
    }

    //2 - Float

    public float lerFloat() {
        if (modo==0) {
            System.out.println("Escreva um Float: ");
            return textFloat = Utils.nextFloat();
        }else{
            return Float.parseFloat(JOptionPane.showInputDialog("Escreva um Float:"));
        }
    }

    public float lerFloat(String msg) {
        if(modo==0) {
            System.out.println(msg);
            return textFloat = Utils.nextFloat();
        }else{
            return Float.parseFloat(JOptionPane.showInputDialog(msg));
        }
    }

    //3 - Double

    public Double lerDouble() {
        if(modo==0) {
            System.out.println("Escreva um Double: ");
            return textDouble = Utils.nextDouble();
        }else {
            return Double.valueOf(JOptionPane.showInputDialog("Escreva um Double:"));
        }
    }
    public Double lerDouble(String msg) {
        if(modo==0) {
            System.out.println(msg);
            return textDouble = Utils.nextDouble();
        }else{
            return Double.valueOf(JOptionPane.showInputDialog(msg));
        }
    }

    //4 - Int

    public int lerInt() {
        if(modo==0) {
            System.out.println("Escreva um Int: ");
            return textInt = Utils.nextInt();
        }else{
            return Integer.parseInt(JOptionPane.showInputDialog("Escreva um Int:"));
        }
    }
    public int lerInt(String msg) {
        if(modo==0) {
            System.out.println(msg);
            return textInt = Utils.nextInt();
        }else{
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
    }

    //5 - Char

    public char lerChar() {
        if(modo==0) {
            System.out.println("Escreva um Char: ");
            return textChar = Utils.next().charAt(0);
        }else{
            String Caracter = JOptionPane.showInputDialog("Escreva um Char:");
            char textChar = Caracter.charAt(0);
            return textChar;
        }
    }

    public char lerChar(String msg) {
        if(modo==0) {
            System.out.println(msg);
            return textChar = Utils.next().charAt(0);
        }else{
            String Caracter = JOptionPane.showInputDialog(msg);
            char textChar = Caracter.charAt(0);
            return textChar;
        }
    }

    //Metodo e-mail

    public String lerEmail(){
        System.out.println("E-MAIL:");
        String email = Utils.nextLine();
        if(email.contains("@") && !email.contains(" ")){
            System.out.println(email);
            return email;
        }else{
            System.out.println("Valor Nulo");
            return null;
        }
    }

    //metodo Numero telefone

    public String lerTelefone(){
        System.out.println("Digite um Número válido. EX: xxx-xxxxxxxx");
        String num = Utils.nextLine();
        Telephone telefone = new Telephone(num);
        if (telefone.isTelephone()){
            return num;
        }else{
            return null;
        }
    }

    //Metodo Data

    public String lerDate() {
        System.out.println("Digite uma data. EX: dd/MM/aaaa");
        String data = Utils.nextLine();
        if (data.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d")) {
            TesterDate d = new TesterDate();
            if (d.isDate(data)) {
                String[] split = data.split("/");
                return split[1] + "/" + split[0] + "/" + split[2];
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

        //Metodo validar dado

        public boolean validarDado () {
            System.out.println("Digite algum valor numérico:");
            String dado = Utils.next();
            boolean isNumeric = dado.matches("[+-]?\\d*(\\.\\d+)?");
            return isNumeric;
        }
}
