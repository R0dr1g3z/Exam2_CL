package com.example;

public class Main01 {
    private static final String QUERY1 = "CREATE Table users(
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(60),
        email VARCHAR(60) UNIQUE,
        password VARCHAR(60)
    );";
    private static final String QUERY2 = "CREATE Table messages(
        id INT AUTO_INCREMENT PRIMARY KEY,
        user_id INT,
        message TEXT,
        FOREIGN KEY (user_id) REFERENCES users (id)
    );";
    private static final String QUERY3 = "CREATE Table items(
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(40),
        description TEXT,
        price DECIMAL(7,2)
    );";
    private static final String QUERY4 = "CREATE Table orders(
        id INT AUTO_INCREMENT PRIMARY KEY,
        user_id INT,
        description TEXT,
        created DATE,
        FOREIGN KEY (user_id) REFERENCES users (id)
    );";
    private static final String QUERY5 = "CREATE Table items_orders(
        id INT AUTO_INCREMENT PRIMARY KEY,
        item_id INT,
        order_id INT,
        FOREIGN KEY (item_id) REFERENCES items (id),
        FOREIGN KEY (order_id) REFERENCES orders (id)
    );";
    
}
