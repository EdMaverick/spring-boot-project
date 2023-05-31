CREATE USER root;
CREATE DATABASE postgresdb;
GRANT ALL PRIVILEGES ON DATABASE postgresdb TO root;
ALTER USER postgres with PASSWORD 'password';
ALTER USER root with PASSWORD 'password';