package Aula13;

public class Main {

    public static void main(String[] args) {
        Lista canil= new Lista();

        for(int i=0;i<3;i++){
            Cao cao = new Cao();
            cao.ler();
            System.out.println(cao);
            canil.addFim(cao);
        }

        System.out.println(canil.toString());
        //começo AS parte 2
        System.out.println("Quantos elementos tem?"+canil.size());
        //fim AS parte 2
        System.out.println(canil.removerPorNome("boris"));
        if(canil.isEmpty()){
            System.out.println("Vazia");
        }else{
            System.out.println("Cheia");
        }

        canil.exibir();
        canil.remover(2);
        canil.exibir();
    }
}
