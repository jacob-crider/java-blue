-- CREATE DATABASE projectorganizer;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

CREATE TABLE employee (
        employee_number SERIAL PRIMARY KEY,
        last_name VARCHAR(30) NOT NULL,
        first_name VARCHAR(30) NOT NULL,
        gender VARCHAR(15) NOT NULL,
        date_of_birth VARCHAR(15) NOT NULL,
        hire_date VARCHAR(15) NOT NULL,
        department_name VARCHAR(15) NOT NULL, 
        
        CONSTRAINT chk_gender CHECK (gender IN ('MALE', 'FEMALE', 'NOT SPECIFIED'))
);

CREATE TABLE department (
        department_number SERIAL PRIMARY KEY,
        department_name VARCHAR(15) NOT NULL,
        number_of_employees BIGINT NOT NULL    
);

CREATE TABLE project (
        project_number SERIAL PRIMARY KEY,
        project_name VARCHAR(30) NOT NULL,
        start_date VARCHAR(15) NOT NULL,
        department_number BIGINT NOT NULL,
        
        CONSTRAINT fk_department_number FOREIGN KEY (department_number) REFERENCES department(department_number) 
);

INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Durden', 'Tyler', 'MALE', '01-21-1985', '01-21-2002', 'SALES'); 
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Lasso', 'Ted', 'MALE', '01-21-1979', '01-21-1997', 'MARKETING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Martin', 'Steve', 'MALE', '01-21-1956', '02-21-1975', 'ENGINEERING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Robot', 'Iam', 'NOT SPECIFIED', '01-21-2027', '10-21-2040', 'SALES');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Six', 'Cayde', 'NOT SPECIFIED', '12-31-3000', '02-25-3002', 'MARKETING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Demamp', 'Adam', 'MALE', '03-31-1992', '08-25-2014', 'SALES');    
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Clark', 'Edith', 'FEMALE', '3-30-1895', '04-20-1918', 'ENGINEERING');
INSERT INTO employee (employee_number,last_name, first_name, gender, date_of_birth, hire_date, department_name)
        VALUES (DEFAULT, 'Lovelace', 'Ada', 'FEMALE', '12-10-1815', '11-19-1840', 'ENGINEERING');
        
INSERT INTO department (department_number, department_name, number_of_employees)
        VALUES (DEFAULT, 'SALES', 3);
INSERT INTO department (department_number, department_name, number_of_employees)
        VALUES (DEFAULT, 'MARKETING', 2);
INSERT INTO department (department_number, department_name, number_of_employees)
        VALUES (DEFAULT, 'ENGINEERING', 3);

        
INSERT INTO project (project_number, project_name, start_date, department_number)
        VALUES (DEFAULT, 'Project Mojo', '12-19-2005', 1);
INSERT INTO project (project_number, project_name, start_date, department_number)
        VALUES (DEFAULT, 'Sales Spire', '5-20-2015', 1);
INSERT INTO project (project_number, project_name, start_date, department_number)
        VALUES (DEFAULT, 'Seed Marketing', '10-29-3015', 2);
INSERT INTO project (project_number, project_name, start_date, department_number)
        VALUES (DEFAULT, 'Domain Project', '1-1-2028', 3);