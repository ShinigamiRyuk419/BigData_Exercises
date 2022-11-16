-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2022 at 05:37 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bernadez_hims`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashier_transactions`
--

CREATE TABLE `cashier_transactions` (
  `CTransactionID` int(64) NOT NULL,
  `InventoryID` int(64) NOT NULL,
  `UserID` int(64) NOT NULL,
  `SalesID` int(32) NOT NULL,
  `Date` varchar(32) NOT NULL,
  `Time` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashier_transactions`
--

INSERT INTO `cashier_transactions` (`CTransactionID`, `InventoryID`, `UserID`, `SalesID`, `Date`, `Time`) VALUES
(1, 8, 2, 42, '30-05-2022', '8:45:07 AM'),
(15, 1, 2, 43, '30-05-2022', '03:49:33 AM'),
(16, 23, 3, 44, '30-05-2022', '08:31:49 AM'),
(17, 1, 3, 45, '30-05-2022', '08:34:57 AM'),
(18, 1, 3, 46, '01-06-2022', '11:13:01 AM');

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `Cat_ID` int(32) NOT NULL,
  `CategoryName` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`Cat_ID`, `CategoryName`) VALUES
(1, 'Anti-virus'),
(2, 'Storage Devices'),
(3, 'Peripheral Devices'),
(4, 'Motherboards'),
(5, 'Graphics'),
(6, 'Cables');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `InventoryID` int(64) NOT NULL,
  `ProductName` varchar(32) NOT NULL,
  `Specification` varchar(64) NOT NULL,
  `BuyingPrice` double NOT NULL,
  `SellingPrice` double NOT NULL,
  `Item_Quantity` double NOT NULL,
  `Revenue` double NOT NULL,
  `Category` varchar(32) NOT NULL COMMENT 'Storage Devices, Memory, Peripheral Device',
  `Cur_Stat` varchar(16) NOT NULL COMMENT 'Eabled/Disablel'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`InventoryID`, `ProductName`, `Specification`, `BuyingPrice`, `SellingPrice`, `Item_Quantity`, `Revenue`, `Category`, `Cur_Stat`) VALUES
(1, 'Flash Drive', 'Kingston, 32 GB', 150.5, 199, 49, 9950, 'Storage Devices', 'Enabled'),
(2, 'Bytefence', 'Anti-Virus, Premium', 850, 999, 48, 49950, 'Anti-virus', 'Enabled'),
(3, 'Dell Keyboard', 'Dell, Model: SK-1185', 246, 294, 14, 4116, 'Peripheral Devices', 'Enabled'),
(4, 'Avast', 'premium use', 250, 270, 25, 6750, 'Anti-virus', 'Enabled'),
(5, 'Headphones', 'Logitech', 250, 270, 0, 0, 'Peripheral Devices', 'Disabled'),
(6, 'Avast', 'life time use', 156, 170, 0, 0, 'Anti-virus', 'Enabled'),
(7, 'Monitor', '14 inches', 2500, 3000, 17, 15000, 'Peripheral Devices', 'Enabled'),
(8, 'External Drive', 'Seagate, 250GB', 652, 700, 14, 10500, 'Storage Devices', ''),
(9, 'Graphics Card', 'Fitslim GTX750', 1612, 1700, 25, 42500, 'Graphics', ''),
(10, 'Video Card', 'NVIDIA, 8GB', 1610, 1700, 24, 42500, 'Graphics', ''),
(11, 'Solid State Drive', '250 GB , Seagate', 350, 400, 0, 0, 'Anti-virus', ''),
(12, 'Sata Cable', 'Red', 150, 165, 13, 2475, 'Cables', ''),
(13, 'Avira', 'premium use', 450, 500, 45, 22500, 'Anti-virus', ''),
(14, 'Webcam', 'logitech', 510, 550, 46, 25300, 'Peripheral Devices', ''),
(15, 'VGA', '1 meter', 235, 250, 47, 12500, 'Cables', ''),
(16, 'HDMI cable', '5 meter', 463, 523, 42, 27719, 'Cables', ''),
(17, 'keyboard', 'Dell', 90, 90, 29, 270, 'Peripheral Devices', 'Enabled'),
(18, 'ilaga', 'dagko na', 43, 43, 34, 1462, 'Anti-virus', ''),
(19, 'hadi', 'gwapo nasad', 76, 80, 50, 0, 'Graphics', 'Enabled'),
(20, 'speaker', 'kusog kaayo', 532, 560, 0, 0, 'Anti-virus', 'Disabled'),
(21, 'AMD LGA755', 'nice', 2315, 2400, 16, 14400, 'Anti-virus', 'Enabled'),
(22, 'Ninyo', 'humana', 5, 10, 39, 450, 'Graphics', 'Enabled'),
(23, 'Kaspersky', 'premium use', 1400, 1500, 18, 7500, 'Anti-virus', 'Enabled'),
(24, 'jomel', 'kulot', 5, 10, 13, 200, 'Anti-virus', 'Enabled');

-- --------------------------------------------------------

--
-- Table structure for table `inventory_staff_transactions`
--

CREATE TABLE `inventory_staff_transactions` (
  `StransactionID` int(64) NOT NULL,
  `InventoryID` int(64) NOT NULL,
  `TypeOfTransaction` varchar(32) NOT NULL COMMENT 'add, edit,disable/enable',
  `UserID` int(64) NOT NULL,
  `Date` varchar(64) NOT NULL COMMENT ' 20022-05-11',
  `Time` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory_staff_transactions`
--

INSERT INTO `inventory_staff_transactions` (`StransactionID`, `InventoryID`, `TypeOfTransaction`, `UserID`, `Date`, `Time`) VALUES
(1, 1, 'Added a new item', 16, '23-05-2022', '8:45:07 AM'),
(2, 21, 'Added a new item', 16, '23-05-2022', '11:36:05 PM'),
(28, 5, 'Updated this item', 16, '26-05-2022', '07:27:55 AM'),
(29, 19, 'Updated this item', 4, '30-05-2022', '08:27:01 AM'),
(30, 19, 'Enabled this item', 4, '30-05-2022', '08:28:25 AM'),
(31, 1, 'Updated this item', 16, '30-05-2022', '09:19:11 AM'),
(32, 20, 'Updated this item', 16, '30-05-2022', '09:19:48 AM');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `SalesID` int(32) NOT NULL,
  `InventoryID` int(32) NOT NULL,
  `ItemName` varchar(32) NOT NULL,
  `Price` double NOT NULL,
  `Purchase_Quan` int(32) NOT NULL,
  `Total_Cost` double NOT NULL,
  `UserID` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`SalesID`, `InventoryID`, `ItemName`, `Price`, `Purchase_Quan`, `Total_Cost`, `UserID`) VALUES
(42, 8, 'External Drive', 700, 1, 700, 2),
(43, 1, 'Flash Drive', 199, 1, 199, 2),
(44, 23, 'Kaspersky', 1500, 2, 3000, 3),
(45, 1, 'Flash Drive', 199, 1, 199, 3),
(46, 1, 'Flash Drive', 199, 1, 199, 3);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(64) NOT NULL,
  `FirstName` varchar(32) NOT NULL,
  `LastName` varchar(32) NOT NULL,
  `Email` varchar(32) NOT NULL,
  `Password` varchar(32) NOT NULL,
  `Role` varchar(16) NOT NULL COMMENT 'admin, Inventory Staff, Cashier',
  `Permission` varchar(32) DEFAULT NULL COMMENT 'enable/disable',
  `Status` varchar(16) NOT NULL COMMENT 'Active, Inactive',
  `Gender` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `Role`, `Permission`, `Status`, `Gender`) VALUES
(1, 'Jo', 'Ann', 'jo@gmail.com', '1234', 'Admin', 'Enable', 'Active', 'Female'),
(2, 'lorgem', 'bosque', 'gem@gmail.com', '1234', 'Cashier', 'Enable', 'Active', 'Male'),
(3, 'Jo', 'Vanie', 'vanie@gmail.com', '1234', 'Cashier', 'Enable', 'Active', 'Male'),
(4, 'Richel', 'Jane', 'rich@gmail.com', '1234', 'Inventory Staff', 'Enable', 'Active', 'Female'),
(8, 'Jan', 'Baoc', 'jan@gmail.com', '1234', 'Inventory Staff', 'Enable', 'Active', 'Male'),
(16, 'Ryuk', 'Apple', 'ryuk@gmail.com', '1234', 'Inventory Staff', 'Enable', 'Active', 'Male'),
(18, 'kevin', 'Campanilla', 'kevin@gmail.com', '123', 'Inventory Staff', 'Disable', 'Active', 'Male'),
(23, 'three', 'three', 'three@gmail.com', 'three', 'Cashier', 'Enable', 'Active', 'Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashier_transactions`
--
ALTER TABLE `cashier_transactions`
  ADD PRIMARY KEY (`CTransactionID`),
  ADD KEY `InventoryID` (`InventoryID`),
  ADD KEY `UserID` (`UserID`),
  ADD KEY `SalesID` (`SalesID`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`Cat_ID`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`InventoryID`);

--
-- Indexes for table `inventory_staff_transactions`
--
ALTER TABLE `inventory_staff_transactions`
  ADD PRIMARY KEY (`StransactionID`),
  ADD KEY `InventoryID` (`InventoryID`),
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`SalesID`),
  ADD KEY `InventoryID` (`InventoryID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashier_transactions`
--
ALTER TABLE `cashier_transactions`
  MODIFY `CTransactionID` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `Cat_ID` int(32) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `InventoryID` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `inventory_staff_transactions`
--
ALTER TABLE `inventory_staff_transactions`
  MODIFY `StransactionID` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `SalesID` int(32) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cashier_transactions`
--
ALTER TABLE `cashier_transactions`
  ADD CONSTRAINT `cashier_transactions_ibfk_1` FOREIGN KEY (`InventoryID`) REFERENCES `inventory` (`InventoryID`),
  ADD CONSTRAINT `cashier_transactions_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `users` (`UserID`),
  ADD CONSTRAINT `cashier_transactions_ibfk_3` FOREIGN KEY (`SalesID`) REFERENCES `sales` (`SalesID`);

--
-- Constraints for table `inventory_staff_transactions`
--
ALTER TABLE `inventory_staff_transactions`
  ADD CONSTRAINT `inventory_staff_transactions_ibfk_1` FOREIGN KEY (`InventoryID`) REFERENCES `inventory` (`InventoryID`),
  ADD CONSTRAINT `inventory_staff_transactions_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `users` (`UserID`);

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`InventoryID`) REFERENCES `inventory` (`InventoryID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
