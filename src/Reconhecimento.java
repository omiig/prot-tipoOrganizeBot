// - Visão Computacional: Algoritmos de aprendizado de máquina para 
// Reconhecimento de objetos e atualização do banco de dados

import java.util.Scanner;

public class Reconhecimento {
    public static void main(String[] args){
        Scanner keyboardScanner = new Scanner(System.in);

        String objetos[] ={"Mesa","Cadeira"};
        int cont = 0;

        System.out.println("Array atual:");
        while (cont > objetos.length) {
            System.out.println(objetos[cont]);
            cont++;
        }

        String palavra = keyboardScanner.nextLine();
        for (String objeto : objetos) {
            if (objeto.equals(palavra)) {
                break;
            } else {
                System.out.println("A palavra não foi encontrada, deseja adicionar?");
                String resp = keyboardScanner.nextLine();
                if (resp.equals("sim")) {
                    String[] novoObjeto = new String[objetos.length + 1];
                    for (int i=0;i<objetos.length; i++) {
                        novoObjeto[i] = objetos[i];
                    }
                    novoObjeto [novoObjeto.length - 1] = palavra;
                    objetos = novoObjeto;

                    System.out.println("Array atualizado");
                    for (String objt : objetos) {
                        System.out.println(objt);
                    }
                }
                break;
            }
        }
    }
}
