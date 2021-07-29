package org.zerock.store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        StoreService service = new StoreService();

        StoreUI storeUI = new StoreUI(scanner, service);

        storeUI.fnMenu();


    }

}
