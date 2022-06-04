SELECT firstName, lastName, city, state FROM PERSON 
left JOIN ADDRESS
on Person.PersonId = Address.PersonId
order by person.firstName, person.lastName;