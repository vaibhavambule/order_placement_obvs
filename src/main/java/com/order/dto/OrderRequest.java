 package com.order.dto;

public class OrderRequest {
   private Long productId;
   private int quantity;

   public OrderRequest() {
   }

   public OrderRequest(Long productId, int quantity) {
      this.productId = productId;
      this.quantity = quantity;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public String toString() {
      return "OrderRequest [productId=" + this.productId + ", quantity=" + this.quantity + "]";
   }
}