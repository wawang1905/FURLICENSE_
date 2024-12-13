-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2024 at 03:42 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pet_license`
--

-- --------------------------------------------------------

--
-- Table structure for table `account_info`
--

CREATE TABLE `account_info` (
  `ID` int(11) NOT NULL,
  `First_name` varchar(50) NOT NULL,
  `Last_name` varchar(50) NOT NULL,
  `Birth_Date` varchar(200) DEFAULT NULL,
  `Contact_Number` varchar(50) DEFAULT NULL,
  `Baranggay` varchar(200) DEFAULT NULL,
  `City` varchar(200) DEFAULT NULL,
  `Province` varchar(200) DEFAULT NULL,
  `Account_Name` varchar(200) DEFAULT NULL,
  `Password` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account_info`
--

INSERT INTO `account_info` (`ID`, `First_name`, `Last_name`, `Birth_Date`, `Contact_Number`, `Baranggay`, `City`, `Province`, `Account_Name`, `Password`) VALUES
(856001, 'Jp', 'Pechares', '19', '09123867923', 'Sioan', 'Gingoog', 'Misamis oriental', 'jppech', '1234567'),
(856002, 'Joshua', 'Agusan', '19', '090909990', 'Patrocenio', 'Claveria', 'Misamis oriental', 'wawang', '1234567'),
(856003, 'Julianna', 'Alasan', '04/04/2005', '09919240250', 'Magsaysay', 'Magsaysay', 'Misamis oriental', 'yana', '1234567'),
(856004, 'Joshua', 'Agusan', '10/01/2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'wangskie', '1234567'),
(856005, 'Joshua', 'Agusan', '10/01/2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'wawangskie', '1234567'),
(856006, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test', '1234567'),
(856007, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'agusanjoshua', '1234567'),
(856008, 'J', 'K', 'December 18, 2024', '091111111111', 'Ds', 'Asd', 'Asd', 'asd', 'ds'),
(856009, 'Joshua', 'Agusan', 'December 6, 2024', '09', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test2', '1234567'),
(856010, 'Joshua', 'Agusan', 'December 5, 2024', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test3', '1234567'),
(856011, 'Joshua', 'Agusan', 'December 6, 2024', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test4', '1234567'),
(856012, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test5', '1234567'),
(856013, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test6', '1234567'),
(856014, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test7', '1234567'),
(856015, 'Jos', 'Ad', 'December 7, 2024', '09121678293', 'Ads', 'Asdasd', 'Asdas', 'test8', '1234567'),
(856016, 'Joshua', 'Agusan', 'October 1, 2005', '09919240250', 'Patrocenio', 'Claveria', 'Misamis oriental', 'test9', '1234567');

-- --------------------------------------------------------

--
-- Table structure for table `approved`
--

CREATE TABLE `approved` (
  `id` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Breed` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Birth_Month` varchar(50) DEFAULT NULL,
  `Birth_Date` varchar(50) DEFAULT NULL,
  `Birth_Year` varchar(50) DEFAULT NULL,
  `Pet_Weight` decimal(7,2) DEFAULT NULL,
  `Pet_Height` decimal(7,2) DEFAULT NULL,
  `Vaccine_Month` varchar(50) DEFAULT NULL,
  `Vaccine_Date` varchar(50) DEFAULT NULL,
  `Vaccine_Year` varchar(50) DEFAULT NULL,
  `Vaccine_Id` varchar(50) DEFAULT NULL,
  `Account` varchar(50) DEFAULT NULL,
  `Status` varchar(200) DEFAULT NULL,
  `Transaction_ID` int(11) NOT NULL,
  `State` varchar(50) DEFAULT 'VALID',
  `Claim_Status` varchar(50) DEFAULT 'NOT CLAIMED',
  `Approved_Date` varchar(200) DEFAULT NULL,
  `Valid_Until` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `approved`
--

INSERT INTO `approved` (`id`, `Name`, `Type`, `Breed`, `Gender`, `Birth_Month`, `Birth_Date`, `Birth_Year`, `Pet_Weight`, `Pet_Height`, `Vaccine_Month`, `Vaccine_Date`, `Vaccine_Year`, `Vaccine_Id`, `Account`, `Status`, `Transaction_ID`, `State`, `Claim_Status`, `Approved_Date`, `Valid_Until`) VALUES
(100001, 'Jonathan', 'Dog', 'Husky', 'Male', 'January', '12', '2023', 12.00, 40.00, 'January', '12', '2024', '123123123', 'jppech', 'APPROVED REGISTRATION', 765001, 'INVALID', 'CLAIMED', '12/7/2024', '12/7/2025'),
(100003, 'Julianna', 'Dog', 'Husky', 'Male', 'January', '12', '2022', 12.00, 23.00, 'January', '21', '2023', '122323', 'jppech', 'APPROVED REGISTRATION', 765002, 'INVALID', 'NOT CLAIMED', '12/9/2024', '12/9/2025'),
(100005, 'As', 'Dog', 'Asdasd', 'Male', 'January', '1232', '1232', 123.00, 123.00, 'January', '123', '123', '12332', 'yana', 'APPROVED REGISTRATION', 765003, 'INVALID', 'NOT CLAIMED', '12/9/2024', '12/9/2025'),
(100006, 'Julie', 'Dog', 'Pitbull', 'Male', 'January', '12', '2023', 20.00, 32.00, 'February', '23', '2023', '12313123', 'test', 'APPROVED REGISTRATION', 765004, 'INVALID', 'NOT CLAIMED', '12/9/2024', '12/9/2025'),
(100007, 'Jonathan', 'Dog', 'Shitzu', 'Male', 'January', '12', '2023', 23.00, 20.00, 'January', '12', '2024', '123123123', 'test', 'APPROVED REGISTRATION', 765005, 'VALID', 'CLAIMED', '12/9/2024', '12/9/2025'),
(100008, 'Caps', 'Dog', 'Husky', 'Male', 'January', '23', '2023', 15.00, 20.00, 'January', '23', '2024', '1231323434', 'agusanjoshua', 'APPROVED REGISTRATION', 765006, 'INVALID', 'NOT CLAIMED', '12/10/2024', '12/10/2025'),
(100010, 'Jonathan', 'Dog', 'Husky', 'Male', 'January', '12', '2023', 67.00, 15.00, 'January', '6', '2024', '234242-747547-878', 'test9', 'APPROVED RENEWAL', 765008, 'VALID', 'NOT CLAIMED', '12/12/2024', '12/12/2025');

-- --------------------------------------------------------

--
-- Table structure for table `declined`
--

CREATE TABLE `declined` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Breed` varchar(255) DEFAULT NULL,
  `Gender` varchar(50) NOT NULL,
  `Birth_Month` varchar(50) DEFAULT NULL,
  `Birth_Date` int(11) DEFAULT NULL,
  `Birth_Year` int(11) DEFAULT NULL,
  `Pet_Weight` decimal(7,2) DEFAULT NULL,
  `Pet_Height` decimal(7,2) DEFAULT NULL,
  `Vaccine_Month` varchar(50) DEFAULT NULL,
  `Vaccine_Date` int(11) DEFAULT NULL,
  `Vaccine_Year` int(11) DEFAULT NULL,
  `Vaccine_Id` varchar(255) DEFAULT NULL,
  `Account` varchar(255) NOT NULL,
  `Status` varchar(50) DEFAULT 'Pending',
  `Request_Sent` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `declined`
--

INSERT INTO `declined` (`ID`, `Name`, `Type`, `Breed`, `Gender`, `Birth_Month`, `Birth_Date`, `Birth_Year`, `Pet_Weight`, `Pet_Height`, `Vaccine_Month`, `Vaccine_Date`, `Vaccine_Year`, `Vaccine_Id`, `Account`, `Status`, `Request_Sent`) VALUES
(100002, 'Jonathan', 'Dog', 'Husky', 'Male', 'January', 12, 2023, 123.00, 123.00, 'January', 123, 1232, '12323123', 'jppech', 'DECLINED REGISTRATION', '12/7/2024'),
(100004, 'Jul', 'Dog', 'Husky', 'Male', 'January', 12, 2022, 12.00, 32.00, 'January', 12, 2322, '12321331', 'yana', 'DECLINED REGISTRATION', '12/9/2024'),
(100009, 'Jed', 'Dog', 'Pitbull', 'Male', 'January', 23, 2023, 12.00, 20.00, 'January', 23, 2024, '123131231', 'agusanjoshua', 'DECLINED REGISTRATION', '12/10/2024'),
(100011, 'Jun', 'Dog', 'Pitbull', 'Male', 'January', 13, 2023, 15.00, 15.00, 'January', 13, 2024, '12312-123123-12312', 'test9', 'DECLINED REGISTRATION', '12/12/2024');

-- --------------------------------------------------------

--
-- Table structure for table `pet_info`
--

CREATE TABLE `pet_info` (
  `Pet_ID` int(11) NOT NULL,
  `Name` varchar(200) DEFAULT NULL,
  `Type` varchar(200) DEFAULT NULL,
  `Breed` varchar(200) DEFAULT NULL,
  `Gender` varchar(200) DEFAULT NULL,
  `Birth_Month` varchar(200) DEFAULT NULL,
  `Birth_Date` int(11) DEFAULT NULL,
  `Birth_Year` int(11) DEFAULT NULL,
  `Pet_Weight` decimal(7,2) DEFAULT NULL,
  `Pet_Height` decimal(7,2) DEFAULT NULL,
  `Vaccine_Month` varchar(200) DEFAULT NULL,
  `Vaccine_Date` int(11) DEFAULT NULL,
  `Vaccine_Year` int(11) DEFAULT NULL,
  `Vaccine_ID` varchar(200) DEFAULT NULL,
  `Account_Used` varchar(200) DEFAULT NULL,
  `Request_For` varchar(20) DEFAULT NULL,
  `Request_Sent` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account_info`
--
ALTER TABLE `account_info`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `approved`
--
ALTER TABLE `approved`
  ADD PRIMARY KEY (`Transaction_ID`);

--
-- Indexes for table `declined`
--
ALTER TABLE `declined`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pet_info`
--
ALTER TABLE `pet_info`
  ADD PRIMARY KEY (`Pet_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account_info`
--
ALTER TABLE `account_info`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=856017;

--
-- AUTO_INCREMENT for table `approved`
--
ALTER TABLE `approved`
  MODIFY `Transaction_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=765009;

--
-- AUTO_INCREMENT for table `pet_info`
--
ALTER TABLE `pet_info`
  MODIFY `Pet_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100012;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
