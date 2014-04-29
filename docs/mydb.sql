SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
SHOW WARNINGS;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `school`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `school` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `status` VARCHAR(45) NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `family`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `family` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `family` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `balance` DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  `status` VARCHAR(45) NULL,
  `father_firstname` VARCHAR(45) NULL,
  `father_lastname` VARCHAR(45) NULL,
  `mother_firstname` VARCHAR(45) NULL,
  `mother_lastname` VARCHAR(45) NULL,
  `emergency_name1` VARCHAR(45) NULL,
  `emergency_phone1` VARCHAR(45) NULL,
  `emergency_name2` VARCHAR(45) NULL,
  `emergency_phone2` VARCHAR(45) NULL,
  `insurance_name` VARCHAR(45) NULL,
  `insurance_id` VARCHAR(45) NULL,
  `insurance_group` VARCHAR(45) NULL,
  `insurance_address` TEXT NULL,
  `dental_insurance_name` VARCHAR(45) NULL,
  `dental_insurance_id` VARCHAR(45) NULL,
  `dental_insurance_group` VARCHAR(45) NULL,
  `dental_insurance_address` TEXT NULL,
  `vision_insurance_name` VARCHAR(45) NULL,
  `vision_insurance_id` VARCHAR(45) NULL,
  `vision_insurance_group` VARCHAR(45) NULL,
  `vision_insurance_address` TEXT NULL,
  `school_id` INT NOT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `family` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `family_doctors`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `family_doctors` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `family_doctors` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `family_id` INT NULL,
  `physician_name` VARCHAR(255) NOT NULL,
  `practice_type` VARCHAR(255) NULL,
  `address1` VARCHAR(255) NULL,
  `address2` VARCHAR(255) NULL,
  `city` VARCHAR(150) NULL,
  `state` VARCHAR(100) NULL,
  `phone1` INT NULL,
  `phone2` INT NULL,
  `fax` INT NULL,
  `email` VARCHAR(255) NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `family_id_idx` ON `family_doctors` (`family_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `school_grades`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school_grades` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `school_grades` (
  `id` INT NOT NULL,
  `grade_name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `school_id` INT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `school_grades` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `family_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` INT NULL,
  `grade` INT NOT NULL,
  `academic_level` VARCHAR(45) NOT NULL,
  `dob` DATE NOT NULL,
  `school_name` VARCHAR(255) NULL,
  `returning` CHAR(1) NOT NULL,
  `physician` INT NULL,
  `dentist` INT NULL,
  `status` VARCHAR(45) NULL,
  `school_id` INT NOT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `family_id_idx` ON `student` (`family_id` ASC);

SHOW WARNINGS;
CREATE INDEX `physician_id_idx` ON `student` (`dentist` ASC, `physician` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `student` (`grade` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx1` ON `student` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `student_details`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_details` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `student_details` (
  `id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `student_since` DATE NULL,
  `food_allergies` TEXT NULL,
  `drug_allergies` TEXT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `student_id_idx` ON `student_details` (`student_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `contact_details`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `contact_details` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `contact_details` (
  `id` INT NOT NULL,
  `family_id` INT NOT NULL,
  `address1` VARCHAR(255) NULL,
  `address2` VARCHAR(255) NULL,
  `city` VARCHAR(250) NULL,
  `state` VARCHAR(45) NULL,
  `mobile_phone1` INT NULL,
  `mobile_phone2` INT NULL,
  `home_phone` INT NULL,
  `work_phone` INT NULL,
  `email1` VARCHAR(255) NULL,
  `email2` VARCHAR(255) NULL,
  `contact_name` VARCHAR(100) NOT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `family_id_idx` ON `contact_details` (`family_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `volunteer_types`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `volunteer_types` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `volunteer_types` (
  `id` INT NOT NULL,
  `type` VARCHAR(45) NULL,
  `description` VARCHAR(255) NULL,
  `date` DATE NULL,
  `school_id` INT NOT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `volunteer_types` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `family_volunteer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `family_volunteer` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `family_volunteer` (
  `family_id` INT NULL,
  `volunteer_type_id` INT NULL,
  `signed_date` DATETIME NULL,
  `signed_hours` INT NOT NULL DEFAULT 0,
  `completed_hours` INT NOT NULL DEFAULT 0,
  `completed_date` DATETIME NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `family_id_idx` ON `family_volunteer` (`family_id` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `family_volunteer` (`volunteer_type_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `fees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fees` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `fees` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `display_name` VARCHAR(45) NULL,
  `fee` DECIMAL(10,2) NULL,
  `description` VARCHAR(45) NULL,
  `recurring` CHAR(1) NOT NULL DEFAULT 'N',
  `recurring_type` VARCHAR(45) NULL,
  `active` INT(1) NOT NULL DEFAULT 1,
  `start_date` DATE NULL,
  `end_date` DATE NULL,
  `school_id` INT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `fees` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `transactions`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `transactions` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `transactions` (
  `id` INT NOT NULL,
  `family_id` INT NOT NULL,
  `amount` DECIMAL(10,2) NOT NULL,
  `fee_name` VARCHAR(45) NULL,
  `transaction_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `description` VARCHAR(45) NULL,
  `payment_method` VARCHAR(45) NULL COMMENT 'CASH or CHECK or DEBIT_CARD',
  `ref_id` VARCHAR(45) NULL,
  `transaction_status` VARCHAR(100) NULL COMMENT 'Values are: \'COMPLETED\', \'PENDING\', \'FAILED\'',
  `tx_type` VARCHAR(45) NULL COMMENT 'Values are \'AUTOMATIC\' or \'MANUAL\'',
  `school_id` INT NOT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `student_fees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_fees` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `student_fees` (
  `student_id` INT NOT NULL,
  `fee_id` INT NULL,
  `due_year` INT(4) NULL,
  `family_id` INT NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `student_fees` (`student_id` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx1` ON `student_fees` (`fee_id` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx2` ON `student_fees` (`family_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `attendance_codes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `attendance_codes` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `attendance_codes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `attendance_code` CHAR(4) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `school_id` INT NOT NULL COMMENT 'Codes can be one of: Absent, Tardy, Present',
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `attendance_codes` (`school_id` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `student_attendance`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_attendance` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `student_attendance` (
  `student_id` INT NOT NULL,
  `attendance_id` INT NOT NULL,
  `date` DATE NOT NULL,
  `period` VARCHAR(45) NULL COMMENT 'ALLDAY, PERIOD1, PERIOD2, PERIOD3',
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_by` VARCHAR(45) NULL)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `id_idx` ON `student_attendance` (`student_id` ASC);

SHOW WARNINGS;
CREATE INDEX `id_idx1` ON `student_attendance` (`attendance_id` ASC);

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
