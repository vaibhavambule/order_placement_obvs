  package com.order.exception;

public class PaymentFailedException extends RuntimeException {
   private static final long serialVersionUID = 3214413222891698562L;

   public PaymentFailedException(String message) {
      super(message);
   }
}