package AS_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList <Serie> catalogo = new ArrayList<Serie>();
        int escolha = 0;
        do{
            System.out.println("Digiete 1 para adicionar uma série");
            System.out.println("Digiete 2 para apagar uma série");
            System.out.println("Digiete 3 para listar todas as séries");
            System.out.println("Digiete 4 para listar as séries vistas");
            System.out.println("Digiete 5 para listar as séries não vistas");
            System.out.println("Digiete 6 para pesquisar uma série por nome");
            System.out.println("Digiete 7 para mostrar quantas séries tem no catálogo");
            escolha=teclado.nextInt();
            switch (escolha){
                case 1:{
                    Serie serie = new Serie();
                    serie.lerDados();
                    catalogo.add(serie);
                    break;
                }
                case 2:{
                    System.out.println("Digite o nome da série que será excluida");
                    String nome=teclado.next();
                    Serie apagar= new Serie(nome);
                    if(catalogo.remove(apagar)){
                        System.out.println("Removido");
                    }else{
                        System.out.println("Não encontrei");
                    }
                    break;
                }
                case 3:{
                    for (int i=0;i<catalogo.size();i++){
                        catalogo.get(i).exibirDados();
                    }
                    break;
                }
                case 4:{
                    for (int i=0;i<catalogo.size();i++){
                        catalogo.get(i).Assistido();
                    }
                    break;
                }
                case 5:{
                    for (int i=0;i<catalogo.size();i++){
                        catalogo.get(i).naoAssistido();
                    }
                    break;
                }
                case 6:{
                    System.out.println("Digite o nome da série a ser pesquisada");
                    String nome=teclado.next();
                    Serie buscar= new Serie(nome);
                    if (catalogo.contains(buscar)){
                        System.out.println("Posição:"+catalogo.indexOf(buscar)+"\nNome: "+nome);
                    }else{
                        System.out.println("Série não encontrada");
                    }
                    break;
                }
                case 7:{
                    System.out.println("Total de séries: "+catalogo.size());
                }
            }
        }while (escolha != 9);
    }

}
