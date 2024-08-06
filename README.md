IDE used: Eclipse.

Java Version : JDK 21.0.



Design Patterns Exercise
This project demonstrates various design patterns implemented in Java. It covers behavioral, creational, and structural design patterns, each represented through real-world scenarios. The design patterns showcased are:

Behavioral Patterns: Chain of Responsibility, Observer
Creational Patterns: Singleton, Factory
Structural Patterns: Adapter, Facade
Table of Contents
Introduction
Design Patterns
Behavioral Patterns
Creational Patterns
Structural Patterns


Introduction
Design patterns are reusable solutions to common software design problems. They help developers create flexible, scalable, and maintainable code. This project demonstrates six popular design patterns in Java with simple yet effective examples.

Design Patterns

Behavioral Patterns
1. Chain of Responsibility Pattern
Scenario: A customer support system where requests are escalated through different support levels if not resolved.

Classes Involved:

Handler: Abstract class defining the request handling method.
Level1Support, Level2Support, Level3Support: Concrete handlers processing requests at different levels.
Key Point: Allows request handling by passing the request along a chain of handlers until one of them can process it.

2. Observer Pattern
Scenario: A newsletter system where subscribers receive updates when new content is published.

Classes Involved:

Observer: Interface for all observers.
Subscriber: Concrete observers implementing the Observer interface.
Subject: Interface for managing observers.
Newsletter: Concrete subject maintaining a list of subscribers.
Key Point: Establishes a one-to-many dependency, so when one object changes state, all its dependents are notified.

Creational Patterns
1. Singleton Pattern
Scenario: A logging system that ensures a single instance handles all log operations.

Class Involved:

Logger: Singleton class managing log operations.
Key Point: Ensures a class has only one instance and provides a global point of access to it.

2. Factory Pattern
Scenario: A vehicle factory that produces cars, bikes, or trucks based on a given type.

Classes Involved:

Vehicle: Interface representing a vehicle.
Car, Bike, Truck: Concrete classes implementing the Vehicle interface.
VehicleFactory: Factory class responsible for creating vehicles.
Key Point: Defines an interface for creating objects, but lets subclasses alter the type of objects that will be created.

Structural Patterns

1. Adapter Pattern
Scenario: Integrating an existing payment gateway with a new client application that requires a different interface.

Classes Involved:

OldPaymentGateway: Existing payment gateway.
NewPaymentGateway: New interface expected by the client.
PaymentAdapter: Adapter that bridges the gap between old and new interfaces.
Key Point: Allows incompatible interfaces to work together by translating requests between them.

2. Facade Pattern
Scenario: Simplifying access to a complex media library for managing photos and videos.

Classes Involved:

PhotoLibrary: Complex subsystem for managing photos.
VideoLibrary: Complex subsystem for managing videos.
MediaFacade: Facade providing a simple interface to the complex media library.
Key Point: Provides a unified and simplified interface to a set of interfaces in a subsystem, making it easier to use.
