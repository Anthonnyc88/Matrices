/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Anthonny
 */
public class Funcion_arreglos {
    
    
    public static void ArreglosUnidimensionales() {
        //ARREGLOS UNIDIMENSIONALES 
        byte[] edad = new byte[4];
        short[] edad1 = new short[4];
        int[] edad2 = new int[4];
        long[] edad3 = new long[4];
        float[] estatura = new float[3];
        double[] estatura1 = new double[3];
        boolean[] estado = new boolean[5];
        char[] sexo = new char[2];
        String[] nombre1 = new String[2];

        String[] nombre = new String[4];
        nombre[0] = "Luis";
        nombre[1] = "María";
        nombre[2] = "Carlos";
        nombre[3] = "Jose";
        //nombre[4] = "Ismael";   //Error:No existe esta variable array de índice 4
        System.out.println(nombre[0] + " " + nombre[1] + " " + nombre[2] + " " + nombre[3]);
    }

    public static void ArreglosMultidimensionales() {
        byte[][] edad = new byte[4][3];
        short[][] edad1 = new short[4][3];
        int[][] edad2 = new int[4][3];
        long[][] edad3 = new long[4][3];
        float[][] estatura = new float[3][2];
        double[][] estatura1 = new double[3][2];
        boolean[][] estado = new boolean[5][4];
        char[][] sexo = new char[2][1];
        String[][] nombre = new String[2][2];
        nombre[0][0] = "Luis";
        nombre[0][1] = "María";
        nombre[1][0] = "Carlos";
        nombre[1][1] = "Jose";
        for (int x = 0; x < nombre.length; x++) {
            System.out.print("|");
            for (int y = 0; y < nombre[x].length; y++) {
                System.out.print(nombre[x][y]);
                if (y != nombre[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}
