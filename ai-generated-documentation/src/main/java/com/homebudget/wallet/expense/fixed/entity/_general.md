## General Documentation for entity package 

This documentation provides a comprehensive overview of the `entity` package, outlining its purpose, structure, and functionalities. The package focuses on defining data models (entities) that represent key concepts within a system, such as expenses, users, wallets, and transactions. These entities are designed to be persistent, meaning they can be stored in a database for later retrieval and manipulation. 

The `entity` package leverages Java Persistence API (JPA) annotations to define the structure of these entities and their relationships with each other. It also incorporates Spring Data Auditing for tracking changes made to entities over time. This allows for robust data management, version control, and auditing capabilities within applications that utilize this package.


## Table of Contents
- [FixedExpense.md](FixedExpense.md) 
  - **Description:** Defines a `FixedExpense` entity class representing a fixed expense within a personal budget system. It utilizes JPA annotations for database persistence and Spring Data Auditing for tracking changes. The class stores information about the expense, including its value, user associated with it, wallet ID, description, and timestamp of addition. 



