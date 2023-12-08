-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2023 at 03:22 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `app-login-register-android`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `categorieId` int(12) NOT NULL,
  `categorieName` varchar(255) NOT NULL,
  `categorieDesc` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`categorieId`, `categorieName`, `categorieDesc`) VALUES
(1, 'Masakan Khas Indonesia', 'Menyenangkan bagi pecinta makanan! Pilih dari beragam makanan lezat kami'),
(2, 'Minuman Khas Indonesia', 'Pilih minuman favorit Anda'),
(3, 'Sambal Indonesia', 'Meningkatkan pengalaman rasa secara keseluruhan dengan profilnya yang berani dan pedas.'),
(4, 'Jajanan Khas Indonesia', 'Hadir dalam beragam warna, tekstur, dan rasa, menawarkan beragam pilihan untuk eksplorasi kuliner.'),
(5, 'Jamu Tradisional', 'Kombinasi berbagai bahan alami, seperti akar, herba, rempah-rempah, dan buah-buahan, untuk mengatasi berbagai masalah kesehatan.'),
(6, 'Sayur Khas Indonesia', 'Menawarkan perpaduan unik antara rasa dan tekstur yang mencerminkan keragaman budaya dan pertanian negara ini.');

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `id_contact` int(11) NOT NULL,
  `email` varchar(35) NOT NULL,
  `orderId` int(10) NOT NULL,
  `phone` int(13) NOT NULL,
  `password` varchar(35) NOT NULL,
  `chat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`id_contact`, `email`, `orderId`, `phone`, `password`, `chat`) VALUES
(1, 'hakim@gmail.com', 3, 83443534, '202cb962ac59075b964b07152d234b70', 'halo'),
(2, '1', 123, 0, '239bda67650c73ddeb39906e8d9900b0', '812345678'),
(18, '1', 123, 0, '42f228478fcd382bf244f39009eb62d9', '2147483647'),
(20, 'hakim@gmail.com', 3, 83443534, 'd81f9c1be2e08964bf9f24b15f0e4900', 'halo'),
(21, '1', 123, 0, '239bda67650c73ddeb39906e8d9900b0', '812345678'),
(22, '1', 123, 0, '239bda67650c73ddeb39906e8d9900b0', '081629362'),
(23, 'gakabs', 4, 1736917293, '202cb962ac59075b964b07152d234b70', 'yok cobak teros'),
(24, 'hakim@gmail.com', 1, 812345678, '202cb962ac59075b964b07152d234b70', 'tes');

-- --------------------------------------------------------

--
-- Table structure for table `favorite`
--

CREATE TABLE `favorite` (
  `id_fav` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` int(10) NOT NULL,
  `gambar_url` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `favorite`
--

INSERT INTO `favorite` (`id_fav`, `name`, `price`, `gambar_url`) VALUES
(1, 'Bakso', 10000, 'https://cdns.klimg.com/merdeka.com/i/w/news/2020/03/11/1155066/540x270/8-cara-membuat-kuah-bakso-beragam-variasi-enak-dan-praktis.jpg'),
(2, 'Mie Ayam', 12000, 'https://awsimages.detik.net.id/community/media/visual/2022/10/12/resep-mie-ayam-kecap_43.jpeg'),
(3, 'Nasi Goreng', 9000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbQwpF_Fvl5BGbqccIrFxuUP4fM9GZ23h7PQ&usqp=CAU'),
(4, 'Nasi Padang', 10000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReaqbOcM7EoJ11ZV9jfbin_cxEnj0p6mGFgw&usqp=CAU'),
(5, 'Nasi Rawon', 15000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVJUV23COONglROI2o2qihntxy7lsKXwfQw&usqp=CAU');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `foodId` int(12) NOT NULL,
  `foodName` varchar(255) NOT NULL,
  `foodPrice` int(12) NOT NULL,
  `foodDesc` text NOT NULL,
  `foodCategorieId` int(12) NOT NULL,
  `gambar_url` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`foodId`, `foodName`, `foodPrice`, `foodDesc`, `foodCategorieId`, `gambar_url`) VALUES
(1, 'Nasi Goreng', 25000, 'Nasi yang digoreng dalam minyak dan dicampur dengan bumbu, seperti kecap manis, bawang, bawang putih, dan daging atau seafood', 1, ''),
(2, 'Rendang', 65000, 'Masakan daging yang dimasak dalam santan dan rempah-rempah hingga kuah menyusut, menghasilkan daging yang kaya rasa', 1, ''),
(3, 'Sate Ayam', 45000, 'Potongan daging ayam yang ditusuk pada tusukan bambu atau sate, kemudian dipanggang dan disajikan dengan saus kacang', 1, ''),
(4, 'Gado-gado', 25000, 'Salad sayur-sayuran dengan tahu, tempe, telur, dan lontong, disajikan dengan saus kacang.', 1, ''),
(5, 'Soto Ayam', 45000, 'Sup ayam dengan kuah kaldu yang kaya rasa, disajikan dengan mie, telur, tauge, dan daun bawang.', 1, ''),
(6, 'Ikan Bakar', 70000, 'Ikan yang dibumbui dan dipanggang, sering disajikan dengan sambal dan nasi.', 1, ''),
(7, 'Sop Buntut', 55000, 'Sup dengan buntut sapi sebagai bahan utamanya, dimasak dengan berbagai rempah-rempah.', 1, ''),
(8, 'Ayam Goreng', 25000, 'Ayam yang digoreng kering dengan bumbu rempah, biasanya disajikan dengan nasi.', 1, ''),
(9, 'Es Cendol', 15000, 'Minuman segar yang terbuat dari butiran tepung beras hijau yang disajikan dalam santan kelapa manis dengan es serut.', 2, ''),
(10, 'Wedang Jahe', 12000, 'Minuman jahe hangat yang diolah dengan menambahkan gula, daun pandan, dan seringkali tambahan rempah lain seperti kayu manis.', 2, ''),
(11, 'Bandrek', 15000, 'Minuman tradisional Sunda yang terbuat dari jahe, kelapa parut, gula merah, dan bubuk ketumbar.', 2, ''),
(12, 'Sekoteng', 10000, 'Minuman hangat yang terdiri dari campuran berbagai bahan seperti kacang hijau, kolang-kaling, biji salak, dan potongan roti.', 2, ''),
(13, 'Wedang Ronde', 319, 'Wedang ronde adalah minuman hangat yang terbuat dari bola ketan yang diisi pasta kacang hijau, disajikan dalam kuah jahe manis, seringkali dengan tambahan kelapa parut.', 2, ''),
(14, 'Es Dawet', 8500, 'Minuman dingin yang terbuat dari santan, air daun pandan, agar-agar hijau, dan biji selasih.', 2, ''),
(15, 'Es Teler', 8500, 'Minuman dingin yang terdiri dari potongan buah seperti kelapa muda, alpukat, dan nangka, yang disajikan dalam es serut dengan susu kental manis dan sirup kental.', 2, ''),
(16, 'Wedang Uwuh', 7500, 'Minuman hangat yang terbuat dari campuran daun jati, serai, jahe, daun pandan, dan kayu manis.', 2, ''),
(17, 'Sambal Terasi', 5000, 'Sambal ini dibuat dengan mencampurkan cabai, terasi, garam, dan bahan-bahan lainnya.', 3, ''),
(18, 'Sambal Bawang', 7000, 'Sambal ini menonjolkan cita rasa bawang yang kuat. Biasanya terdiri dari cabai, bawang merah, garam, dan minyak.', 3, ''),
(19, 'Sambal Tomat', 6500, 'Dibuat dari cabai dan tomat, memberikan kombinasi pedas dan asam yang segar.', 3, ''),
(20, 'Sambal Petis', 4500, 'Menggunakan petis (pasta udang hitam) sebagai bahan utama, memberikan rasa khas yang gurih.', 3, ''),
(21, 'Sambal Ijo', 10500, 'Terbuat dari cabai hijau, tomat hijau, dan bahan-bahan lainnya. Rasanya segar dan cocok untuk makanan laut.', 3, ''),
(22, 'Sambal Matah', 9500, 'Khas Bali, terdiri dari cabai rawit, bawang merah, serai, jeruk limo, dan minyak kelapa. Disajikan mentah.', 3, ''),
(23, 'Sambal Cobek', 9500, 'Dibuat dengan cara tradisional menggunakan cobek (ulekan). Biasanya terdiri dari cabai, terasi, dan garam.', 3, ''),
(24, 'Sambal Bakar', 10000, 'Sambal ini dibuat dengan cara dipanggang, memberikan rasa yang berbeda dan aroma khas panggangan.', 3, ''),
(25, 'Cireng', 10500, 'Makanan ringan berbentuk batang yang terbuat dari tepung tapioka.', 4, ''),
(26, 'Jagung Bakar', 7500, 'Jagung yang dipanggang dan diberi bumbu.', 4, ''),
(27, 'Klepon Bugis', 10500, 'Kue klepon yang berasal dari Sulawesi Selatan.', 4, ''),
(28, 'Asinan Betawi', 20000, 'Sayuran yang diiris tipis dan disajikan dengan saus kacang.', 4, ''),
(29, 'Kue Lapis', 15000, 'Kue tradisional yang terbuat dari tepung beras berlapis-lapis berwarna.', 4, ''),
(30, 'Siomay', 22000, 'Dimsum yang berisi ikan, udang, dan tahu yang disajikan dengan saus kacang.', 4, ''),
(31, 'Kerak Telor', 15000, 'Nasi goreng dengan telur dan kelapa parut yang di atasnya diberi bumbu.', 4, ''),
(32, 'Serabi', 7500, 'Kue dadar berbentuk bulat dengan isian kelapa parut.', 4, ''),
(33, 'Jamu Kunyit Asam', 17500, 'Terbuat dari kunyit dan asam jawa, membantu pencernaan, menyehatkan kulit, dan antioksidan.', 5, ''),
(34, 'Jamu Beras Kencur', 18500, 'Mengandung beras, kencur, dan jahe, meredakan flu, dan meningkatkan daya tahan tubuh.', 5, ''),
(35, 'Jamu Temulawak', 16500, 'Mengandung temulawak, madu, dan air hangat. Detoksifikasi, meningkatkan metabolisme, dan menyehatkan liver.', 5, ''),
(36, 'Jamu Daun Sirih', 15000, 'Daun sirih ditumbuk dan dicampur dengan air.', 5, ''),
(37, 'Jamu Pahitan', 14000, 'Mengandung kunyit, temulawak, dan andaliman.', 5, ''),
(38, 'Jamu Bengkoang', 14500, 'Bengkoang, madu, dan air. Mencerahkan kulit, menyehatkan pencernaan, dan antioksidan.', 5, ''),
(39, 'Jamu Sirih Merah', 17500, 'Daun sirih merah dan air. Membersihkan darah, meredakan masuk angin, dan antioksidan.', 5, ''),
(40, 'Jamu Kencur Beras Merah', 16500, 'Kencur, beras merah, dan air. Meningkatkan energi, meredakan pegal-pegal, dan menyehatkan kulit.', 5, ''),
(41, 'Jamu Sereh', 18000, 'Sereh dan air hangat. Meredakan stres, meningkatkan daya tahan tubuh, dan menyegarkan pikiran.', 5, ''),
(42, 'Jamu Lengkuas', 18500, 'Lengkuas, madu, dan air.', 5, ''),
(43, 'Sayur Bening', 3000, 'Sayur Bening yang berisikan saturan berupa wortel kentang dan rempah rempah', 6, '');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` int(10) NOT NULL,
  `gambar_url` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id_menu`, `name`, `price`, `gambar_url`) VALUES
(1, 'Beras Kencur', 3000, 'https://asset.kompas.com/crops/eJ2KRSLFSPr-kbSRaKoE-samJW8=/0x279:841x839/750x500/data/photo/2021/10/16/616a392f74672.jpeg'),
(2, 'Kunyit Asam', 3000, 'https://asset.kompas.com/crops/T1JuxEAJY2kQk00BovNxREoLSfY=/87x26:915x578/750x500/data/photo/2022/03/13/622deacb7b22e.jpg'),
(3, 'Temulawak', 3000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQfolJ9XTJOvaODRJJsuLqf8OhRTivfpS07A&usqp=CAU'),
(4, 'Bakso', 10000, 'https://cdns.klimg.com/merdeka.com/i/w/news/2020/03/11/1155066/540x270/8-cara-membuat-kuah-bakso-beragam-variasi-enak-dan-praktis.jpg'),
(5, 'Mie Ayam', 12000, 'https://awsimages.detik.net.id/community/media/visual/2022/10/12/resep-mie-ayam-kecap_43.jpeg'),
(6, 'Nasi Goreng', 9000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbQwpF_Fvl5BGbqccIrFxuUP4fM9GZ23h7PQ&usqp=CAU'),
(7, 'Nasi Padang', 10000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReaqbOcM7EoJ11ZV9jfbin_cxEnj0p6mGFgw&usqp=CAU'),
(8, 'Jahe', 3000, 'https://www.madaninews.id/wp-content/uploads/2019/09/temulawak-manfaat-640x400.jpg'),
(9, 'Es Teh', 3000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1mq6s0jFjA-o36DM4yM69iwQM4D79lBJV9A&usqp=CAU'),
(10, 'Kopi Hitam', 5000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmibQPudl_JDTuIV5N7eLkrhlkQLCLPHwAkw&usqp=CAU'),
(11, 'Nasi Rawon', 15000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVJUV23COONglROI2o2qihntxy7lsKXwfQw&usqp=CAU'),
(12, 'Pahitan', 3000, 'https://www.madaninews.id/wp-content/uploads/2019/09/article_358-681x358.jpg'),
(13, 'Galian Singset', 3000, 'https://www.madaninews.id/wp-content/uploads/2019/09/bunda-ini-cara-bikin-jamu-galian-singset-yang-bikin-sehat-iUM.jpg'),
(14, 'Es Jeruk', 4000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8eKkTnUJk28jowCn5GrRWUEM48Q16tarXnw&usqp=CAU'),
(15, 'Es Degan', 5000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4gzxLQ4lCV-W15snh_-4qksKpNB2B4Nj2XA&usqp=CAU'),
(16, 'Es Dawet', 6000, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8oURSsL0XS6WHSCFUsOJZ6UQPNjHMZUPOdQ&usqp=CAU'),
(17, 'Sambal Terasi', 2000, 'https://asset.kompas.com/crops/PBUEFI5RBdK3gY6RGynmQ4WlS2Q=/0x0:1000x667/750x500/data/photo/2020/10/04/5f794f9ee502d.jpg'),
(18, 'Sambal Dabu-Dabu', 2000, 'https://asset.kompas.com/crops/EUQ9YL0J4L24u36BO81mqBdoFAw=/0x0:1000x667/750x500/data/photo/2020/11/03/5fa0cb244c83f.jpg'),
(19, 'Sambal Matah', 2000, 'https://asset.kompas.com/crops/DKz3ia0kTEncvmN-yvvb1uXk47o=/0x610:1500x1610/750x500/data/photo/2019/07/05/2490389343.jpg'),
(20, 'Sambal Ijo', 2000, 'https://asset.kompas.com/crops/i8XPicsLEUrsaUTQpb62FK7kU_g=/0x0:1000x667/750x500/data/photo/2020/08/24/5f431f6307111.jpg'),
(21, 'Sambal Andaliman', 2000, 'https://asset.kompas.com/crops/cifCt6YxaXvr-zTA13ivbh7_510=/0x0:1000x667/750x500/data/photo/2020/07/14/5f0d78239303b.jpg'),
(22, 'Sambal Tumpang', 2000, 'https://asset.kompas.com/crops/v7z242-28nnAkviWHUIFQKWi_Lk=/0x36:1000x703/750x500/data/photo/2020/08/04/5f29594a93088.jpg'),
(23, 'Sayur Daun Labu Kuning', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/11/01/resep-sayur-daun-labu-rebon-saj-20221101055726.jpg'),
(24, 'Sayur Daun Labu Teri', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/12/27/resep-sayur-daun-labu-teri-menu-20221227012249.jpg'),
(25, 'Sayur Asem Kacang Merah', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/12/29/resep-sayur-asam-kacang-merah-s-20221229020556.jpg'),
(26, 'Sayur Kangkung Kuah Santan', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/11/23/resep-sayur-kangkung-santan-men-20221123064127.jpg'),
(27, 'Sayur Asem Kuah Kuning', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2021/03/23/resep-sayur-asem-kuah-kuning-me-20210323063031.jpg'),
(28, 'Sup Buncis Sayap', 5000, 'https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2021/03/23/resep-sop-buncis-sayap-hidangan-20210323083711.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(13) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `name`, `email`, `phone`, `password`) VALUES
(1, 'ramdan', 'ramdan', 'ramdhan@gmail.com', 854433635, '202cb962ac59075b964b07152d234b70'),
(2, 'hakim', 'hakim', 'hakim@gmail.com', 812345678, '202cb962ac59075b964b07152d234b70'),
(3, 'micel', 'micel', 'micel@gmail.com', 8124252, '202cb962ac59075b964b07152d234b70'),
(4, 'saya', 'mencoba', 'mencoba@gmail.com', 2147483647, '202cb962ac59075b964b07152d234b70'),
(5, 'mariadi', 'madri', 'madri@gmial.com', 81233442, '202cb962ac59075b964b07152d234b70');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`categorieId`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id_contact`);

--
-- Indexes for table `favorite`
--
ALTER TABLE `favorite`
  ADD PRIMARY KEY (`id_fav`);

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`foodId`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `id_contact` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
