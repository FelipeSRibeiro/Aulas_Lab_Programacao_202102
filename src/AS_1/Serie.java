package AS_1;

import java.util.Objects;
import java.util.Scanner;

public class Serie {
    public String titulo;
    public int temporadas;
    public int epTotal;
    public String sinopse;
    public Boolean assistido;

    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o titulo");
        titulo = teclado.next();
        System.out.println("Informe o total de temporadas");
        temporadas = teclado.nextInt();
        System.out.println("Informe o total de episódios");
        epTotal = teclado.nextInt();
        System.out.println("Descreva a sinopse");
        sinopse = teclado.next();
        System.out.println("Você assistiu essa série? true ou false");
        assistido = teclado.nextBoolean();
    }
    public void Assistido(){
        if(assistido == true){
            System.out.println("Nome da série: "+this.titulo);
        }
    }
    public void naoAssistido(){
        if(assistido == false){
            System.out.println("Nome da série: "+this.titulo);
        }
    }
    public void exibirDados(){
        System.out.println("Nome: "+this.titulo);
        System.out.println("Quantidade de temporadas: "+this.temporadas);
        System.out.println("Total de episódios: "+this.epTotal);
        System.out.println("Sinopse: "+this.sinopse);
    }
    public Serie(){
    }
    public Serie(String nome) {
        this.titulo = nome;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
