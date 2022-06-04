CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      
        select (select distinct(salary) from employee 
                order by salary DESC
                limit N ,1) AS SecondHighestSalary
  );
END