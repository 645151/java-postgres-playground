package com.example;

public class AppMatriz {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double matriz[][] = new double[3][4];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz [i][j] = (i * matriz[i].length + j + 1) * 10;
                                     
                }
                
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    //System.out.println();
                    System.out.printf( "%5.1f  ", matriz[i][j]);
                    

                    
    }
    System.err.println();
    
}
    

}
}
