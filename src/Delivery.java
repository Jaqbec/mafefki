public class Delivery {

    private int noOfPotatoes;
    private int noOfCarrots;
    private int noOfCabbages;

    public Delivery(int noOfPotatoes, int noOfCarrots, int noOfCabbages) {
        this.noOfPotatoes = noOfPotatoes;
        this.noOfCarrots = noOfCarrots;
        this.noOfCabbages = noOfCabbages;
    }

    public int getNoOfPotatoes() {
        return noOfPotatoes;
    }

    public void setNoOfPotatoes(int noOfPotatoes) {
        this.noOfPotatoes = noOfPotatoes;
    }

    public int getNoOfCarrots() {
        return noOfCarrots;
    }

    public void setNoOfCarrots(int noOfCarrots) {
        this.noOfCarrots = noOfCarrots;
    }

    public int getNoOfCabbages() {
        return noOfCabbages;
    }

    public void setNoOfCabbages(int noOfCabbages) {
        this.noOfCabbages = noOfCabbages;
    }
}
