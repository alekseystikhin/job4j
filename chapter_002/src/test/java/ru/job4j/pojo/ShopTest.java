package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ShopTest {
    @Test
    public void testDeleteFirst1() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[1], products[2], null, null, null};
        products = new Shop().delete(products, 0);
        assertThat(products, is(expected));

    }

    @Test
    public void testDeleteFirst2() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Chicken", 19);
        products[3] = new Product("Butter", 19);
        products[4] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[1], products[2], products[3], products[4], null};
        products = new Shop().delete(products, 0);
        assertThat(products, is(expected));

    }

    @Test
    public void testDeleteMiddle1() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[1], products[3], null, null, null};
        products = new Shop().delete(products, 2);
        assertThat(products, is(expected));

    }

    @Test
    public void testDeleteMiddle2() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Chicken", 19);
        products[3] = new Product("Butter", 19);
        products[4] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[0], products[1], products[3], products[4], null};
        products = new Shop().delete(products, 2);
        assertThat(products, is(expected));

    }

    @Test
    public void testDeleteLast1() {
        Product[] products = new Product[5];
        products[2] = new Product("Milk", 10);
        products[3] = new Product("Bread", 4);
        products[4] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[2], products[3], null, null, null};
        products = new Shop().delete(products, 4);
        assertThat(products, is(expected));
    }

    @Test
    public void testDeleteLast2() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Chicken", 19);
        products[3] = new Product("Butter", 19);
        products[4] = new Product("Egg", 19);

        Product[] expected = new Product[]{products[0], products[1], products[2], products[3], null};
        products = new Shop().delete(products, 4);
        assertThat(products, is(expected));

    }
}
