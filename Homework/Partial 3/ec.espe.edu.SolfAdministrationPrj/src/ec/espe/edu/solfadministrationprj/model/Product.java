
package ec.espe.edu.solfadministrationprj.model;

/**
 *
 * @author Omar Mejia
 */
public class Product {

    private String nameProduct;
    private int codeProduct;
    private int stock;
    private String kindOfProduct;
    private float cost;

    public Product(String nameProduct, int codeProduct, int stock, String kindOfProduct, float cost) {
        this.nameProduct = nameProduct;
        this.codeProduct = codeProduct;
        this.stock = stock;
        this.kindOfProduct = kindOfProduct;
        this.cost = cost;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public int getStock() {
        return stock;
    }

    public String getKindOfProduct() {
        return kindOfProduct;
    }

    public float getCost() {
        return cost;
    }
    
    public void addStock(int numOfProduct){
        System.out.print("Enter the name of the product:");
        nameProduct = input.nextLine();
        System.out.println("Enter the code of product: ");
        codeProduct = input.nextInt();
        System.out.println("Enter the amount of stock: ");
        stock = input.nextInt();
        System.out.println("Enter the type of product: ");
        kindOfProduct = input.nextLine();
        System.out.println("Enter the cost of product: ");
        
}
}
    