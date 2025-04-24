package org.howard.edu.lspfinal.question3;

/**
 * Demonstrates the Template Method Pattern with different report types.
 */
public class Driver {

    /**
     * Main method that runs two types of reports.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        ReportGenerator sales = new SalesReport();
        ReportGenerator inventory = new InventoryReport();

        sales.generateReport();
        System.out.println();
        inventory.generateReport();
    }
}
