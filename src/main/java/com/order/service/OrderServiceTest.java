package com.order.service;

public class OrderServiceTest {

	/*@Mock
	private InventoryService inventoryService;

	@Mock
	private PaymentService paymentService;

	@Mock
	private OrderRepository orderRepository;

	@InjectMocks
	private OrderService orderService;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testPlaceOrder_Success() {
		OrderRequest request = new OrderRequest();
		request.setProductId(1L);
		request.setQuantity(2);

		Product product = new Product(1L, "Laptop", 10, 50000.0);

		when(inventoryService.getProduct(1L)).thenReturn(product);
		when(inventoryService.lockAndDeductStock(1L, 2)).thenReturn(true);
		when(paymentService.processPayment(100000.0)).thenReturn(true);
		when(orderRepository.save(any(Order.class))).thenAnswer(i -> i.getArguments()[0]);

		Order order = orderService.placeOrder(request);

		assertNotNull(order);
		assertEquals("SUCCESS", order.getStatus());
		assertEquals(2, order.getQuantity());
		assertEquals(100000.0, order.getTotalAmount());
	}

	@Test
	void testPlaceOrder_ProductNotFound() {
		OrderRequest request = new OrderRequest();
		request.setProductId(999L);
		request.setQuantity(1);

		when(inventoryService.getProduct(999L)).thenReturn(null);

		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			orderService.placeOrder(request);
		});

		assertEquals("Product not found.", ex.getMessage());
	}

	@Test
	void testPlaceOrder_OutOfStock() {
		OrderRequest request = new OrderRequest();
		request.setProductId(1L);
		request.setQuantity(100);

		Product product = new Product(1L, "Laptop", 10, 50000.0);

		when(inventoryService.getProduct(1L)).thenReturn(product);
		when(inventoryService.lockAndDeductStock(1L, 100)).thenReturn(false);

		assertThrows(OutOfStockException.class, () -> {
			orderService.placeOrder(request);
		});
	}

	@Test
	void testPlaceOrder_PaymentFailure() {
		OrderRequest request = new OrderRequest();
		request.setProductId(1L);
		request.setQuantity(3);

		Product product = new Product(1L, "Laptop", 10, 50000.0);

		when(inventoryService.getProduct(1L)).thenReturn(product);
		when(inventoryService.lockAndDeductStock(1L, 3)).thenReturn(true);
		when(paymentService.processPayment(150000.0)).thenReturn(false);

		assertThrows(PaymentFailedException.class, () -> {
			orderService.placeOrder(request);
		});
	}*/

}
