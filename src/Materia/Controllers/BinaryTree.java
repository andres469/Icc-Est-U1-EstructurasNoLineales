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
}
 