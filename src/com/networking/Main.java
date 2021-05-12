package com.networking;

public class Main {

    public static void main(String[] args) {

        // 4 variable truth table
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] B = {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int[] C = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        int[] D = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        System.out.println("\n\n******** TRUTH TABLE *********");
        System.out.print("A -> "); display(A);
        System.out.print("B -> "); display(B);
        System.out.print("C -> "); display(C);
        System.out.print("D -> "); display(D);

        //Order of precedence:
        // 1: NOT
        // 2: AND
        // 3: OR

        // First AND Gate
        System.out.println("\n********** A & B *********");
        int[] E = AND_Gate(A, B); display(E);

        // Second AND Gate
        System.out.println("\n********** B & C *********");
        int[] F = AND_Gate(B, C); display(F);

        // First XOR Gate
        System.out.println("\n********** B ^ D *********");
        int[] G = XOR_Gate(B, D); display(G);

        // Second XOR Gate
        System.out.println("\n********** C ^ D *********");
        int[] H = XOR_Gate(C, D); display(H);

        // First OR Gate
        System.out.println("\n********** E | F *********");
        int[] I = OR_Gate(E, F); display(I);

        // Third AND Gate
        System.out.println("\n********* I & G ********** (Q1)");
        int[] Q1 = AND_Gate(I, G); display(Q1);

        // Final | Second OR Gate
        System.out.println("\n********** F | H ********* (Q2)");
        int[] Q2 = OR_Gate(F, H); display(Q2);
    }

    public static int[] AND_Gate(int[] a, int[] b) {
        int[] newArray = new int[a.length];
        try {
            for (int i = 0; i < newArray.length; i++) {
                int addGate = a[i] & b[i];
                newArray[i] = addGate;
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
        return newArray;
    }

    public static int[] XOR_Gate(int[] a, int[] b) {
        int[] newArray = new int[a.length];
        try {
            for (int i = 0; i < newArray.length; i++) {
                int addGate = a[i] ^ b[i];
                newArray[i] = addGate;
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
        return newArray;
    }

    public static int[] OR_Gate(int[] a, int[] b) {
        int[] newArray = new int[a.length];
        try {
            for (int i = 0; i < newArray.length; i++) {
                int addGate = a[i] | b[i];
                newArray[i] = addGate;
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
        return newArray;
    }

    public static void display(int[] arr) {
        try {
            for (int temp : arr) {
                System.out.print(temp + " ");
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
        System.out.printf("%n");
    }
}
