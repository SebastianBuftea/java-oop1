package oop.javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1= new Prodotto("pasta","spaghetti numero 12","150");
        int code=prodotto1.getCode();

        System.out.println(code);
    }
}
