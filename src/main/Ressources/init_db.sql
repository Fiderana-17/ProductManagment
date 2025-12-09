CREATE USER product_manager_user WITH PASSWORD '123456';

CREATE DATABASE product_management_db OWNER product_manager_user;

GRANT CREATE ON DATABASE product_management_db TO product_manager_user;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO product_manager_user;

GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO product_manager_user;

ALTER DEFAULT PRIVILEGES IN SCHEMA public
GRANT ALL ON TABLES TO product_manager_user;

ALTER DEFAULT PRIVILEGES IN SCHEMA public
GRANT ALL ON SEQUENCES TO product_manager_user;