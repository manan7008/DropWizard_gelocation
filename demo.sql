-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2021 at 08:15 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `demo`
--

-- --------------------------------------------------------

--
-- Table structure for table `geolocation`
--

CREATE TABLE `geolocation` (
  `id` int(10) UNSIGNED NOT NULL,
  `status` varchar(30) DEFAULT NULL,
  `message` varchar(30) DEFAULT NULL,
  `continent` varchar(30) DEFAULT NULL,
  `continentCode` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `countryCode` varchar(30) DEFAULT NULL,
  `region` varchar(30) DEFAULT NULL,
  `regionName` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `zip` varchar(30) DEFAULT NULL,
  `lat` varchar(30) DEFAULT NULL,
  `lon` varchar(30) DEFAULT NULL,
  `timezone` varchar(30) DEFAULT NULL,
  `offset` varchar(30) DEFAULT NULL,
  `currency` varchar(30) DEFAULT NULL,
  `isp` varchar(30) DEFAULT NULL,
  `org` varchar(30) DEFAULT NULL,
  `ascode` varchar(30) DEFAULT NULL,
  `asname` varchar(30) DEFAULT NULL,
  `reverse` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `proxy` varchar(30) DEFAULT NULL,
  `hosting` varchar(30) DEFAULT NULL,
  `query` varchar(30) DEFAULT NULL,
  `tiemstamp` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `geolocation`
--

INSERT INTO `geolocation` (`id`, `status`, `message`, `continent`, `continentCode`, `country`, `countryCode`, `region`, `regionName`, `city`, `district`, `zip`, `lat`, `lon`, `timezone`, `offset`, `currency`, `isp`, `org`, `ascode`, `asname`, `reverse`, `mobile`, `proxy`, `hosting`, `query`, `tiemstamp`) VALUES
(33, 'status2', 'message', 'continent', 'continent code', 'country', 'country code', 'region', 'region name', 'city', 'district', 'zip', 'lat', 'lon', 'timezone', 'offset', 'currency', 'isp', 'org', 'ascode', 'asname', 'reverse', 'mobile', 'proxy', 'hosting', 'query', '2021-01-28T10:42:11.774'),
(34, 'status3', 'message', 'continent', 'continent code', 'country_1', 'country code', 'region', 'region name', 'city', 'district', 'zip', 'lat', 'lon', 'timezone', 'offset', 'currency', 'isp', 'org', 'ascode', 'asname', 'reverse', 'mobile', 'proxy', 'hosting', '10.1.1.1', '2021-01-28T10:54:25.667'),
(35, 'status3', 'message', 'continent', 'continent code', 'country_1', 'country code', 'region', 'region name', 'city', 'district', 'zip', 'lat', 'lon', 'timezone', 'offset', 'currency', 'isp', 'org', 'ascode', 'asname', 'reverse', 'mobile', 'proxy', 'hosting', '10.1.1.1', '2021-01-28T11:01:25.441'),
(36, 'status3', 'message', 'continent', 'continent code', 'country_1', 'country code', 'region', 'region name', 'city', 'district', 'zip', 'lat', 'lon', 'timezone', 'offset', 'currency', 'isp', 'org', 'ascode', 'asname', 'reverse', 'mobile', 'proxy', 'hosting', '10.1.1.40', '2021-01-28T13:46:56.353');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `geolocation`
--
ALTER TABLE `geolocation`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `geolocation`
--
ALTER TABLE `geolocation`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
