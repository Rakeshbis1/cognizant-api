CREATE TABLE view_customer
(
		representative_id VARCHAR(255),
		customer_id VARCHAR(255),
		name VARCHAR(255),
		estate VARCHAR(255),
		city VARCHAR(255),
		strategic_segmentation VARCHAR(255),
		size VARCHAR(255),
-- 		address_number VARCHAR(255),
		address VARCHAR(255),
		postal_code VARCHAR(255),
		commercial_solution VARCHAR(255),
		cdp_timestamp VARCHAR(255),
		cdp_transaction VARCHAR(255)
);

CREATE TABLE view_price
(
		representative_id VARCHAR(255),
		customer_id VARCHAR(255),
		product_id VARCHAR(255),
		public_price DOUBLE,
		cdp_timestamp VARCHAR(255),
		cdp_transaction VARCHAR(255)
);

CREATE TABLE view_pricinglist
(
		pricing_list_id VARCHAR(255),
		list_name VARCHAR(255),
		list_number VARCHAR(255),
		list_p_name VARCHAR(255),
		list_p_number VARCHAR(255),
		rate DOUBLE,
		cdp_timestamp VARCHAR(255),
		cdp_transaction VARCHAR(255)
);

CREATE TABLE view_pricinglistrange
(
		representative_id VARCHAR(255),
		customer_id VARCHAR(255),
		product_id VARCHAR(255),
		product_description VARCHAR(255),
		min_price_list VARCHAR(255),
		max_price_list VARCHAR(255),
		list_name VARCHAR(255),
		cdp_timestamp VARCHAR(255),
		cdp_transaction VARCHAR(255)
);

CREATE TABLE view_product
(
		representative_id VARCHAR(255),
		product_id VARCHAR(255),
		description VARCHAR(255),
		unit VARCHAR(255),
		currency VARCHAR(255),
		product_class_id VARCHAR(255),
		category_id VARCHAR(255),
		weight DOUBLE ,
		cdp_timestamp VARCHAR(255),
		cdp_transaction VARCHAR(255)
);