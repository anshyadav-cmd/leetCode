SELECT ( select distinct salary FROM EMPLOYEE ORDER BY SALARY DESC  LIMIT 1 , 1) AS SecondHighestSalary ;