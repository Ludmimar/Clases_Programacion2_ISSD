package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        System.out.printf("while loop\n");
        int i = 0;
        while (i<5){
            System.out.println("i = " + i);
            i++;
        }

        System.out.printf("do while loop\n");
        int j = 0;
        do{
            System.out.println("j = " + j);
            j++;
        }while(j<5);

        System.out.printf("for loop\n");
        for (int k = 1; k <= 5; k++){
            System.out.println("k = " + k);
        }

        System.out.printf("for each loop\n");
        String[] list_names = {"Ana", "Luis", "Pedro"};
        for (String name : list_names) {
            System.out.println("name = " + name);
        }

        String palabra ="Hola mundo";
        for(char c : palabra.toCharArray()){
            System.out.println("palabra = " + c);
        }


    }
}