package main;

import common.Box;
import common.Delivery;
import services.WarehouseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Delivery delivery = new Delivery(100, 500, 0);
        Box box100 = new Box(100);
        Box box10 = new Box(10);
        Box box200 = new Box(200);
        Box box50 = new Box(50);
        Box box30 = new Box(30);
        List<Box> listOfBoxes = new ArrayList<>(Arrays.asList(box100, box10, box200, box50, box30));

        WarehouseService warehouseService = new WarehouseService();
        if (warehouseService.canStore(delivery, listOfBoxes)) {
            LOGGER.log(Level.WARNING, "Items from provided list can be stored.");
        } else {
            LOGGER.log(Level.FINE, "Items from provided list cannot be stored.");
        }
    }
}
