package org.example;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // adattípusok és változók
        int number = 6;
        String text = "Nemtudom";
        double decimalNumber = 5.2;
        boolean isItTrue = true;

        System.out.println("akármi");
        System.out.println("A number változó értéke: " + number);

        // tömb
        int[] numbersArray = {1,2,3,4,5};
        System.out.println("A tömb első eleme:" + numbersArray[0]);
        System.out.println(" A tömb ennyi elemmel rendelkezik: " + numbersArray.length);

        // elágazások

        if(decimalNumber > number){
            System.out.println("A decimalNumber változó értéke magasabb mint a number váltózóé.");
        } else if (decimalNumber == number) {
            System.out.println("A decimalNumber változó értéke egyenlő a number váltózóval.");
        } else{
            System.out.println("A number változó értéke magasabb mint a decimalNumber váltózóé.");
        }

        // for ciklus
        for(int i = 0; i < numbersArray.length; i++){
            System.out.println(numbersArray[i]);
        }

        // arrayList
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(7);
        numbersArrayList.add(1);
        numbersArrayList.add(3);
        System.out.println("ArrayList mérete: " + numbersArrayList.size());
        numbersArrayList.remove(0);
        System.out.println("ArrayList mérete: " + numbersArrayList.size());

        // foreach ciklus
        for(int numbersFromTheList : numbersArrayList){
            System.out.println(numbersFromTheList);
        }

        // HashMap
        HashMap<Integer,String> userMap = new HashMap<>();
        userMap.put(1, "Jóska");
        userMap.put(2, "Ubul");
        userMap.put(3, "Virág");
        userMap.remove(2);
        System.out.println(userMap.get(1));
        System.out.println(userMap.size());

        Person tibor = new Person("Tibor",25);

        tibor.displayInfo();
    }
}