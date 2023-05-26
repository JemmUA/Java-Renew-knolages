package hilelll.sql;

public class Main {
    /**
     * DataBaseManagementSystem (DBMS/СУБД)
     * RelationalDataBaseManagementSystem (RDBMS/РСУБД)
     *
     * Types of databases:
         * 1) Centralized Database.
         * 2) Distributed Database.
         * 3) Relational Database.
         * 4) NoSQL Database (not only sql).
         * 5) Cloud Database.
         * 6) Object-oriented Databases.
         * 7) Hierarchical Databases.
         * 8) Network Databases.
     *
    * */

    /**
     * SQL
     * Structured query language (структурована мова запитів)
     *
     * DDL
     * Data definition language
     * CREATE, ALTER (modification), DROP
     * (operations with tables: create, modify fields, delete)
     *
     *The ALTER TABLE statement is used to add, delete,
     * or modify columns in an existing table.
     *
     * The ALTER TABLE statement is also used to add and drop
     * various constraints on an existing table.
     *
     * Examples rename and change type:
     *      ALTER TABLE racing.drivers
     *      RENAME COLUMN top3 TO top20;
     *
     *      ALTER TABLE racing.drivers
     *      ALTER COLUMN top5 TYPE int USING top5::integer;
     *
     *      ALTER TABLE racing.cars
     *      ADD FOREIGN KEY (driver_id) REFERENCES racing.drivers(id)
     *
     *      ALTER TABLE racing.cars
     *      DROP FOREIGN KEY cars_driver_id_fkey;
     *
     *      ALTER TABLE racing.statuses
     *      ALTER COLUMN status TYPE varchar USING status::varchar (20);
     *
     * DML
     * Data manipulation language
     * (operations with data)
     * SELECT, INSERT, UPDATE, DELETE
     * INSERT INTO table ( ,  , ) VAL   UES ( , , );
     *
     * DCL
     * Data control language
     * (permissions)
     * GRANT, REVOKE, DENY
     *
     * TCL
     * Transaction control language
     * BEGIN TRANSACTION
     * COMMIT TRANSACTION
     * ROLLBACK TRANSACTION
     * SAVE TRANSACTION
     *
     *
     * Troubles of data management:
     *
     * cascade deleting with links:
     *
     * create table racing.driver_status (
     * 	    driver_id int REFERENCES racing.drivers (id) ON DELETE CASCADE,
     * 	    status_id int REFERENCES racing.statuses (id) ON DELETE CASCADE
     * )
     *
     * restriction deleting if exist links:
     *
     * create table racing.driver_status (
     *      driver_id int, constraint fk_driver
     *              FOREIGN KEY (driver_id) REFERENCES racing.drivers (id),
     *      status_id int, constraint fk_status
     *              FOREIGN KEY (status_id) REFERENCES racing.statuses (id)
     * */

    /** CRUD operations
     *
     * C    INSERT INTO table (id, name) VALUES (1, 'ALEX');
     * R    SELECT * FROM table;
     * U    UPDATE table SET column_name = 20; // where!!!
     * D    DELETE FROM table;
     *
     * WARNING!
     * Update without conditions will update WHOLE COLUMN with new value!
     *
     * Conditional operators:
     * WHERE: AND OR IN NOT
     *
     *
     * JOIN
     * INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN
     *
     * SELECT d.name as 'Ім'я', d.email, d.wins, s.status as stat FROM racing.drivers as d
     * INNER JOIN racing.driver_status ds ON d.id = ds.driver_id
     * INNER JOIN racing.statuses s ON s.id = ds.status_id
     */

    public static void main(String[] args) {

    }
}
