package com.hil.gatewayms.domain;

import java.util.Optional;

public class OptionalExample {

    public static String aflaNume(String username) {
        if (username.isEmpty()) {
            return null;
        } else {
            return "Ceva " + username;

        }
    }

    public static Optional<String> aflaNumeOptional(String username) {
        if (username.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of("Ceva " + username);
        }

        //return Optional.ofNullable("Ceva " + username);
    }

    public static void main(String[] args) {
        aflaNume(""); //  NPE

        //Solutia 1 - defensive programming
        String rez = aflaNume("");
        if (rez != null) {
            System.out.println(rez);
        } else {
            System.out.println("INVALID VALUE");
        }

        // Solutia 2 - optional
        System.out.println(aflaNumeOptional("").orElse("INVALID VALUE OPTIONAL"));
    }
}
