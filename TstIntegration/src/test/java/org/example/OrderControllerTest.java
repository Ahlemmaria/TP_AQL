package org.example;

import org.junit.Test;


import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    public void createOrderSucessTest(){
        // Création des mocks
        OrderService orderService = mock(OrderService.class);
        Order order = new Order("123456", "NOM PRENOM");

        OrderController orderController = new OrderController(orderService);
        when(orderController.createOrder(order)).thenReturn(true);
        boolean create = orderController.createOrder(order);
        verify(orderService).createOrder(order);
        OrderDao orderDao = mock(OrderDao.class);
        OrderService orderServicee = new OrderService(orderDao);
        when(orderServicee.createOrder(order)).thenReturn(true);
        boolean cr = orderServicee.createOrder(order);
        verify(orderDao).saveOrder(order);

    }
    @Test
    public void createOrderFailerTest(){
        // Création des mocks
        OrderService orderService = mock(OrderService.class);
        Order order = new Order("123456",  "NOM PRENOM");
        OrderController orderController = new OrderController(orderService);
        when(orderController.createOrder(order)).thenReturn(false);
        boolean create = orderController.createOrder(order);
        verify(orderService).createOrder(order);
        OrderDao orderDao = mock(OrderDao.class);
        OrderService orderServicee = new OrderService(orderDao);
        when(orderServicee.createOrder(order)).thenReturn(false);
        boolean createorder = orderServicee.createOrder(order);
        verify(orderDao).saveOrder(order);
    }
}