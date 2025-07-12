 package com.order.mock;

import com.order.model.Product;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class InventoryService {
   private final Map<Long, Product> productDB = new HashMap();

   @PostConstruct
   public void init() {
      this.productDB.put(1L, new Product(1L, "Laptop", 10, 50000.0D));
      this.productDB.put(2L, new Product(2L, "Phone", 20, 25000.0D));
   }

   public Product getProduct(Long id) {
      return (Product)this.productDB.get(id);
   }

   public synchronized boolean lockAndDeductStock(Long productId, int quantity) {
      Product product = (Product)this.productDB.get(productId);
      if (product != null && product.getStock() >= quantity) {
         product.setStock(product.getStock() - quantity);
         return true;
      } else {
         return false;
      }
   }
}