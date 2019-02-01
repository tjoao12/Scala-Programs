-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2018 at 01:58 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `amount` int(11) NOT NULL,
  `dated` date NOT NULL,
  `Acno` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`amount`, `dated`, `Acno`) VALUES
(151, '2018-11-22', 26),
(500, '2018-11-22', 26),
(100, '2018-11-23', 27),
(100, '2018-11-23', 27),
(27, '2018-11-23', 27),
(100, '2018-11-23', 27),
(100, '2018-11-23', 27),
(200, '2018-11-23', 32),
(300, '2018-11-23', 33),
(300, '2018-11-23', 34),
(100, '2018-11-23', 34),
(20, '2018-11-23', 36);

-- --------------------------------------------------------

--
-- Table structure for table `personal`
--

CREATE TABLE `personal` (
  `Acno` int(2) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal`
--

INSERT INTO `personal` (`Acno`, `Name`, `Address`) VALUES
(1, 'Smith', 'London'),
(31, 'sam ', 'london'),
(32, 'shafeeq', 'london'),
(33, 'jj', 'manc'),
(34, 'richard', 'leeds'),
(35, 'kk', 'manc'),
(36, 'rachel', 'bury');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

CREATE TABLE `withdraw` (
  `amount` int(11) DEFAULT NULL,
  `Dated` date NOT NULL,
  `Acno` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`amount`, `Dated`, `Acno`) VALUES
(200, '2018-11-21', 0),
(1000, '2018-11-21', 0),
(20, '2018-11-22', 0),
(10, '2018-11-22', 0),
(500, '2018-11-22', 26),
(26, '2018-11-22', 500),
(500, '2018-11-22', 20),
(200, '2018-11-23', 33),
(200, '2018-11-23', 34),
(10, '2018-11-23', 36);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`Acno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `personal`
--
ALTER TABLE `personal`
  MODIFY `Acno` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;