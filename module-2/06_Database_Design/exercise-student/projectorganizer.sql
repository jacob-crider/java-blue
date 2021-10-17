-- CREATE DATABASE projectorganizer;
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
        employee_number SERIAL PRIMARY KEY,
        last_name VARCHAR(30) NOT NULL,
        first_name VARCHAR(30) NOT NULL,
        gender VARCHAR(15),
        date_of_birth VARCHAR(15),
        hire_date VARCHAR (15),
        department VARCHAR (15), 
        
        CONSTRAINT chk_gender CHECK (gender IN ('MALE', 'FEMALE', 'NOT SPECIFIED')),
        CONSTRAINT chk_department CHECK (department IN ('SALES', 'MARKETING', 'ENGINEERING'))
);

INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Durden', 'Tyler', 'MALE', '01-21-1985', '01-21-2002', 'SALES'); 
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Lasso', 'Ted', 'MALE', '01-21-1979', '01-21-1997', 'MARKETING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Martin', 'Steve', 'MALE', '01-21-1956', '02-21-1975', 'ENGINEERING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Robot', 'Iam', 'NOT SPECIFIED', '01-21-2027', '10-21-2040', 'SALES');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Six', 'Cayde', 'NOT SPECIFIED', '12-31-3000', '02-25-3002', 'MARKETING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Demamp', 'Adam', 'MALE', '03-31-1992', '08-25-2014', 'SALES');    
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Clark', 'Edith', 'FEMALE', '3-30-1895', '04-20-1918', 'ENGINEERING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department)
        VALUES (DEFAULT, 'Lovelace', 'Ada', 'FEMALE', '12-10-1815', '11-19-1840', 'ENGINEERING');