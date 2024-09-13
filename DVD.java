public class DVD extends Product {
    int lenght;
    String rating;
    String Studio;

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getRatio() {
        return this.rating;
    }

    public void setRatio(String ratio) {
        this.rating = ratio;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public DVD(){
        super();
        lenght = 0;
        rating = "";
        Studio = "";
    }
    public DVD(int lenght, String ratio, String Studio, int number, String name, int quantity, double price){
        super(number, name, quantity, price);
        this.number = number;
        this.rating = rating;
        this.Studio = Studio;
    }
    
}
