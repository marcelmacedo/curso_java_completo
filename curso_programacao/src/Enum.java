import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Enum {

	public static void main(String[] args) {
		
		Order order = new Order (1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println("-------");
		System.out.println(order);
		System.out.println("-------");
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		// Convers�o de String para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		
		System.out.println(os1);
		System.out.println("-------");
		System.out.println(os2);
	}

}
