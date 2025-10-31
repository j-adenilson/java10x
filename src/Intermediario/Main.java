package Intermediario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamaco"));

        System.out.println("Itens da bolsa: " );
        bolsaNinja.mostrarFerramenta();
    }
}
