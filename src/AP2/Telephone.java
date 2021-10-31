package AP2;

public class Telephone {
    private String num;
    private String numero = "\\d\\d\\d-\\d\\d\\d\\d\\d\\d\\d\\d\\d";

    public Telephone(String num) {
        this.num = num;
    }

    public boolean isTelephone() {
        if (this.num.matches(numero)){
            System.out.println("Passou aqui");
            return true;
        }else{
            return false;
        }
    }
}
