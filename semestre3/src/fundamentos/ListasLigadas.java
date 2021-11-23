package fundamentos;

import java.util.LinkedList;

public class ListasLigadas {
    public static void main(String[] args) {
        LinkedList<String> ranking = new LinkedList<>();

        System.out.println("Top 5 nombres para mascota: ");
        ranking.add("Sirius");
        ranking.add("Olivia");
        ranking.addFirst("Ramona");
        ranking.addLast("Chester");
        ranking.add(3, "Rufle");

        System.out.println(ranking);
    }
}