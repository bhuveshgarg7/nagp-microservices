package com.assignment.app.ordersService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.app.orders.Orders;
import com.assignment.app.ordersdto.OrderDTO;
import com.assignment.app.ordersdto.OrdersDTO;

@Service
public class OrdersService {
	public OrdersDTO getOrders() {
		List<Orders> orders = new ArrayList<>();
		orders.add(new Orders(1, Arrays.asList(new OrderDTO(1, 350, "04-May-2020"), new OrderDTO(2, 123, "21-Apr-2020"),
				new OrderDTO(3, 456, "12-May-2020"))));
		orders.add(new Orders(2, Arrays.asList(new OrderDTO(1, 223, "13-Apr-2020"), new OrderDTO(2, 345, "11-May-2020"),
				new OrderDTO(3, 123, "23-May-2020"))));

		return new OrdersDTO(orders);

	}

}
