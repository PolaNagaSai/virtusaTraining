
CREATE FUNCTION hello(s char(20))
returns char(50) DETERMINISTIC 
RETURN CONCAT('Hello,',S,'!');

SELECT hello('World') as output;




