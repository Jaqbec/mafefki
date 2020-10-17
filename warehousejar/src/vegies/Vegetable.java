package vegies;

public class Vegetable {

    private int noOfPieces;
    private int sizeInUnits;

    public Vegetable(int sizeInUnits, int noOfPieces) {
        this.sizeInUnits = sizeInUnits;
        this.noOfPieces = noOfPieces;
    }

    public int getNoOfPieces() {
        return noOfPieces;
    }

    public void setNoOfPieces(int noOfPieces) {
        this.noOfPieces = noOfPieces;
    }

    public int getSizeInUnits() {
        return sizeInUnits;
    }

    public void setSizeInUnits(int sizeInUnits) {
        this.sizeInUnits = sizeInUnits;
    }
}
