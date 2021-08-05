public  class  Product{
    String nume;
    float pret;
    public Product() {
        this.pret = 0;
        this.nume = "nume";
    }


    public Product(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public String show(){
        return nume + "  " + pret;
    }
}

class Book  extends Product{

    public Book () {
        super();
    }

    public Book (float pret, String nume) {
        super(pret, nume);
    }

}

class Food extends  Product{
    public Food() {
        super();
    }

    public Food(float pret, String nume) {
        super(pret, nume);
    }
}

class Beverage extends Product{

    public Beverage() {
        super();
    }

    public Beverage(float pret, String nume) {
        super(pret, nume);
    }
}

class Computer extends Product{

    public Computer() {
        super();
    }

    public Computer(float pret, String nume) {
        super(pret, nume);
    }

}

class ProductFactory {
    Product factory(String type, String nameProduct, float productPrice){
        if(type.equals("book"))
            return new Book();
        return null;
    }
}
