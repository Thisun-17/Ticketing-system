# Real-Time Event Ticketing System

A Java-based concurrent ticketing system implementation for managing real-time ticket sales.

## Project Overview
This system implements a producer-consumer pattern to handle concurrent ticket operations:
- Vendors (Producers) releasing tickets
- Customers (Consumers) purchasing tickets
- Thread-safe ticket pool management

## Features
- Multi-threaded ticket processing
- Configurable system parameters
- Real-time ticket availability tracking

## Technology Stack
- Java
- JavaFX for GUI
- Git for version control

## Getting Started
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run Main.java

## Course Information
- University: IIT
- Course: Object Oriented Programming
- Year: 2nd Year, Semester 1

## Weekly Progress

### Week 1 Progress (Current)
#### Implemented Components
- Ticket class for ticket management
- Config class for system settings
- TicketPool for thread-safe ticket operations
- Vendor class for ticket generation

#### Latest Test Results
```
Testing Vendor System:
Initial available tickets: 0
Vendor 1 releasing tickets...
Vendor 1 released ticket: 1000
Vendor 1 released ticket: 1001
Vendor 1 released ticket: 1002
After Vendor 1:
Available tickets: 3
Vendor 1 total released: 3
Vendor 2 releasing tickets...
Vendor 2 released ticket: 2000
Vendor 2 released ticket: 2001
After Vendor 2:
Available tickets: 5
Vendor 2 total released: 2
Final Pool Status:
Total tickets in pool: 5
Total tickets processed: 5
```

#### Next Steps
- Implement Customer functionality
- Add concurrent operations
- Develop purchase mechanisms
- Create monitoring system