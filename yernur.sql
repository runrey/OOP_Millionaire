-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Июн 12 2020 г., 18:06
-- Версия сервера: 10.4.11-MariaDB
-- Версия PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `yernur`
--

-- --------------------------------------------------------

--
-- Структура таблицы `admins`
--

CREATE TABLE `admins` (
  `adm_id` int(11) NOT NULL,
  `a_fname` varchar(30) NOT NULL,
  `a_lname` varchar(30) NOT NULL,
  `admin_name` varchar(30) NOT NULL,
  `a_pass` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `admins`
--

INSERT INTO `admins` (`adm_id`, `a_fname`, `a_lname`, `admin_name`, `a_pass`) VALUES
(1, 'Yernur', 'Bolatkanov', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Структура таблицы `question`
--

CREATE TABLE `question` (
  `q_id` int(11) NOT NULL,
  `level` varchar(20) NOT NULL,
  `value` varchar(255) NOT NULL,
  `a_answer` varchar(255) NOT NULL,
  `b_answer` varchar(255) NOT NULL,
  `c_answer` varchar(255) NOT NULL,
  `d_answer` varchar(255) NOT NULL,
  `correct_answer` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `question`
--

INSERT INTO `question` (`q_id`, `level`, `value`, `a_answer`, `b_answer`, `c_answer`, `d_answer`, `correct_answer`) VALUES
(1, 'easy', 'Which food can be double, single, sour and clotted?', 'Pancakes', 'Cream', 'Ice-cream', 'Mashed potatoes', 'B'),
(2, 'easy', 'How many seconds are there in one minute?', '120', '60', '100', '15', 'B'),
(3, 'easy', 'Which of these characters is said to leave money under children\'s pillows?', 'Alpamys', 'Tooth fairy', 'Cinderella', 'Shrek', 'B'),
(4, 'easy', 'Of what is volcanology the scientific study?', 'Earthquakes', 'Volcanoes', 'Tsunami', 'Typhoon', 'B'),
(5, 'easy', 'Which of these shapes is associated with Egypt?', 'Sphinx', 'Pyramid', 'PHARAOH', 'Mummy', 'B'),
(6, 'medium', 'In the Bible, who dreams of a ladder reaching to heaven?', 'Jesus', 'Jacob', 'Bella', 'Lucifer', 'B'),
(7, 'medium', 'Who was nicknamed \'The Iron Duke\'?', 'Golden Retriever', 'Wellington', 'Alabay', 'Kangal', 'B'),
(8, 'medium', 'What is a \'cormorant\'?', 'Snake', 'Bird', 'Chemical element', 'Chemical solution', 'B'),
(9, 'medium', 'Which of these is a correct spelling?', 'Embarasment', 'Embarrassment', 'Emberresment', 'Embarensment', 'B'),
(10, 'medium', 'What is \'kazoo\'?', 'Kangaroo', 'Musical instrument', 'National dish', 'National game', 'B'),
(11, 'hard', 'In which year did David Livingstone become the first European to see the Victoria Falls?', '1856', '1855', '1888', '1854', 'B'),
(12, 'hard', 'What type of creature is a kokanee?', 'Birds', 'Fish', 'Cocaine', 'Cacao', 'B'),
(13, 'hard', 'The world\'s highest dam, the Rogun, is in which country?', 'The USA', 'Tajikistan', 'The UK', 'Germany', 'B'),
(14, 'hard', 'What is the capital city of Latvia?', 'Milan', 'Riga', 'Budapest', 'Prague', 'B'),
(15, 'hard', 'In which month is the Duke of Edinburgh\'s birthday?', 'August', 'June', 'October', 'March', 'B'),
(18, 'asd', 'asd', 'asd', 'asd', 'asd', 'ads', 'a'),
(19, 'Easy', 'name', 'asd', 'asdsa', 'asd', 'asd', 'b');

-- --------------------------------------------------------

--
-- Структура таблицы `score`
--

CREATE TABLE `score` (
  `score_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `lname` varchar(30) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `user_pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`user_id`, `fname`, `lname`, `user_name`, `user_pass`) VALUES
(1, 'rey', 'rey', 'rey', 'rey'),
(2, 'run', 'run', 'run', 'run'),
(3, 'asdad', 'asdas', 'ss', 'sssad'),
(4, 'Yernur', 'Bolatkanov', 'runrey', '12345'),
(5, 'Yernur', 'Runreu', 'labka', '1234');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`adm_id`);

--
-- Индексы таблицы `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`q_id`);

--
-- Индексы таблицы `score`
--
ALTER TABLE `score`
  ADD PRIMARY KEY (`score_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Индексы таблицы `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `admins`
--
ALTER TABLE `admins`
  MODIFY `adm_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT для таблицы `question`
--
ALTER TABLE `question`
  MODIFY `q_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT для таблицы `score`
--
ALTER TABLE `score`
  MODIFY `score_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `score`
--
ALTER TABLE `score`
  ADD CONSTRAINT `score_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
