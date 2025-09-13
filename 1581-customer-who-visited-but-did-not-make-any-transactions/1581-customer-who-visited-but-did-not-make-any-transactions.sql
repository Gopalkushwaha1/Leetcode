Select v.customer_id , Count(*)  as count_no_trans 
from Visits as v 
left join Transactions as t 
on v.visit_id  = t.visit_id 
where t.transaction_id is null 
Group by v.customer_id ; 