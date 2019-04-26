/*
* 1. Write a program to assemble 10 burritos.
*
* 2. Use a random generator for each burrito option
*
* 3. build a list of 10 burrito customizations
*
* 4. Customizations:
*
* Rice- white, brown, no rice
*
* Meat- chicken, steak, carnidas, chorizo, sofritas, veggies
*
* Beans- pinto, black, no beans
*
* Salsa- mild, medium, hot, no salsa
*
* Veggies- lettuce, fajita veggies, no veggies
* -
* */
package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    ArrayList list = new ArrayList();
    public Random randomGenerator;

    public static void main(String[] args) {
        Random random = new Random();
        int String = (int) (Math.random() * 10);

        ArrayList<String> list = new ArrayList<String>();

//        System.out.println("My robot randomly selected burrito number is" + list + "\n");
//                System.out.println(" Burrito number 1: white rice,  carnidas meat,  no beans + hot salsa, no veggies ");
//                System.out.println(" Burrito number 2: no rice,  chicken meat,  no beans,  hot salsa,  fajita veggies ");
//                System.out.println(" Burrito number 3: brown rice,  sofritas meat,  no beans,  hot salsa,  no veggies ");
//                System.out.println(" Burrito number 4: brown rice,  carnidas meat,  pinto beans,  mild salsa,  lettuce ");
//                System.out.println(" Burrito number 5: no rice,  chicken meat,  black beans,  medium salsa,  no veggies ");
//                System.out.println(" Burrito number 6: white rice,  carnidas meat,  pinto beans,  mild salsa,  lettuce ");
//                System.out.println(" Burrito number 7: white rice,  sofritas meat,  black beans,  medium salsa,  lettuce");
//                System.out.println(" Burrito number 8: white rice,  chorizo meat,  no beans,  hot salsa, hot salsa,  lettuce ");
//                System.out.println(" Burrito number 9: no rice,  chicken meat, pinto beans,  mild salsa,  no veggies ");
//                System.out.println(" Burrito number 9: no rice,  chicken meat,  pinto beans,  mild salsa,  no veggies ");
//                System.out.println(" Burrito number 10: white rice,  chicken meat, no beans,  hot salsa,  lettuce ");

        Scanner keyboard = new Scanner(System.in);

        list.add(" Burrito number 1: white rice,  carnidas meat,  no beans + hot salsa, no veggies ");
        list.add(" Burrito number 2: no rice, chicken meat,  no beans,  hot salsa,  fajita veggies");
        list.add(" Burrito number 3: brown rice,  sofritas meat,  no beans,  hot salsa,  no veggies");
        list.add(" Burrito number 4: brown rice, carnidas meat,  pinto beans,  mild salsa,  lettuce ");
        list.add(" Burrito number 5: no rice, chicken meat,  black beans,  medium salsa,  no veggies ");
        list.add(" Burrito number 6: white rice, carnidas meat,  pinto beans,  mild salsa,  lettuce ");
        list.add(" Burrito number 7: white rice, sofritas meat,  black beans,  medium salsa,  lettuce");
        list.add(" Burrito number 8: white rice, chorizo meat,  no beans,  hot salsa, hot salsa,  lettuce ");
        list.add(" Burrito number 9: no rice,  chicken meat, pinto beans,  mild salsa,  no veggies ");
        list.add(" Burrito number 10: white rice, chicken meat, no beans,  hot salsa,  lettuce ");
        {

        }
        for (int i = 1; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            String word = list.get(randomIndex);
            System.out.println("My robot randomly selected burrito number is " + word );

        }
    }
}









//public String getRandom() {
//return list.get(new Random().nextInt(list.size()));





















