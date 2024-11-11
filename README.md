<div align="center">

<h1><a href="https://github.com/TheCollinsByte/design-patterns">Design Patterns and Principles</a></h1>

<a href="https://github.com/TheCollinsByte/design-patterns/blob/main/LICENSE">
<img alt="License" src="https://img.shields.io/github/license/TheCollinsByte/design-patterns?style=flat&color=eee&label="> </a>

<a href="https://github.com/TheCollinsByte/design-patterns/graphs/contributors">
<img alt="People" src="https://img.shields.io/github/contributors/TheCollinsByte/design-patterns?style=flat&color=ffaaf2&label=People"> </a>

<a href="https://github.com/TheCollinsByte/design-patterns/stargazers">
<img alt="Stars" src="https://img.shields.io/github/stars/TheCollinsByte/design-patterns?style=flat&color=98c379&label=Stars"> </a>

<a href="https://github.com/TheCollinsByte/design-patterns/network/members">
<img alt="Forks" src="https://img.shields.io/github/forks/TheCollinsByte/design-patterns?style=flat&color=66a8e0&label=Forks"> </a>

<a href="https://github.com/TheCollinsByte/design-patterns/watchers">
<img alt="Watches" src="https://img.shields.io/github/watchers/TheCollinsByte/design-patterns?style=flat&color=f5d08b&label=Watches"> </a>

<a href="https://github.com/TheCollinsByte/design-patterns/pulse">
<img alt="Last Updated" src="https://img.shields.io/github/last-commit/TheCollinsByte/design-patterns?style=flat&color=e06c75&label="> </a>

</div>

## Description

Welcome to the **Design Patterns and Principles Repository!** This repository serves as a comprehensive collection of widely used design patterns and principles in software development, demonstrating best practices in software architecture and engineering. It aims to provide a practical guide to understanding and applying both patterns and principles to solve common challenges, creating flexible, reusable, and maintainable systems.

- [Installation](#installation)
- [Design Patterns](#design-patterns)
   - [Creational Patterns](#creational-patterns)
   - [Structural Patterns](#structural-patterns)
   - [Behavioral Patterns](#behavioral-patterns)
   - [Concurrency Patterns](#concurrency-patterns)
- [Design Principles](#design-principles)
   - [SOLID Principles](#solid-principles)
- [Contributing](#contributing)
- [License](#license)

## Installation

Instructions on how to set up the project on a local machine:

1. Clone the repository:
    ```bash
    git clone git@github.com:TheCollinsByte/design-patterns-and-principles.git
    ```
2. Navigate to the project directory:
    ```bash
    cd design-patterns-and-principles
    ```
3. Ensure you have JDK version 21 installed. You can download it [here](https://www.oracle.com/java/technologies/downloads/#java21).

4. Compile the project:
    ```bash
   ./gradlew build
    ```

5. Run the project:
    ```bash
    ./gradlew :{MODULE_NAME}:test -Dtest.verbose=true
    ```

## Design Patterns

This repository includes examples of commonly used design patterns, each with detailed explanations and code implementations. Design patterns are proven solutions to recurring problems in software design and are categorized here by their purpose:

### Creational Patterns
- **Abstract Factory**
- **Builder**
- **Factory Method**
- **Prototype**
- **Singleton**

### Structural Patterns
- **Adapter**
- **Bridge**
- **Composite**
- **Decorator**
- **Facade**
- **Flyweight**
- **Proxy**

### Behavioral Patterns
- **Chain of Responsibility**
- **Command**
- **Interpreter**
- **Iterator**
- **Mediator**
- **Memento**
- **Observer**
- **State**
- **Strategy**
- **Template Method**
- **Visitor**

### Concurrency Patterns
- **Thread Pool**
- **Executor**
- **Producer-Consumer**
- **Reactor**

## Design Principles

This section covers fundamental design principles, such as SOLID, that guide software development and promote robust, maintainable, and scalable code. Each principle includes explanations, examples, and best practices.

### SOLID Principles

The SOLID principles represent core guidelines for object-oriented design:

1. **Single Responsibility Principle (SRP)**: A class should have only one reason to change, meaning it should only have one job or responsibility.
2. **Open/Closed Principle (OCP)**: Software entities (classes, modules, functions) should be open for extension but closed for modification.
3. **Liskov Substitution Principle (LSP)**: Subtypes should be substitutable for their base types without altering the correctness of the program.
4. **Interface Segregation Principle (ISP)**: Clients should not be forced to depend on interfaces they do not use. Split interfaces into smaller, specific ones.
5. **Dependency Inversion Principle (DIP)**: High-level modules should not depend on low-level modules; both should depend on abstractions.

Each principle has its dedicated folder within the repository containing code samples and documentation.

## Contributing

Contributions are Welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b name-dp-module`)
3. Make your changes and commit them (`git commit -m "Design Pattern/Principle: ..."`)
4. Push to the branch (`git push origin name-dp-module`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

<br/><br/>

<div align="center">

<strong>⭐ Hit the star button if you found this useful ⭐</strong><br>

<a href="https://github.com/TheCollinsByte/design-patterns">Source</a>
| <a href="https://x.com/TheCollinsByte" target="_blank">Twitter </a>
| <a href="http://www.linkedin.com/in/collins-boniface" target="_blank">LinkedIn </a>
| <a href="mailto:collo@fastmail.com">Email</a>
</div>
