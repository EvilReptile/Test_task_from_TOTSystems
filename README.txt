Создаем Postgres БД с помощью скрипта:
create table securities(
  secid varchar(36) primary key,
    regnumber varchar(189),
    name varchar(765),
    emitent_title varchar(765)
);

create table history(
	id serial primary key,
    secid varchar(36) references securities on delete cascade,
    tradedate date,
    numtrade float8, 
    open float8,
    close float8
);

После изменяем путь и данные логинезации в файле если необходимо 
Test_task_from_TOTSystems/conf/application.conf

Собираем проект в контейнер, для установки на сервер.

Для работы сервиса необходимы 
  JRE
  Postgresql
_____________________________________________________
Интерфейсы взаимодействия с сервисом

Загрузки файлов с данными для добавления в БД
GET:/upload

Данные истории
GET:/list

CRUD для работы с списком ценных бумаг

Выводит форму для выбора записи с возможностью перехода в режим редактирования
GET:/select

Режим редактирования
GET:/update/{secid ценной бумаги}

Режим выбора ценной бумаги для удаления
GET:/delete

Режим добавления информации о ценной бумаге в БД
GET:/insert
