package org.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortProduct {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SortProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SortProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private int id;
    private String name;
    private double price;

}
class sorted{

    public static void main(String[] args) {

        List<SortProduct> products = Arrays.asList(new SortProduct(1,"Apple",50000.00),
                new SortProduct(2,"Samsung",50000.00),
                new SortProduct(3,"Oneplus",20000.00));

        // Sorting products by prices in asc order
       List<SortProduct> res =  products.stream().sorted(Comparator.comparingDouble(SortProduct::getPrice)).toList();
       res.forEach(r->System.out.println(r.toString()));

        // Sorting products by name in asc order
        List<SortProduct> res1 = products.stream().sorted(Comparator.comparing(SortProduct::getName)).toList();
        System.out.println(res1);
        res1.forEach(r->System.out.println(r.toString()));

        System.out.println("--------------------------");
        // Sorting products by price and name in asc order

        List<SortProduct> productList = products.stream().sorted(Comparator.comparingDouble(SortProduct::getPrice).thenComparing(Comparator.comparing(SortProduct::getName)).reversed()).toList();

        productList.forEach(p->System.out.println(p.toString()));
    }
}
