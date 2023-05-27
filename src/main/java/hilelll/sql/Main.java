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
     *
     * UNION //unique values
     * UNIION ALL // all values
     *
     * //get values in single column
     *
     * SELECT name from racing.drivers
     * UNION
     * SELECT model from racing.cars
     *
     *
     * DISTINCT
     * SELECT DISTINCT column1, column2, ...
     * FROM table_name;
     *
     * CREATE INDEX email_index ON users(email);
     * DROP INDEX email_index;
     *
     * CREATE TRIGGER user_trigger
     * AFTER INSERT OR DELETE ON users
     * FOR EACH ROW EXECUTE PROCEDURE update_user_role();
     *
     * CREATE OR REPLACE FUNCTION update_user_role() RETURNS TRIGGER AS $$
     * DECLARE
     * 	cut_id int;
     * 	cut_role_id int;
     * BEGIN
     * 	IF TG_OP = 'INSERT' THEN
     * 		cut_id = NEW.id;
     * 		cut_role_id = (SELECT id FROM roles WHERE name = 'USER');
     * 		INSERT INTO user_role(user_id, role_id) VALUES (cut_id, cut_role_id);
     * 		RETURN NEW;
     * 	ELSEIF TG_OP = 'DELETE' THEN
     * 		cut_id = OLD.id;
     * 		DELETE FROM user_role WHERE user_id = cut_id;
     * 		RETURN OLD;
     * 	END IF;
     * END;
     * $$ LANGUAGE plpgsql;
     */

    public static void main(String[] args) {

    }
}
