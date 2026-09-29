CREATE DATABASE IF NOT EXISTS assettrack_db;
USE assettrack_db;

CREATE TABLE IF NOT EXISTS asset_items (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    asset_code VARCHAR(50) NOT NULL UNIQUE,
    asset_name VARCHAR(255) NOT NULL,
    category VARCHAR(100) NOT NULL,
    assigned_to VARCHAR(255),
    status VARCHAR(50) NOT NULL
);
