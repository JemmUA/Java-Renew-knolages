package tests.service;

import hilelll.tests.service.EmailService;
import hilelll.tests.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import hilelll.tests.Entity.Order;
import hilelll.tests.exception.WrongEmailException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    OrderService orderService = new OrderService();
    @Mock
    EmailService mailService = mock(EmailService.class);


    @Test
    void create() throws WrongEmailException {
        when(mailService.validate(anyString())).thenReturn(true);
        Order alex = orderService.create("Alex", "alex@email.ua");
        assertNotNull(alex, "order is null");
        assertEquals(3, alex.getId());
        assertEquals("alex@email.ua", alex.getEmail());
        assertEquals("Alex", alex.getName());
    }
}