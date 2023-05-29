package Lab02;

public class Problema01 {
    public static void main(String []args){

        int matriz[]={1,2,3,5};
         MatrizInvertida(invertirArray(matriz));

    }
    public static int [] invertirArray (int[]array){
        int MatrizMetodo[]=new int [array.length];
        int aux=0;
        for(int i=array.length-1;i>=0;i--){
            MatrizMetodo[aux]=array[i];
            aux++;
        }
        return MatrizMetodo;

    }
    public static void MatrizInvertida(int []array){
        for (int i=0;i<array.length;i++){

        }
    }    
}    
