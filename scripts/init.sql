CREATE SCHEMA myScheme;
CREATE TABLE myScheme.Student (
  Student_Id SERIAL PRIMARY KEY,
  First_Name VARCHAR(50) NOT NULL,
  Last_Name  VARCHAR(50) NOT NULL,
  Class      VARCHAR(50) NOT NULL,
  RollNo     VARCHAR(50) NOT NULL,
  Age        INT         NOT NULL
);
INSERT INTO myScheme.Student (First_Name, Last_Name, Class, RollNo, Age) VALUES ('Olya', 'Pyst', '11A', '4s584ds', 15);
COMMIT