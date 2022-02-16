package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Constraints {

    List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    public void addErro(String error){
        errors.add(error);
    }

    //verificando tamanho minimo
    public void minLength(String password){

        if (password.length() < 6){
            int characters = 6 - password.length();
            errors.add("need " + characters + " more characters");

        }
    }

    //verificando digitos
    public void checkDigit(String password){

        boolean found = false;

        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
               found = true;
            }
        }

        if (!found){
            errors.add("needs at least a number");
        }

    }

    //verificando letras maiusculas
    public void upperLetter(String password){

        boolean found = false;

        for (char pass : password.toCharArray()){
            if (pass >= 'A' && pass <= 'Z'){
                found = true;
            }
        }

        if (!found){
            errors.add("need at least one capital letter");
        }
    }

    //verificando letras menusculas
    public void lowerLetter(String password){

        boolean found = false;

        for (char pass : password.toCharArray()){
            if (pass >= 'a' && pass <= 'z'){
                found = true;
            }
        }

        if (!found){
            errors.add("need at least one lowercase letter");
        }

    }

    //verificando caracter especial
    public void specialFeature(String password){

        boolean found = false;

        for (int i = 0; i < password.length(); i++){
            String letter = String.valueOf(password.charAt(i));

            if (letter.matches("[!@#$%^&*()-+]")){
                found = true;
            }
        }

        if (!found){
            errors.add("need at least special feature (!@#$%^&*()-+)");
        }
    }
}
