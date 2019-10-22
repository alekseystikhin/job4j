package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        Product[] products1 = new Product[products.length];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (products[i] != null) {
                products1[j++] = products[i];
            }
        }
        return products1;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        products = new Shop().delete(products, 1);

        for (Product product : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
