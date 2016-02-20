
CREATE TABLE IF NOT EXISTS `app_user` (
  `app_user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(40) NOT NULL,
  `created_date` TIMESTAMP NOT NULL,
  `last_updated` TIMESTAMP NOT NULL,
  `is_active` TINYINT(1) NOT NULL,
  `is_deleted` TINYINT(1) NOT NULL,
  `user_role_id` INT(11) NOT NULL,
  PRIMARY KEY (`app_user_id`),
  KEY `fk_user_role_id` (`user_role_id`)
) ENGINE=INNODB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;


INSERT INTO `app_user` (`app_user_id`, `name`, `email`, `password`, `created_date`, `last_updated`, `is_active`, `is_deleted`, `user_role_id`) VALUES
(1, 'Admin', 'admin@bits.com', 'YWRtaW4xMjMh', '2016-02-19 12:38:46', '2016-02-19 12:38:46', 0, 1, 1),
(3, 'Ram', 'ram@thbs.com', 'VGVzdDEyMw==', '2016-02-19 12:54:16', '2016-02-19 12:59:34', 0, 0, 3);



CREATE TABLE IF NOT EXISTS `role_permission` (
  `role_permission_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`role_permission_id`)
) ENGINE=INNODB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;


INSERT INTO `role_permission` (`role_permission_id`, `name`) VALUES
(1, 'CREATE'),
(2, 'READ'),
(3, 'UPDATE'),
(4, 'DELETE');



CREATE TABLE IF NOT EXISTS `user_role` (
  `user_role_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_type` VARCHAR(20) NOT NULL,
  `role_type` VARCHAR(20) NOT NULL,
  `role_permission_id` INT(11) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  KEY `fk_role_permission_id` (`role_permission_id`)
) ENGINE=INNODB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;


INSERT INTO `user_role` (`user_role_id`, `user_type`, `role_type`, `role_permission_id`) VALUES
(1, 'SUPER', 'ADMIN', 4),
(2, 'CLIENT', 'ADMIN', 4),
(3, 'CLIENT', 'USER', 3),
(4, 'VENDOR', 'ADMIN', 2),
(5, 'VENDOR', 'USER', 1);


ALTER TABLE `app_user`
  ADD CONSTRAINT `fk_user_role_id` FOREIGN KEY (`user_role_id`) REFERENCES `user_role` (`user_role_id`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `user_role`
  ADD CONSTRAINT `fk_role_permission_id` FOREIGN KEY (`role_permission_id`) REFERENCES `role_permission` (`role_permission_id`) ON DELETE CASCADE ON UPDATE CASCADE;


