package org.example;

import org.example.models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.example.models.Cashier.customerToBuy;
import static org.example.models.Store.ArrayProductList;
import static org.example.models.Store.productList1;

public class Main {


    public static void main(String[] args) throws IOException {

       // System.out.println(ArrayProductList());

        //Store store = new Store();
        Cashier cashier = new Cashier();


        CustomerOrder c2 = new CustomerOrder("Burger", 3, "Shadow");
        CustomerOrder c3 = new CustomerOrder("Chocolate", 4, "Lizzy");
        CustomerOrder c1 = new CustomerOrder("Glass",1, "Enoch");
        CustomerOrder c4 = new CustomerOrder("Burger", 2, "Azeez");



        CustomerOrder c5 = new CustomerOrder("Burger", 1, "Shadow");
        CustomerOrder c6 = new CustomerOrder("Chocolate", 1, "Lizzy");
        CustomerOrder c7 = new CustomerOrder("Glass",1, "Enoch");
        CustomerOrder c8 = new CustomerOrder("Burger", 1, "Azeez");


        List<CustomerOrder> customerOrders = new ArrayList<>();

        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        customerOrders.add(c4);

        List<CustomerOrder> customerOrderz = new ArrayList<>();


        customerOrderz.add(c5);
        customerOrderz.add(c6);
        customerOrderz.add(c7);
        customerOrderz.add(c8);




        cashier.sendOrderToQueue(customerOrders);
       // cashier.sendOrderToQueue(customerOrderz);
        cashier.sellProduct( customerToBuy);
       // System.out.println(ArrayProductList());
        System.out.println(productList1);





    }

}

