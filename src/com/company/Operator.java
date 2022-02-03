package com.company;

public class Operator
{
    private final StringBuilder expresie;

    public Operator(StringBuilder _Ex) {
        expresie = _Ex;
    }

    public int Sw(int op, String operator, int op2) {
        int rezultat = 0;
        switch (operator) {
            case "+" -> rezultat = op + op2;
            case "-" -> rezultat = op - op2;
            case "*" -> rezultat = op * op2;
            case "/" -> rezultat = op / op2;
            default -> System.out.println("semn gresit !!!");
        }
        return rezultat;
    }

    public int Calculator() {
        StringBuilder semne = new StringBuilder();
        for (int i = 1; i < expresie.length(); i++) {
            if (expresie.charAt(i) == '+' || expresie.charAt(i) == '-' || expresie.charAt(i) == '*' || expresie.charAt(i) == '/') {
                {
                    semne.append(expresie.charAt(i));
                    expresie.setCharAt(i, ' ');
                }
            }
        }
        String copieExpresie = String.valueOf(expresie);
        String[] vect = copieExpresie.split(" ");
        int rezultat=0;
        int j = 0;
        for (int i = 0; i < vect.length - 1; i++) {
            rezultat=0;
            rezultat = rezultat + Sw(Integer.parseInt(vect[i]), String.valueOf(semne.charAt(j)), Integer.parseInt(vect[i + 1]));
            vect[i + 1] = String.valueOf(rezultat);
            j++;
        }

        return rezultat;
    }
}
