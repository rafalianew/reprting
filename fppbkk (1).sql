-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2019 at 09:37 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fppbkk`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(14),
(14),
(14);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `id_restaurant` int(11) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_price` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `testusers`
--

CREATE TABLE `testusers` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tokens`
--

CREATE TABLE `tokens` (
  `id_token` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `expired_at` datetime DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `string_token` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tokens`
--

INSERT INTO `tokens` (`id_token`, `created_at`, `expired_at`, `id_user`, `string_token`) VALUES
(6, '2019-05-20 14:13:21', '2019-05-20 15:13:21', 1, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQ3VzdG9tZXIiLCJwaG9uZSI6IjEyMzQ1Njc4IiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ6aXphaCIsImV4cCI6MTU1ODM2NTIwMSwidXNlcmlkIjoxLCJlbWFpbCI6InVzZXJAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ6aXphaCJ9.RYC8XRorqm9tIP2b5Cj3BnE93VY0tSbmcC9yn0vQUt41jeH6JqS4CJUzEy1jtKaBu3gjtoHSFYwuuh8BjtUHFk1nOwp7XtZgfrCHsi2pUbozuFoB2qYmoXFcrTE5_WxJLuUHKzrTIHOYuEs0FfdvFqsagZpGEQvdNDU6WT01Xe313DikhrqaLyaS3XhwYkU87Mx7ulxLheVoQ220xXXylQCAy7kYDIoBM-OXJWGhMKmq9kcJv0O4iL13gKk_NXn0eFRN4GDeZSPQSje-9cBRiaXZh0NJ9SeebKwPiRuqbdAgvbb8dpcKxW4ppiq9tgK9x0nygHQ2-RbBoG4QKv6sMorKFX8W-XRCDa7tJtKcWIV-yj6rOfAecCKpjpNk1gsoMJsof9eoDKYJZeOr6zF3IjYSM_kg40R7FYXdSyizbyN9jydaq7fAFvaEJ2Unn1mxFGT5O1wlRv58B4eLoCCcwnSGBuu2ShNQm9viuWuJCnQxSDSRbhIftfXTQgWh5d7NSVtcoxPvwu7Bd62yxsJgJDmwpOpDHYxm7rLAzSnGSalPkjyjLhXsf-tJs7GWbWQLC7hIC3ZBMj_nagskBCpwIUEFyURYjAucwxB83br3_PHj5aa3ETgfYFkp80vUs40pm2TMsmCVPGgdMwQepvJlJWaKG5TDXFB0XfMW896mh2U'),
(7, '2019-05-20 14:16:01', '2019-05-20 15:16:00', 1, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQ3VzdG9tZXIiLCJwaG9uZSI6IjEyMzQ1Njc4IiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ6aXphaCIsImV4cCI6MTU1ODM2NTM2MCwidXNlcmlkIjoxLCJlbWFpbCI6InVzZXJAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ6aXphaCJ9.FUPtjrLJMpRJex-YDmObtHRVcNyg4qG8FGVuBf7gA2dwbDVbZCQSc3MEz24N8pVgK42bl31_J4g0f-rPo0agdFiVZXGXy-mq2hBoiLFSutGbN070ROfTfqNjIsHWKO-8mYRCKGrEBHaDcz4aqpkShObQHAw8TuSldcedJi59cuzTiLRpRac06TX27lfJ0XYuweZ62FnB5B5s0nRJtpXyylxNYX5tv2-pXZFSN0MMyH08efx9o5pcXw8cBj25olu12CoS4k4Csjylve4P9xb6PFbMk1FLRHkJCBfKvjfwKC1mv4QFfrpvgN7stuygEYx3lr08A8KVOdByUzm-yaMpoX4wnsao2YGyT9AJUevXoB7ST1q-DuSWbRs1xtM6eK2NY16W5SHLvgYlt3jj1TzEItWrjhEblmVFzljpI8TLdVHz04cYcXpTVQdaB5pIlTiUQ_skeTfwgfCMqDv3xMHfvLCD2oIYabRMZT3I-EQOPFVa_9q2H2uoWX29YICOWOKl9lcY2Rb1gQf_aea0YngKCM9poDqXZogNvBwSDCi5kFuDBKf6XDqoQThIbzwXG7D0IcCON_XHfjnmqFNszsCLwDrnP_FoVoOmNzT_nxmXqM7N_ZtdZt2G0iHs1W7DAkVMnRxT1EY0mFcdM5E5KXjA6pNa8s4hm3JkFrzTvvcJE7Q'),
(8, '2019-05-20 15:47:18', '2019-05-20 16:47:18', 1, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQ3VzdG9tZXIiLCJwaG9uZSI6IjEyMzQ1Njc4IiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ6aXphaCIsImV4cCI6MTU1ODM3MDgzOCwidXNlcmlkIjoxLCJlbWFpbCI6InVzZXJAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ6aXphaCJ9.HqfYXpbD4ZdE528hRGuUW4BfXus9GUhcUTOlCZmfMmKKgl2wvOXuqvinmpwVBwIkdNRZCeY6PuHgcvmb19mTtuyte__F7ymTZQ6D6OJbXwyj7UFFMcrY2NowUZn__T15CglXTURu-kAkXtll4iYE44O6phh5UJM_iU0opKxZiBK_DUXkE6h58P6m-4oZezQnueiiQW8DrEnSwdIUWRXha8WYHlzZ1KbikXLpTLcT6wIJest8uXr1YLrOWjWMoD7Uv5mUWP7NJ6hQOxRAf2NBgPQxMg8Z7Y6IPggdXSyGmi78Fe8CrwmkyxfKH0ljEp-VofI5sZGQJPIBmAs--AKZv0qc4LdRDq4zRgtY5qUknggnCKG3zscRQH-1MmC6m68Cxa-LDaNMpWXqAQJc3TRyAQwy91dt6tMQEv158B_s3OBUXeFzGT4_hIuYBW-BdkRpZ9E1Knx7sLRSHanls3a4jTR6Xd4ihuyRWREXNOyqHfnYV_HNV60gKjyF_lLRAitzVfWD1VbpbYdFxdd-UhbiiOMXUChjIz30q97mnXCpr9L6Q87vy2Ia0u1h9edxv29J2iWSlf0G29y2u7kRyz4XMBYDk_FQDTt_5GN3tyAnGNcTqWg-WTqkpikU8J6PLoS4ZVNWoGy944DgQS4eSpWtat5amrMT-_cdPLwoCRn_LF4'),
(9, '2019-05-20 15:53:32', '2019-05-20 16:53:32', 3, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiUmVzdGF1cmFudCIsInBob25lIjoiMTIzIiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ1c2VyMiIsImV4cCI6MTU1ODM3MTIxMiwidXNlcmlkIjoyLCJlbWFpbCI6InVzZXIyQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoidXNlcjIifQ.TDigTWqrO1Jj7fWoKMJJHgRrhoNA5S12zj3XI6ON-m1c9mGpmHSJQ2tPb_nsmlr-QdDQgtHzwA4o8dOHFHf5JRS-Akwih0Yznr_bD9nReWZeMqWxp8FNw2sqZPItuGV84gPcZfQceyJZG5Kb25ABsI6GBGcHLuyXDnk3vZnFoCp5jybc_jCTwkXVfGYgHbmtDWSlbY-7muXFrenX8sC7b7KPoDpP8GHRw9NtqqsoIJeilRhsjljs9N4Vm8XT-P-HMUE-zxPUaJsRawczzmtOqy4nlaHl2jA0AgJJNujwWmX2Jgg-D2TmXl_o5mMThz-SftGXwHmcMHOknvkW-tOlyBVMphOHSENjr9WJWujegpUH4q2aoN8fhzxb5WujbMtCww9Dsuovw8s6FMvEPXtBQnPXs9EARy5OgQRTyq_enAMefgmefCV5Jm0A9v5n7EHkgPWVke-22R8_z3cByBoeXTj3pMcoJ8SBbxOusbvLHEqGC6ZKvpUxuRfABpStIFfvULfpasKqCRL0PBKbxMCaIo7WLhAGkqa2m14VNSXQY26OYUllYvnbKOGZDmLpkmPFhz3jyGrcUPAUgevg_krU_pQkntagWJYlhYV1p2q5K-r9SOrCOpLmXDnSY0EcVDvd2ThgjJkTdVqu5M97EVi1IpC2OkFXKpH-SlstEG_ciik'),
(10, '2019-05-20 16:04:52', '2019-05-20 17:04:52', 2, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQWRtaW4iLCJwaG9uZSI6IjEyMyIsImlzcyI6InRjZGVsaXZlcnkiLCJuYW1lIjoidXNlcjIiLCJleHAiOjE1NTgzNzE4OTIsInVzZXJpZCI6MiwiZW1haWwiOiJ1c2VyMkBnbWFpbC5jb20iLCJ1c2VybmFtZSI6InVzZXIyIn0.oKPGft-426myKcMojMxGXrQ5BVMv1kDL6i3nI25Nd0OHaVR-hgwRit2yw-KuG2P-qz-koZxEkypwZcQ3MqjA9oEhTIWnpi4NWN2r0qE8LQeeJnE80-VjsGtH9WyrUnsH17Ly6Gft4kYIjWPTivx_aNtyiZGBWFvyd4hj9PaSDZcGoHPJ-GXH41t4EHHZT-RMEq3zoJpA5mr8GHut1fnFNh5ya7qXZ6VLz3HqIZGjaGApPKs1BJHQ6xp_ZeBoButBqP4yfrDxEvV6zvOQgtgox037gKjDQzn9UXk9vJU_H0d7IrrLzn3WUnrmbHDepSrCLIepVYTqS3SfHPo02oa179qeA-ENHqsdz0B5UmzzU6mgxHcoFaBZfjUUVcS21hemVHXcoqA-ZKIL8qtxi59W0k7sPUFfuDqXSOqcHaHitX-MIWY-TDeZxV_Z8QR0QUi-ycqvAZivBWlRJSbBhkPZDmGGPUiK5OPJIfsNvv7lVRH6iBKsnmCJAVMACt5auLKzzvsrgeK5SrvBrfEQmjvGhFkGC9WEF1RGjPuSYojQKeF5ES2x-Hfu7Kz8LqeVHeay9WDSilyWYPCNMYbxV47u-jQwsklRkTP5olFjwNme8OeoOL63pLFDmTZvor-HUKF7hhFWKOjaKaCuYcHwb6-qjw_bTOkojhKDJQjQoNShOZw'),
(11, '2019-05-21 02:54:54', '2019-05-21 03:54:54', 1, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQ3VzdG9tZXIiLCJwaG9uZSI6IjEyMzQ1Njc4IiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ6aXphaCIsImV4cCI6MTU1ODQxMDg5NCwidXNlcmlkIjoxLCJlbWFpbCI6InVzZXJAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ6aXphaCJ9.Xfu6zqKd4I1VJh-RUEaOTYhGBqiRK9xO0sXhX4928NQLdoLvoDS4WBWEJiaAb7HFJTZwVlalSz2cOJM9EH_I-WrN-ZIT717-dDHuTAQ0eV-87K0eWwxAhl41jNAd8cSCyGxdlqhlKAdg32MXkOckT6kpqVVwtneqdIsLiJS8PPD_60_7X0KrgJlFPgfzkErJJ0Vj90-SMlGfcG_Lu3vnIjVoZ9hY5PgTMcRliOHl8ojEfaNPg2QhWn-G4mjieqQZoq8o_wntUIUeOmZVTA7RdIK7b36beC8CQayI5vRzG3QnP2QB6JvUmcDtv4KHgZoz1nG1JnpS4_qDgZ7gxBjI6N2FYMvgergC2afplHnXV-3eeXam2sFd9vVMOBC5B_IRm6P87N0y0yfizVHkBp4zSxkgEQmFY-oryR5wOTfYwsC1H5cI0SLBPxoCCEwS-2OhJzibwLitnrnTRgC3U-GyXT69XiVnLiWcjo8RBX67IZ1UAmCBKVijT2kxGYuktXe7VIbNad29r7FbyJX_LyDbA8KPns8Ty1pzXJfBdRWX6N9XsNkGwkRZb8kdNFD3LEcB3SW3RIBn4GrgBqJNOkfSA1nzJt9MAhFKyKd2F7-Kz-PgDvWQXt5MMlRWe4RNN9k2pUoBMFM59WD1ffy--uUGIkoNaZSJtWXr3qTpwFH735g'),
(12, '2019-05-21 03:56:34', '2019-05-21 04:56:34', 1, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiQ3VzdG9tZXIiLCJwaG9uZSI6IjEyMzQ1Njc4IiwiaXNzIjoidGNkZWxpdmVyeSIsIm5hbWUiOiJ6aXphaCIsImV4cCI6MTU1ODQxNDU5NCwidXNlcmlkIjoxLCJlbWFpbCI6InVzZXJAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ6aXphaCJ9.d109VpouNr_v_YpHCLW6PhwkJxXP2rCkkq4QBF8W06CC-Lm66YFtRVXideAfHqfHJYLNZiAiC7SuGmqOIVi34RF1iL6i9p8f059wLl7tU0ez0igFPDCu9WqRB1LQVIk7vqmfFUZyDvQzth-_xaOLDAYPedBGoQqFV7k9RIXJB-rwPvJ9YwhZy_H6-6qqj6hx5YZ2py6hb_jS3WwpZco0n6-jlLL58w7sAPcFrXIgX039kUTgx4cyZWbXkvQ-j5xtAs7psZmYHT6-9CxJYx4Df2U1xJTDh9fFur8Y_vVOVFhTSBuuriGIsjwm3khgjsECOjFXQ836UEJtRtoviOJdUDGNlEa5lWO02fVu6SWJaXX-lkOcWk5XgSVTn_PxPow-0Cx00nRJ1pDkHRNU4_7UjvDomAvDPIZEtCj1aEgTHHT29u36GX7q8W-gEXwdUgpXTl1_Qz1jiIfih1KIWFvn0x6K_BWOEaEZ5q4BrIOEw1tb-fwnZmdmESchirEMn57PVmtmPWvxuGroq06XenkvYHOK43RkkFBlIAMIIODtrWw0EqUiB4Nmk7OJuN7AgGkfsrCC0nBnt-MA1SbHCGJETsdfOcfTZTc5uDmFvbhm26sy1PstOG2-Ei_N6ucDH6IOseyr6lsmHBCD3bKz_4jtj-F_NGr_Ly43yl8e4KBN32s'),
(13, '2019-05-21 05:19:55', '2019-05-21 06:19:54', 5, 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyb2xlIjoiUmVzdGF1cmFudCIsInBob25lIjoiMTIzNDU2NzgiLCJpc3MiOiJ0Y2RlbGl2ZXJ5IiwibmFtZSI6InVzZXI1IiwiZXhwIjoxNTU4NDE5NTk0LCJ1c2VyaWQiOjUsImVtYWlsIjoidXNlcjVAZ21haWwuY29tIiwidXNlcm5hbWUiOiJ1c2VyNSJ9.SxX-nfslwywTUeZNB76xQcT1eKyMVyEsq3bWf1XxxpHTSy4tABHDCUa1T27DXmyBWAN99AJ5KnVas4xXsz1cu7Tki9eqWkTmzIydq_oxnCIXOwbmzHXuOgrZqDmGS3xZdGkboNYRBb2zcIIcyb2Wo4dy3dWLAXo3LXl_oardzwwu2cH0gBD95VLu08LHOUO3m-7-_YDvldzawxbmEZPY09g2mFhvXdruFju_Sb22-28a3bO_FaAEVG2Tyf2ALUxc7qxQIbyg5azwmqK65jhkslN-oZ-VxoTGEROErWQa_RWN6GdULEW1F1jhUUuhc887v3d1DSc2qaYfLXko7ClVqZ26IfdRTdF6of-1mLqiL8Jd7TTihdAK-YYlujcIqOTXtzPnR136B2WXIQKMLhONYGFJIAHnh4EjaDJEcK0NYppOKUnGaUATn0BOwC1ZJcOb4jIqtpPOklPpenoKv1kKv49g4ycm1HEhsxYP63orA9sek7gz-j_bg9Uj4W5yUeCIi05ZvAfkvASc5w8aH-_Qe7mYIq00hTIA9SFKwsCp32NKRHluuKl3pIImnmTO3z04kii1jNDmwZBvWYXD3-aWrNjkRlSc7uPF4V-Gv2YlbWiy5qv7Oo6QEdBk2qRrCTYAPtzchN3v5Z_M98u9uMi1MF8kUbASeEQNMbju6ohGBKY');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `bulan` int(11) DEFAULT NULL,
  `hari` int(11) DEFAULT NULL,
  `id_customer` int(11) DEFAULT NULL,
  `id_driver` int(11) DEFAULT NULL,
  `id_menu` int(11) DEFAULT NULL,
  `id_restaurant` int(11) DEFAULT NULL,
  `id_transaksi` int(11) DEFAULT NULL,
  `jenis_pembayaran` varchar(255) DEFAULT NULL,
  `jmlh` int(11) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_price` int(11) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `bulan`, `hari`, `id_customer`, `id_driver`, `id_menu`, `id_restaurant`, `id_transaksi`, `jenis_pembayaran`, `jmlh`, `menu_name`, `menu_price`, `tahun`, `total`) VALUES
(1, 5, 20, 1, 1, 1, 1, 1, 'tunai', 5, 'menu1', 1000, 2019, 5000),
(2, 5, 20, 1, 1, 2, 1, 1, 'tunai', 2, 'menu2', 2000, 2019, 4000),
(3, 5, 21, 1, 2, 2, 2, 2, 'tunai', 3, 'menu2', 2000, 2019, 4000),
(4, 6, 5, 2, 3, 3, 2, 2, 'kredit', 1, 'menu3', 3000, 2019, 3000),
(5, 6, 10, 1, 3, 2, 3, 4, 'kredit', 3, 'menu2', 2000, 2019, 6000),
(6, 6, 11, 4, 4, 4, 4, 4, 'kredit', 2, 'menu4', 5000, 2019, 10000),
(7, 7, 1, 1, 5, 5, 5, 5, 'tunai', 3, 'menu5', 2000, 2019, 6000),
(8, 7, 5, 2, 3, 5, 1, 5, 'kredit', 1, 'menu5', 2000, 2019, 2000);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `created_at`, `email`, `name`, `password`, `phone_number`, `role`, `status`, `user_name`) VALUES
(1, '2018-12-08 02:04:42', 'user@gmail.com', 'zizah', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', '12345678', 1, 1, 'zizah'),
(2, '2019-05-02 00:00:00', 'user2@gmail.com', 'user2', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 3, 1, 'user2'),
(3, '2018-12-08 02:04:42', 'user3@gmail.com', 'user3', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', '12345678', 1, 1, 'user3'),
(4, '2019-05-02 00:00:00', 'user4@gmail.com', 'user4', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 1, 1, 'user4'),
(5, '2018-12-08 02:04:42', 'user5@gmail.com', 'user5', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', '12345678', 2, 1, 'user5'),
(6, '2019-05-02 00:00:00', 'user6@gmail.com', 'user6', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 2, 1, 'user5'),
(7, '2018-12-08 02:04:42', 'user7@gmail.com', 'user7', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', '12345678', 4, 1, 'user7'),
(8, '2019-05-02 00:00:00', 'user8@gmail.com', 'user8', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 4, 1, 'user8');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indexes for table `testusers`
--
ALTER TABLE `testusers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tokens`
--
ALTER TABLE `tokens`
  ADD PRIMARY KEY (`id_token`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
