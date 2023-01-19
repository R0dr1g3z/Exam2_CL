package com.example;

public class Main02 {
    private static final String QUERY1 = "SELECT * FROM items WHERE price > 50 ORDER BY price ASC";
	private static final String QUERY2 = "INSERT INTO items(name,description,price) VALUES('product1','desc1',28)";
	private static final String QUERY3 = "DELETE FROM users WHERE id = 3";
	private static final String QUERY4 = "SELECT DISTINCT users.id,name,email FROM users JOIN messages ON users.id=messages.user_id ORDER BY users.id DESC";
	private static final String QUERY5 = "SELECT price FROM orders JOIN items_orders ON orders.id=order_id JOIN items ON items.id=item_id ORDER BY price DESC LIMIT 1";
	private static final String QUERY6 = "SELECT * FROM orders WHERE created = '2017-11-12'";
	private static final String QUERY7 = "INSERT INTO items_orders(order_id,item_id) VALUES(3,2)";
	private static final String QUERY8 = "SELECT * FROM messages WHERE message LIKE 'a%'";
}
