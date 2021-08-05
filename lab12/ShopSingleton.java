import java.util.*;

public class ShopSingleton {

    private static ShopSingleton Singleton = new ShopSingleton();
    public String nume;
    public ArrayList<Product> products;

    private ShopSingleton() {
        this.nume="idk";
        this.products= new ArrayList<Product>();
    }

    public static ShopSingleton getInstance()
    {
        if (Singleton == null)
            Singleton = new ShopSingleton();
        return Singleton;
    }

    public void showProducts() {

        System.out.println("Magazin: " + Singleton.nume + "\nProduse: ");
        for (int i = 0; i < Singleton.products.size(); i++)
            System.out.println(Singleton.products.get(i).show());
    }

    void addProduct(Product p){
        Singleton.products.add(p);
    }

    void removeProduct(Product p){
        Singleton.products.remove(p);
    }

    Product getCheapestProduct(){
        Product min;

        min = Singleton.products.get(0);
        for (int i=1; i< Singleton.products.size();i++)
            if(min.pret >= Singleton.products.get(i).pret)
                min = Singleton.products.get(i);

        return min;
    }
}

class Test{
    static ShopSingleton obj = ShopSingleton.getInstance();

    public static void main(String[] args) {
        Product a = new Product(3,"a");
        Product b = new Product(4, "b");
        ShopSingleton abc = ShopSingleton.getInstance();
        abc.addProduct(a);
        abc.addProduct(b);
        abc.showProducts();
    }
}