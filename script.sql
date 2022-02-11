CREATE TABLE `users` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20) DEFAULT NULL,
    `user_name` varchar(20) DEFAULT NULL,
    `password` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `operations` (
    `id` int NOT NULL AUTO_INCREMENT,
    `user_id` int NOT NULL,
    `operation` double DEFAULT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id),
    PRIMARY KEY (`id`)
);