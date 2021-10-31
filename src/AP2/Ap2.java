package AP2;

public class Ap2 {
    public static void main(String[] args) {
        // Início da opção "modo".
        // Dê o valor de modo =0 para TERMINAL ou >0 para CAIXA DE DIÁLOGO.
        Input.modo=0;
        Input l = new Input();
        l.lerString("Digite uma String:");
        String text = l.lerString();
        l.lerFloat("Digite um Float:");
        Float textFloat = l.lerFloat();
        l.lerDouble("Digite um Double:");
        Double textDouble = l.lerDouble();
        l.lerInt("Digite um Int:");
        Integer textInt = l.lerInt();
        l.lerChar("Digite um Char:");
        Character textChar = l.lerChar();
        // Fim da opção "modo".
        l.lerEmail();
        l.lerTelefone();
        String dataFormata = l.lerDate();
        System.out.println("Data formatada: "+ dataFormata);
        boolean dado = l.validarDado();
        System.out.println("O valor dado é numerico: " + dado);
    }
}