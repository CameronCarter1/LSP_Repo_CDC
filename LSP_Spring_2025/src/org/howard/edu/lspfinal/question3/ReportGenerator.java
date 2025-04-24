package org.howard.edu.lspfinal.question3;

/**
 * Abstract class that defines the template for generating a report.
 */
public abstract class ReportGenerator {

    /**
     * Template method defining the report generation algorithm.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    /**
     * Loads the data for the report (to be implemented by subclasses).
     */
    protected abstract void loadData();

    /**
     * Formats the data for the report (to be implemented by subclasses).
     */
    protected abstract void formatData();

    /**
     * Prints the report (to be implemented by subclasses).
     */
    protected abstract void printReport();
}
