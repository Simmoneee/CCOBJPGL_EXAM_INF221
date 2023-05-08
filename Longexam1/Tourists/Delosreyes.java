package Tourists;


import Locations.*;

public class Delosreyes implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("Enjoying my travel");
    }

    public void visit(Bacolod bacolod) {
        System.out.println("My budget is " + getBudget());

        if ( budget > bacolod.airFare  ){
            System.out.println("Bacolod kaya?" );
            budget -= bacolod.airFare;

        }else{
            System.out.println("Wala na ako pera");
        }

      checkBudget();

    }

    public void visit(Bataan bataan) {

        if(budget >bataan.airFare){
            System.out.println("Tara Bataan");
            budget -= bataan.airFare;
        }else{
            System.out.println("wala na ako pera");
        }

        checkBudget();
    }
    public void visit(Boracay boracay) {
        if(budget >boracay.airFare){
            System.out.println("Tara sunod Boracay!");
            budget -= boracay.airFare;
        }else{
            System.out.println("Ok Next time wala na ako pera");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Tara palawan");
            budget -= palawan.airFare;
        }else{
            System.out.println("wala na ako pera");
        }

        checkBudget();
    }

    public void visit(Pampanga pampanga) {
        if(budget >pampanga.airFare){
            System.out.println("Tara naman sa pampanga");
            budget -= pampanga.airFare;
        }else{
            System.out.println("wala na ulit ako pera");
        }

        checkBudget();
    }

    public void visit(Bicol bicol) {
        if(budget >bicol.airFare){
            System.out.println("Tara naman sa Bicol");
            budget -= bicol.airFare;
        }else{
            System.out.println("WALA NA AKO PERA");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}