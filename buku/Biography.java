public class Biography extends TextBook{
    String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Biography(){
        super();
        about="";
    }

public Biography(String title, int year, double price, String subject){
    super(title, year, price, subject);
        this.about=about;
    }

    public void print() {
        super.print();
        System.out.println(" About: " + about );
    }

}
