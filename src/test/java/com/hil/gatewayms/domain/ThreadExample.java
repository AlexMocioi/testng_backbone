package com.hil.gatewayms.domain;

public class ThreadExample {

    public static void main(String[] args) {
        Runtime.getRuntime().freeMemory();
        Thread t = new Thread(); //implementare de run, in care apelezi Runtime.getRuntime().freeMemory();
        t.setDaemon(true); // Merge background, si moare cu thread main
    }
}
