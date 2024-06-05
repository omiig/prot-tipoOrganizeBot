//- Reconhecimento de Objetos: O robô deve escanear o ambiente para identificar objetos fora do lugar

public class Ambiente {
    public static void main(String[] args) {
     String livros[] = {"livro1","livro2","caderno3"};
     String cadernos[] = {"caderno1","caderno2","livro3"};
     
     int i = 0;
     while (i < livros.length) {
        System.out.print(livros[i]);
        if (livros[i].contains("livro")) {
            System.out.println(" Lugar certo");
        } else {
            System.out.println(" está no lugar errado...Corrigindo: ");
            if (livros[i].contains("caderno")) {
                String temp = livros[i];
                livros[i] = cadernos[i];
                cadernos[i] = temp;

                System.out.println("Array atualizado");
                    for (String objt : livros) {
                        System.out.println(objt);
                    }
                System.out.println("==============");
            }
        }
        i++;
     }

     int j = 0;
     while (j < cadernos.length) {
        System.out.print(cadernos[j]);
        if (cadernos[j].contains("caderno")) {
            System.out.println(" Lugar certo");
        } else {
            System.out.println(" está no lugar errado...Corrigindo: ");
            String temp = cadernos[j];
            cadernos[j] = livros[j];
            livros[j] = temp;

            System.out.println("Array atualizado");
                    for (String objt : cadernos) {
                        System.out.println(objt);
                    }
        }
        j++;
     }
    }
}