package Materia.Controllers;

import Materia.Models.Node;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
        this.root=null;
    }
    public void insert(int Value){
        root=insertRec(root,Value);
    }
    private Node insertRec(Node padre, int value){
        if (padre==null) {
            return new Node(value);
        }
        if (value<padre.getValue()) {
            Node newNode=insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);
        }else if (value>padre.getValue()) {
            Node newNode=insertRec(padre.getRight(), value);
            padre.setRight(newNode);
        }
        return padre;
    }
    public void imprimirArbol(){
        printPreOrden(root);
        System.out.println();
        printorder(root);
         System.out.println();
        print(root);
        System.out.println("");
         
    }
    
    private void printPreOrden(Node node){
        if (node !=null) {
             System.out.print(node.getValue() + " ");
            printPreOrden(node.getLeft());
           
            printPreOrden(node.getRight());
            
        }
    }
    private void printorder(Node node){
        if (node !=null) {
             
            printorder(node.getLeft());
           System.out.print(node.getValue() + " ");
            printorder(node.getRight());
            
        }
    }
    private void print(Node node){
        if (node !=null) {
             
            print(node.getLeft());
           
            print(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
    public boolean findeValue(int valor) {
    return buscarValor(root, valor);
}


private boolean buscarValor(Node nodo, int valor) {
    if (nodo == null) {
        return false;
    }

    if (valor == nodo.getValue()) {
        return true;
    } else if (valor < nodo.getValue()) {
        return buscarValor(nodo.getLeft(), valor);
    } else {
        return buscarValor(nodo.getRight(), valor);
    }
}
 public int getHeightTree(){
    return getHeigtRec(root);
 }
 public int getHeigtRec(Node node){
    if (node==null) {
        return 0;
    }
    int leftHeight=getHeigtRec(node.getLeft());
    int rightHeight=getHeigtRec(node.getRight());
    if (leftHeight>rightHeight) {
        return leftHeight+1;
    }else{
        return rightHeight+1;
    }
 }
 public void imprimirArbol2(){
       
        System.out.println();
        printorder1(root);
         System.out.println();
        
         
    }
private void printorder1(Node node){
    if (node !=null) {
        int altura=getHeigtRec(node);
        printorder1(node.getLeft());  // ← cambiar aquí
        System.out.print(node.getValue() + " (h="+altura+"),");
        printorder1(node.getRight()); // ← y aquí
    }
}
public int getBalance(Node node) {
    if (node == null) {
        return 0;
    }
    return getHeigtRec(node.getLeft()) - getHeigtRec(node.getRight());
}
public int getBalanceOfTree() {
    return getBalance(root);
}
public void imprimirBalanceDeCadaNodo() {
    imprimirBalance(root);
}

private void imprimirBalance(Node node) {
    if (node != null) {
        imprimirBalance(node.getLeft());
        int balance = getBalance(node);
        System.out.println("Nodo " + node.getValue() + " =>Balance = " + balance);
        imprimirBalance(node.getRight());
    }
}
public int getPesoDelArbol() {
    return contarNodos(root);
}

private int contarNodos(Node node) {
    if (node == null) {
        return 0;
    }
    return 1 + contarNodos(node.getLeft()) + contarNodos(node.getRight());
}
public void verificarEquilibrioPasoAPaso() {
    if (verificarNodoPasoAPaso(root)) {
        System.out.println("Arbol completamente equilibrado");
    } else {
        System.out.println(" Arbol desequilibrado");
    }
}

private boolean verificarNodoPasoAPaso(Node node) {
    if (node == null) return true;

    if (!verificarNodoPasoAPaso(node.getLeft())) return false;
    if (!verificarNodoPasoAPaso(node.getRight())) return false;

    int izquierda = getHeigtRec(node.getLeft());
    int derecha = getHeigtRec(node.getRight());
    int balance = Math.abs(izquierda - derecha);

    if (balance <= 1) {
        System.out.println("Nodo " + node.getValue() + " => true");
        return true;
    } else {
        System.out.println("Nodo " + node.getValue() + " => false desde el nodo " + node.getValue());
        return false;
    }
}



}

 