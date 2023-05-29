package Lab02;

import java.util.*;

  public class Problema02{
    public static void main(String [] args){
    	
    		
        int matriz[]={9,8,7,6,5,4,3,2,1};
        int a[]= rIzquierda(4,matriz);
        Mostrar(a);
    }
    public static int [] rIzquierda(int pos, int[]array){
        int MRotada[]=new int [array.length];
        for (int i=0; i<array.length;i++){
            if(pos < array.length){
                MRotada[i]=array[pos];
            }
            else if(pos == array.length){
                pos=0;
                MRotada[i]=array[pos];
            }
            pos=pos +1;
        }
        return MRotada;
    }
    public static void Mostrar(int []array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
