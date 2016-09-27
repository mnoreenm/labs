--1   SELECT * FROM northwind.customers;

--2     Select distinct country_region 
		From customers;


--3   Select * 
         From customers
         Where  last_name LIKE 'B%';

--4    SELECT * 
         FROM Orders LIMIT 0, 10;
         
         
--5     Select * from customers
         Where  zip_postal_code IN(1010,3012,12209,05023,99999);
         
         
--6     SELECT * 
         FROM Orders
         Where ship_country_region is NOT NULL;
         
--7         Select * 
         From customers 
        Order by country_region,city;
        
        
        
        
        
--8        Insert into customers(company,last_name,first_name,job_title)
        Values('Ford','Noreen','Sadia','Manager');
        
        
--9        Update Orders
        Set ship_zip_code = 97201
         Where ship_city = 'Portland';
         
         
         
--10         Delete 
         From order_details
         Where quantity = 1;
         
         
--11         Select avg(quantity),max(quantity),min(quantity)
         From order_details;
         
         
         
--12         Select order_id,(quantity),max(quantity),min(quantity)
         From order_details
         Group by order_id;
         
         
         
--13         Select customer_id
         From orders
         Where id = 65;
         
         
--14         Select * from Orders o Inner Join  Customers c
         On o.id = c.id;
         
         
        Select * from Orders o Left Join  Customers c
         On o.id = c.id; 
         
         
        Select * from Orders o Right Join  Customers c
         On o.id = c.id; 
         
         
         
         
--15         Select first_name 
         From employees
         where notes IS null;
         
         
        
         
           
--16         Select ship_city 
             From Orders  o inner join customers c
             On o.customer_id =c.id 
            Where  first_name ='Francisco';