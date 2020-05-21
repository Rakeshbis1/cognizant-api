--Customer
INSERT INTO view_customer(representative_id, customer_id, name, estate, city, strategic_segmentation, size, address, postal_code, commercial_solution, cdp_timestamp, cdp_transaction) VALUES ('ben.burbage@capgemini.com', '001', 'The Man', 'Large', 'A City', 'All Goods', '999', 'A Street', 'A1 0AA', 'Stuff','2018-07-04T05:38:40+00:00','U');

--Price
INSERT INTO view_price(representative_id, customer_id, product_id, public_price, cdp_timestamp, cdp_transaction) VALUES ('ben.burbage@capgemini.com','001','001',10.00,'2018-07-04T05:38:40+00:00','U');

--Pricing List
INSERT INTO view_pricinglist(pricing_list_id, list_name, list_number, list_p_name, list_p_number, rate, cdp_timestamp, cdp_transaction) VALUES ('SuínosR034','N','41','P0','0',0.305,'2018-07-04T05:38:40+00:00','U');

--Pricing List Range
INSERT INTO view_pricinglistrange(representative_id, customer_id, product_id, product_description, min_price_list, max_price_list, list_name, cdp_timestamp, cdp_transaction) VALUES ('ben.burbage@capgemini.com', '001', '001', 'The Best Product', 'M 25', 'M 99', 'SuínosR034', '2018-07-04T05:38:40+00:00', 'U');

--Product
INSERT INTO view_product(representative_id, product_id, description, unit, currency, product_class_id, category_id, weight, cdp_timestamp, cdp_transaction) VALUES ('ben.burbage@capgemini.com', '001', 'MAELK', 'KG', 'GBP', 'Sucedaneos', 'Dairy', 668.02,'2018-07-04T05:38:40+00:00','I');