package common;

public class Box {

    private int sizeInUnits;
    private int usedUnits;
    private ItemType itemType;

    public Box(int sizeInUnits) {
        this.sizeInUnits = sizeInUnits;
        this.itemType = ItemType.EMPTY;
        this.usedUnits = 0;
    }

    public int getSizeInUnits() {
        return sizeInUnits;
    }

    public void setSizeInUnits(int sizeInUnits) {
        this.sizeInUnits = sizeInUnits;
    }

    public int getUsedUnits() {
        return usedUnits;
    }

    public void setUsedUnits(int usedUnits) {
        this.usedUnits = usedUnits;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
