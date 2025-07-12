  package com.order.mock;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
   public boolean processPayment(double amount) {
      return amount <= 100000.0D;
   }
}