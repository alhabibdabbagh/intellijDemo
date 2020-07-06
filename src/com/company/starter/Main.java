package com.company.starter;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

       boolean found =false;
        int item=2;
        int[][] myArray= new int [6][4];
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[0].length;j++){
                myArray[i][j]=random.nextInt(20);
               // System.out.print(myArray[i][j]);sadsad
            }

            System.out.println();
        }
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[0].length;j++){
                if (myArray[i][j]==item){
                    System.out.println("Aradığınız eleman "+ i +". Satır ve "+j+". Sütunda bulunmuştur");
                    found=true;
                    break;
                }else{
                    found =false;
                }
            }
            if (found==false){
                System.out.println();
            }else{
                break;
            }

        }
        if (found==false) System.out.println("bulunmadı");

      /*  int item=8;
        int itemBas=8;
        boolean found =false;
        int [] array=new int [10];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(20);
            System.out.println(array[i]);

        }
        for(int i=0;i<array.length;i++) {
            itemBas=array[i+1];
            if(array[i+1]<array.length-1){
                array[i]=array[i+1];

            }

        }*/
    }
}
