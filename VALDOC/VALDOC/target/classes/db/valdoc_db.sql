---DDL


CREATE TABLE `role_permission` (
  `role_permission_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`role_permission_id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


CREATE TABLE `user_role` (
  `user_role_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_type` VARCHAR(20) NOT NULL,
  `role_type` VARCHAR(20) NOT NULL,
  `role_permission_id` INT(11) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  KEY `fk_role_permission_id` (`role_permission_id`),
  CONSTRAINT `fk_role_permission_id` FOREIGN KEY (`role_permission_id`) REFERENCES `role_permission` (`role_permission_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


CREATE TABLE `app_user` (
  `app_user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  `password` VARCHAR(16) NOT NULL,
  `created_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_active` TINYINT(1) NOT NULL,
  `is_deleted` TINYINT(1) NOT NULL,
  `user_role_id` INT(11) NOT NULL,
  PRIMARY KEY (`app_user_id`),
  KEY `fk_user_role_id` (`user_role_id`),
  CONSTRAINT `fk_user_role_id` FOREIGN KEY (`user_role_id`) REFERENCES `user_role` (`user_role_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;



-----------------------------------------------------------------
----------------------------------------------------------------

--DML


INSERT INTO `role_permission` (`role_permission_id`, `name`) VALUES
(1, 'CREATE'),
(2, 'READ'),
(3, 'UPDATE'),
(4, 'DELETE');


INSERT INTO `user_role` (`user_role_id`, `user_type`, `role_type`, `role_permission_id`) VALUES
(1, 'CLIENT', 'ADMIN', 4),
(2, 'CLIENT', 'USER', 3),
(3, 'VENDOR', 'ADMIN', 2),
(4, 'VENDOR', 'USER', 1);


