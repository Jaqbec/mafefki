package services;

import common.Box;
import common.Delivery;
import vegies.Cabbage;
import vegies.Carrot;
import vegies.Potato;
import vegies.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WarehouseService {

    private static final Logger LOGGER = Logger.getLogger(WarehouseService.class.getName());

    public static final int DEFAULT_POTATO_SIZE_IN_UNITS = 1;
    public static final int DEFAULT_CARROT_SIZE_IN_UNITS = 3;
    public static final int DEFAULT_CABBAGE_SIZE_IN_UNITS = 10;

    /**
     * Verifies if delivery can be sored at the warehouse.
     *
     * @param delivery count of each vegetable
     * @param boxes    available boxes
     * @return true if delivery can be accepted, false if not
     */
    public boolean canStore(Delivery delivery, List<Box> boxes) {

        Potato potato = new Potato(DEFAULT_POTATO_SIZE_IN_UNITS, delivery.getNoOfPotatoes());
        Carrot carrot = new Carrot(DEFAULT_CARROT_SIZE_IN_UNITS, delivery.getNoOfCarrots());
        Cabbage cabbage = new Cabbage(DEFAULT_CABBAGE_SIZE_IN_UNITS, delivery.getNoOfCabbages());

        List<Vegetable> vegetables = new ArrayList<>(Arrays.asList(potato, carrot, cabbage));

        return hasEnoughSpace(boxes, vegetables); // TODO: add conditions to cover other scenarios
    }

    private boolean hasEnoughSpace(List<Box> boxes, List<Vegetable> vegetables) {
        int noOfUnitsNeeded = getNoOfUnitsNeeded(vegetables);
        String logInfo = "Number of needed units: " + noOfUnitsNeeded;
        LOGGER.log(Level.INFO, logInfo);
        int remainingUnits = getRemainingUnits(boxes);
        logInfo = "Number of remaining units: " + remainingUnits;
        LOGGER.log(Level.INFO, logInfo);
        return noOfUnitsNeeded <= remainingUnits;
    }

    private Integer getNoOfUnitsNeeded(List<Vegetable> vegetables) {
        return vegetables
                .stream()
                .map(vegetable -> vegetable.getNoOfPieces() * vegetable.getSizeInUnits())
                .reduce(0, Integer::sum);
    }

    private int getRemainingUnits(List<Box> boxes) {
        return boxes
                .stream()
                .map(box -> box.getSizeInUnits() - box.getUsedUnits())
                .reduce(0, Integer::sum);
    }
}
