
import Materia.Controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BinaryTree ab =new BinaryTree();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);
        ab.imprimirArbol();
        ab.imprimirArbol2();
        ab.imprimirBalanceDeCadaNodo();
        System.out.println("Peso del árbol: " + ab.getPesoDelArbol());
       ab.verificarEquilibrioPasoAPaso();





        if (ab.findeValue(23)) {
            System.out.println("Encontró valor 23");
            } else {
                System.out.println("No encontró el valor 23");
            }

            if (ab.findeValue(77)) {
                System.out.println("Encontró valor 77");
            } else {
                System.out.println("No encontró el valor 77");
            }


        
       

    }

}
