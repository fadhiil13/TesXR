
    public class Book {
        protected String title;
        protected int year;
        protected double price;

        public String getTittle() {
            return this.title;
        }

        public void setTittle(String tittle) {
            this.title = tittle;
        }

        public int getYear() {
            return this.year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Book() {
            title = "";
            year = 0;
            price = 0.0;
        }

        public Book(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }

        public void print() {
            System.out.println("title: " + title);
            System.out.println("year " + year);
            System.out.println("Price : " + price);
        }
    }


