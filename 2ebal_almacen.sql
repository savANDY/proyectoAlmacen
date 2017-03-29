-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-03-2017 a las 13:26:07
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `id` int(5) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `proveedor` varchar(38) DEFAULT NULL,
  `precio` decimal(5,2) DEFAULT NULL,
  `existencias` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`id`, `nombre`, `proveedor`, `precio`, `existencias`) VALUES
(1, 'Té Dharamsala', 'Exotic Liquids', '18.00', 39),
(2, 'Cerveza tibetana Barley', 'Exotic Liquids', '19.00', 17),
(3, 'Sirope de regaliz', 'Exotic Liquids', '10.00', 13),
(4, 'Especias Cajun del chef Anton', 'New Orleans Cajun Delights', '22.00', 53),
(5, 'Mezcla Gumbo del chef Anton', 'New Orleans Cajun Delights', '21.35', 0),
(6, 'Mermelada de grosellas de la abuela', 'Grandma Kelly''s Homestead', '25.00', 120),
(7, 'Peras secas orgánicas del tío Bob', 'Grandma Kelly''s Homestead', '30.00', 15),
(8, 'Salsa de arándanos Northwoods', 'Grandma Kelly''s Homestead', '40.00', 6),
(9, 'Buey Mishi Kobe', 'Tokyo Traders', '97.00', 29),
(10, 'Pez espada', 'Tokyo Traders', '31.00', 31),
(11, 'Queso Cabrales', 'Cooperativa de Quesos ''Las Cabras''', '21.00', 22),
(12, 'Queso Manchego La Pastora', 'Cooperativa de Quesos ''Las Cabras''', '38.00', 86),
(13, 'Algas Konbu', 'Mayumi''s', '6.00', 24),
(14, 'Cuajada de judías', 'Mayumi''s', '23.25', 35),
(15, 'Salsa de soja baja en sodio', 'Mayumi''s', '15.50', 39),
(16, 'Postre de merengue Pavlova', 'Pavlova, Ltd.', '17.45', 29),
(17, 'Cordero Alice Springs', 'Pavlova, Ltd.', '39.00', 0),
(18, 'Langostinos tigre Carnarvon', 'Pavlova, Ltd.', '62.50', 42),
(19, 'Pastas de té de chocolate', 'Specialty Biscuits, Ltd.', '9.20', 25),
(20, 'Mermelada de Sir Rodney''s', 'Specialty Biscuits, Ltd.', '81.00', 40),
(21, 'Bollos de Sir Rodney''s', 'Specialty Biscuits, Ltd.', '10.00', 3),
(22, 'Pan de centeno crujiente estilo Gustaf''s', 'PB Knäckebröd AB', '21.00', 104),
(23, 'Pan fino', 'PB Knäckebröd AB', '9.00', 61),
(24, 'Refresco Guaraná Fantástica', 'Refrescos Americanas LTDA', '4.50', 20),
(25, 'Crema de chocolate y nueces NuNuCa', 'Heli Süßwaren GmbH & Co. KG', '14.00', 76),
(26, 'Ositos de goma Gumbär', 'Heli Süßwaren GmbH & Co. KG', '31.23', 15),
(27, 'Chocolate Schoggi', 'Heli Süßwaren GmbH & Co. KG', '43.90', 49),
(28, 'Col fermentada Rössle', 'Plutzer Lebensmittelgroßmärkte AG', '45.60', 26),
(29, 'Salchicha Thüringer', 'Plutzer Lebensmittelgroßmärkte AG', '123.79', 0),
(30, 'Arenque blanco del noroeste', 'Nord-Ost-Fisch Handelsgesellschaft mbH', '25.89', 10),
(31, 'Queso gorgonzola Telino', 'Formaggi Fortini s.r.l.', '12.50', 0),
(32, 'Queso Mascarpone Fabioli', 'Formaggi Fortini s.r.l.', '32.00', 9),
(33, 'Queso de cabra', 'Norske Meierier', '2.50', 112),
(34, 'Cerveza Sasquatch', 'Bigfoot Breweries', '14.00', 111),
(35, 'Cerveza negra Steeleye', 'Bigfoot Breweries', '18.00', 20),
(36, 'Escabeche de arenque', 'Svensk Sjöföda AB', '19.00', 112),
(37, 'Salmón ahumado Gravad', 'Svensk Sjöföda AB', '26.00', 11),
(38, 'Vino Côte de Blaye', 'Aux joyeux ecclésiastiques', '263.50', 17),
(39, 'Licor verde Chartreuse', 'Aux joyeux ecclésiastiques', '18.00', 69),
(40, 'Carne de cangrejo de Boston', 'New England Seafood Cannery', '18.40', 123),
(41, 'Crema de almejas estilo Nueva Inglaterra', 'New England Seafood Cannery', '9.65', 85),
(42, 'Tallarines de Singapur', 'Leka Trading', '14.00', 26),
(43, 'Café de Malasia', 'Leka Trading', '46.00', 17),
(44, 'Azúcar negra Malacca', 'Leka Trading', '19.45', 27),
(45, 'Arenque ahumado', 'Lyngbysild', '9.50', 5),
(46, 'Arenque salado', 'Lyngbysild', '12.00', 95),
(47, 'Galletas Zaanse', 'Zaanse Snoepfabriek', '9.50', 36),
(48, 'Chocolate holandés', 'Zaanse Snoepfabriek', '12.75', 15),
(49, 'Regaliz', 'Karkki Oy', '20.00', 10),
(50, 'Chocolate blanco', 'Karkki Oy', '16.25', 65),
(51, 'Manzanas secas Manjimup', 'G''day, Mate', '53.00', 20),
(52, 'Cereales para Filo', 'G''day, Mate', '7.00', 38),
(53, 'Empanada de carne', 'G''day, Mate', '32.80', 0),
(54, 'Empanada de cerdo', 'Ma Maison', '7.45', 21),
(55, 'Paté chino', 'Ma Maison', '24.00', 115),
(56, 'Gnocchi de la abuela Alicia', 'Pasta Buttini s.r.l.', '38.00', 21),
(57, 'Raviolis Angelo', 'Pasta Buttini s.r.l.', '19.50', 36),
(58, 'Caracoles de Borgoña', 'Escargots Nouveaux', '13.25', 62),
(59, 'Raclet de queso Courdavault', 'Gai pâturage', '55.00', 79),
(60, 'Camembert Pierrot', 'Gai pâturage', '34.00', 19),
(61, 'Sirope de arce', 'Forêts d''érables', '28.50', 113),
(62, 'Tarta de azúcar', 'Forêts d''érables', '49.30', 17),
(63, 'Sandwich de vegetales', 'Pavlova, Ltd.', '43.90', 24),
(64, 'Bollos de pan de Wimmer', 'Plutzer Lebensmittelgroßmärkte AG', '33.25', 22),
(65, 'Salsa de pimiento picante de Luisiana', 'New Orleans Cajun Delights', '21.05', 76),
(66, 'Especias picantes de Luisiana', 'New Orleans Cajun Delights', '17.00', 4),
(67, 'Cerveza Laughing Lumberjack', 'Bigfoot Breweries', '14.00', 52),
(68, 'Barras de pan de Escocia', 'Specialty Biscuits, Ltd.', '12.50', 6),
(69, 'Queso Gudbrandsdals', 'Norske Meierier', '36.00', 26),
(70, 'Cerveza Outback', 'Pavlova, Ltd.', '15.00', 15),
(71, 'Crema de queso Fløtemys', 'Norske Meierier', '21.50', 26),
(72, 'Queso Mozzarella Giovanni', 'Formaggi Fortini s.r.l.', '34.80', 14),
(73, 'Caviar rojo', 'Svensk Sjöföda AB', '15.00', 101),
(74, 'Queso de soja Longlife', 'Tokyo Traders', '10.00', 4),
(75, 'Cerveza Klosterbier Rhönbräu', 'Plutzer Lebensmittelgroßmärkte AG', '7.75', 125),
(76, 'Licor Cloudberry', 'Karkki Oy', '18.00', 57),
(77, 'Salsa verde original Frankfurter', 'Plutzer Lebensmittelgroßmärkte AG', '13.00', 32);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
