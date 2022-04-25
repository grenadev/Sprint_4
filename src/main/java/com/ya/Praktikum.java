package com.ya;

public class Praktikum {

    public static void main(String[] args) {
        String name = "Тимофей Шардане";
        Account account = new Account(name);
        System.out.println(account.checkNameToEmboss());
    }
}