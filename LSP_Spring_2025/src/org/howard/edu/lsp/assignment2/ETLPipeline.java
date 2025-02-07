package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class ETLPipeline {
    public static void main(String[] args) {
        String inputFilePath = "data/products.csv";
        String outputFilePath = "data/transformed_products.csv";
        
        List<String[]> transformedData = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            boolean isHeader = true;
            
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    transformedData.add(new String[]{"ProductID", "Name", "Price", "Category", "PriceRange"});
                    isHeader = false;
                    continue;
                }
                
                String[] columns = line.split(",");
                if (columns.length != 4) continue;
                
                int productId = Integer.parseInt(columns[0].trim());
                String name = columns[1].trim().toUpperCase();
                double price = Double.parseDouble(columns[2].trim());
                String category = columns[3].trim();
                
                if (category.equals("Electronics")) {
                    price = Math.round(price * 0.9 * 100.0) / 100.0; // Apply 10% discount
                }
                
                if (price > 500) {
                    category = "Premium Electronics";
                }
                
                String priceRange = getPriceRange(price);
                
                transformedData.add(new String[]{
                    String.valueOf(productId), name, String.format("%.2f", price), category, priceRange
                });
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read input file. Make sure 'products.csv' exists in 'data/' folder.");
            return;
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String[] record : transformedData) {
                bw.write(String.join(",", record));
                bw.newLine();
            }
            System.out.println("Transformation complete. Output saved to '" + outputFilePath + "'");
        } catch (IOException e) {
            System.out.println("Error: Unable to write output file.");
        }
    }
    
    private static String getPriceRange(double price) {
        if (price <= 10) return "Low";
        else if (price <= 100) return "Medium";
        else if (price <= 500) return "High";
        else return "Premium";
    }
}
