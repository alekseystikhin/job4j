package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest {
    @Test
    public void testDeleteFirst() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[1], products[2], null, null, null};
        new Shop().delete(products, 0);
        Assert.assertArrayEquals(expected, products);

    }

    @Test
    public void testDeleteMiddle() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[1], null, products[3], null, null};
        new Shop().delete(products, 2);
        Assert.assertArrayEquals(expected, products);

    }

    @Test
    public void testDeleteLast() {
        Product[] products = new Product[5];
        products[2] = new Product("Milk", 10);
        products[3] = new Product("Bread", 4);
        products[4] = new Product("Egg", 19);

        Product[] expected = new Product[]{null, products[2], products[3], null, null};
        new Shop().delete(products, 4);
        Assert.assertArrayEquals(expected, products);

    }

}
