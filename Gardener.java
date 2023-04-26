import java.util.*;
import java.io.*;

/*
StringBuilder
File Reader File Writer BufferedReader BufferedWriter FileInputStream FileOutputStream
*/

public class Gardener {

    private static TreeMap<String, Plant> plants;
    private static TreeMap<String, ? super FruitTree> wildcardList;
    private static TreeMap<String, FruitTree> fruitTrees;

    public static <T> void main(String[] args){
        //create some plants using add() as in FlightScheduler

        //import/export as in FlightScheduler

        //fertilise/maintain/eat them using wildcards loop
        for (Plant p : plants.values()){
            //fertilise/maintain/eat
        }

        //2 comparators using Lambdas

        //pick 2 pairs and display Lotka-Volterra increments
//        public void LotkaVolterraIncrement(Plant predator, Plant prey, double preyEatenRate, double predatorEatingRate, int time) throws Exception

        //harvest



    }

    public static void wildCardMethod(TreeMap<String, ? super FruitTree> genericList1){
        //helperMethod returns a childclass object eg. Tree, FruitTree etc..
        wildCardMethodHelper(myPlant);

        for (int i = 0; i < MY INPUT LIST.size(); i++){
            create a plant etc
            newFruitTrees.put(new plant.getSpecies(), new plant)
        }

    }

    public static <T> T wildCardMethodHelper(T myPlant){
        return myPlant;
    }

    //import
    //export
    //add

}





















