/*--- EXERCÍCIO 2: Remoção de Duplicatas e Preservação de Ordem (Set) ---
Objetivo: Compreender as diferenças entre HashSet, LinkedHashSet e TreeSet.
        Descrição:
        - Dada uma List<String> contendo nomes repetidos (ex: "Ana", "Carlos", "Ana", "Bruno", "Beatriz", "Carlos").
        - Faça 3 operações e imprima os resultados:
        1. Remova as duplicatas sem se importar com a ordem (use HashSet).
        2. Remova as duplicatas mantendo a ordem original de inserção (use LinkedHashSet).
        3. Remova as duplicatas e mantenha os nomes em ordem alfabética (use TreeSet).*/

import java.util.*;

class Main{
    public static void main(String[] args){
        System.out.println("Hello");


        System.out.println("========================================");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Bruno");
        lista.add("Beatriz");
        lista.add("Carlos");

        System.out.println("Lista normal: " + lista);
        System.out.println("========================================");

        HashSet<String> lista2 = new HashSet<>();
        lista2.add("Ana");
        lista2.add("Carlos");
        lista2.add("Ana");
        lista2.add("Bruno");
        lista2.add("Beatriz");
        lista2.add("Carlos");
        System.out.println("Lista HashSet: " + lista2);
        System.out.println("========================================");

        LinkedHashSet<String> lista3 = new LinkedHashSet<>();
        lista3.add("Ana");
        lista3.add("Carlos");
        lista3.add("Ana");
        lista3.add("Bruno");
        lista3.add("Beatriz");
        lista3.add("Carlos");
        System.out.println("Lista LinkedHashSet: " + lista3);
        System.out.println("========================================");

        TreeSet<String> lista4 = new TreeSet<>();
        lista4.add("Ana");
        lista4.add("Carlos");
        lista4.add("Ana");
        lista4.add("Bruno");
        lista4.add("Beatriz");
        lista4.add("Carlos");
        System.out.println("Lista TreeSet: " + lista4);
        System.out.println("========================================");
    }
}