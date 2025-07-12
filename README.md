# Order Placement Application

A simple Spring Boot application simulating order placement for an e-commerce platform with the following business flow:

## Features:
- Validate product stock
- Lock and deduct stock
- Simulate payment process
- Save order to database
- Layered architecture (Controller → Service → Repository)
- In-memory mock services for inventory and payment

## Tech Stack
Language:- Java 17
Framework:- Spring Boot 3.x
Database:- H2 (In-memory)
Build Tool:-  Maven

## Project Structure

src/
└── main/
    └── java/com/order/
        ├── controller/     → Handles API requests
        ├── service/        → Contains business logic
        ├── model/          → Defines data classes like Order and Product
        ├── dto/            → Request/response data objects
        ├── repository/     → Interfaces to interact with the database
        ├── exception/      → Custom exception classes
        └── mock/           → Simulated inventory and payment services


##How to Run

1. Clone the repository:
   git clone https://github.com/vaibhavambule/order_placement_obvs.git
   
3. Import and Run the app:

4. Test the API with a tool like Postman.

## Sample API Request

### Endpoint:
```
POST /api/orders
```

### Request JSON Body:

{
  "productId": 1,
  "quantity": 2
}


### Possible Responses:
- Order placed:  
  
  {
    "id": 1,
    "productId": 1,
    "quantity": 2,
    "totalAmount": 100000.0,
    "status": "SUCCESS"
  }
  

- Out of stock: "Product is out of stock."

- Payment failed: "Payment failed."

