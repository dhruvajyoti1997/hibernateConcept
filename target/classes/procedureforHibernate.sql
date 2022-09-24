 
 ----- STORED PROCEDURE QUERY  -----
  DELIMITER //
  create  procedure findEmpById(in emp_id int)
  begin 
  
  select ename, edesig, edept from employees2 where eid = emp_id;
  
  end //
  DELIMITER ;