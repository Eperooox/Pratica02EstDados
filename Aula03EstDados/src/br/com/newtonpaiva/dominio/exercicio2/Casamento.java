package br.com.newtonpaiva.dominio.exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Casamento {
    public static void main(String[] args) {
        List<String> listaNoiva = new LinkedList<>();
        List<String> listaNoivo = new LinkedList<>();
        try {
            Scanner scannernoiva = new Scanner(new File("C:\\Users\\12117275\\Documents\\Casamento\\ConvidadoNoiva.txt"));
            Scanner scannernoivo = new Scanner(new File("C:\\Users\\12117275\\Documents\\Casamento\\ConvidadoNoivo.txt"));

            while (scannernoiva.hasNext()) {
                listaNoiva.add(scannernoiva.nextLine());
            }

            while (scannernoivo.hasNext()) {
                listaNoiva.add(scannernoivo.nextLine());
            }

            scannernoiva.close();
            scannernoivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> listaCasamento = new LinkedList<>(listaNoiva);
        listaCasamento.addAll(listaNoivo);

        Collections.sort(listaCasamento);

        System.out.println("Lista de Convidados para o Casamento (em ordem alfabética):");
        for (String nome : listaCasamento) {
            System.out.println(nome);
        }

    }
}