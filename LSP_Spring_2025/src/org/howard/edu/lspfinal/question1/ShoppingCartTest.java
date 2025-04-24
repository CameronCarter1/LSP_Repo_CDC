package org.howard.edu.lspfinal.question1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    @DisplayName("Test adding valid item")
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 999.99);
        assertEquals(999.99, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test adding item with 0 price (expect exception)")
    public void testAddZeroPriceItem() {
        ShoppingCart cart = new ShoppingCart();
        assertDoesNotThrow(() -> cart.addItem("Pen", 0.0));
        assertEquals(0.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test adding item with negative price (expect exception)")
    public void testAddNegativePriceItem() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Faulty Charger", -25.00);
        });
    }

    @Test
    @DisplayName("Test applying 'SAVE10' discount code")
    public void testApplySave10() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 50.0);
        cart.applyDiscountCode("SAVE10");
        assertEquals(45.0, cart.getTotalCost());
        assertEquals(10.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test applying 'SAVE20' discount code")
    public void testApplySave20() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Shoes", 100.0);
        cart.applyDiscountCode("SAVE20");
        assertEquals(80.0, cart.getTotalCost());
        assertEquals(20.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test applying invalid discount code (expect exception)")
    public void testApplyInvalidDiscountCode() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.applyDiscountCode("SAVE50");
        });
    }

    @Test
    @DisplayName("Test total cost without discount")
    public void testTotalCostWithoutDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 20.0);
        cart.addItem("Item2", 30.0);
        assertEquals(50.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test total cost with discount")
    public void testTotalCostWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 40.0);
        cart.addItem("Item2", 60.0);
        cart.applyDiscountCode("SAVE10");
        assertEquals(90.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    public void testTotalCostEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test removing existing item from cart")
    public void testRemoveExistingItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Tablet", 300.0);
        assertEquals(1, cart.getCartSize());

        cart.removeItem("Tablet");
        assertEquals(0, cart.getCartSize());
        assertEquals(0.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test removing non-existent item (expect exception)")
    public void testRemoveNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Headphones", 150.0);

        assertThrows(IllegalArgumentException.class, () -> {
            cart.removeItem("Speakers");
        });

        // Ensure the existing item still remains
        assertEquals(1, cart.getCartSize());
        assertEquals(150.0, cart.getTotalCost());
    }
}


