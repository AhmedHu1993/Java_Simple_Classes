public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int totalPrints = numberOfCopies * numberOfPages;
        if (this.sheetsLeft > totalPrints && this.tonerVolume > totalPrints){
            this.sheetsLeft -= totalPrints;
            this.tonerVolume -= totalPrints;
        }
    }
}
