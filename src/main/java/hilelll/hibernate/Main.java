package hilelll.hibernate;

public class Main {
    public static void main(String[] args) {
        /**
         * Hibernate ORM (or simply Hibernate) is an object–relational mapping tool for the Java programming language.
         * It provides a framework for mapping an object-oriented domain model to a relational database.
         * Hibernate handles object–relational impedance mismatch problems by replacing direct,
         * persistent database accesses with high-level object handling functions.
         * Hibernate's primary feature is mapping from Java classes to database tables,
         * and mapping from Java data types to SQL data types.
         * Hibernate also provides data query and retrieval facilities.
         * It generates SQL calls and relieves the developer
         * from the manual handling and object conversion of the result set.
         *
         * JPA - Java Persistence Application
         * ORM - Object Relational Mapping
         *
         * Entity rules:
         *      1. The class must be annotated with @Entity
         *      2. The class must have constructor by default
         *      3. Entity class must be top-level class
         *              (A top-level class is a class that is not a nested class.
         *              A nested class is any class whose declaration occurs inside
         *              the body of another class or interface.)
         *      4. Entity class can not be enum or interface
         *      5. Entity class can not be final
         *      6. Entity class can not be interface cannot contain final fields
         *         or methods contained in a mapping
         *      7.If class contains objects - must implement Serializable
         *      8. All fields must be private (have getters and setters)
         *      9. Have to be Primary Key
         *
         *      * Flyway
         *      * DataBase Migration
         *      * Evolve your database schema easily and reliably across all your instances. Simple, focused and powerful.
         *      * Path for scripts:
         *      * resources/db/migration/
         *      * Naming: V1.0.0_00010_create_name_table.sql
         *
         *
         * */
    }
}
