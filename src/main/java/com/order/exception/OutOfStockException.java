package com.order.exception;

public class OutOfStockException extends RuntimeException {
   private static final long serialVersionUID = 3039822005040695454L;

   public OutOfStockException(String message) {
      super(message);
   }
}