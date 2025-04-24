package org.howard.edu.lspfinal.question3;

/**
 * A concrete report implementation for Sales.
 */
public class SalesReport extends ReportGenerator {

    @Override
    protected void loadData() {
        System.out.println("Loading sales data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing sales report.");
    }
}
