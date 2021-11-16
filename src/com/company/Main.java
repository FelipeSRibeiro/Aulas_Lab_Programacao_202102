package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        String login = "";
        String senha = "";

        System.out.println("Favor informar o login e senha.");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Login: ");
                login = tc.nextLine();
            System.out.println("Senha: ");
                senha = tc.nextLine();
            if (!login.equals("java08") && !login.equals("java08")) {
                System.out.println("Login ou senha inválidos. Tentativa " + i + " de 3.");
            }else{
                System.out.println("O usuário " + login + " foi logado com sucesso.");
                System.exit(0);
            }
        }
    }
}
