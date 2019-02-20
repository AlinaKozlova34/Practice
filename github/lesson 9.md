10. История
Цели
Научиться просматривать историю проекта.
Получение списка произведенных изменений — функция команды git log.

ВЫПОЛНИТЕ:

	git log
Вы увидите…

РЕЗУЛЬТАТ:
	$ git log
	commit fa3c1411aa09441695a9e645d4371e8d749da1dc
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		Added HTML header

	commit 8c3228730ed03116815a5cc682e8105e7d981928
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		Added standard HTML page tags

	commit 43628f779cb333dd30d78186499f93638107f70b
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

   	 	Added h1 tag

	commit 911e8c91caeab8d30ad16d56746cbd6eef72dc4c
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		First Commit
Вот список всех четырех коммитов в репозиторий, которые мы успели совершить.

01 Однострочная история
Вы полностью контролируете то, что отображает log. Мне, например, нравится однострочный формат:

ВЫПОЛНИТЕ:

	git log --pretty=oneline
Вы увидите…

РЕЗУЛЬТАТ:

	$ git log --pretty=oneline
	fa3c1411aa09441695a9e645d4371e8d749da1dc Added HTML header
	8c3228730ed03116815a5cc682e8105e7d981928 Added standard HTML page tags
	43628f779cb333dd30d78186499f93638107f70b Added h1 tag
	911e8c91caeab8d30ad16d56746cbd6eef72dc4c First Commit
02 Контроль отображения записей
Есть много вариантов выбора, какие элементы отображаются в логе. Поиграйте со следующими параметрами:

git log --pretty=oneline --max-count=2
git log --pretty=oneline --since='5 minutes ago'
git log --pretty=oneline --until='5 minutes ago'
git log --pretty=oneline --author=<your name>
git log --pretty=oneline --all
В unix-системах доступна справочная страница man git log.

03 Изощряемся
Вот что я использую для просмотра изменений, сделанных за последнюю неделю. Я добавлю --author=alex, если я хочу увидеть только изменения, которые сделал я.

git log --all --pretty=format:"%h %cd %s (%an)" --since='7 days ago'
04 Конечный формат лога
Со временем, я решил, что для большей части моей работы мне подходит следующий формат лога.

ВЫПОЛНИТЕ:
	git log --pretty=format:"%h %ad | %s%d [%an]" --graph --date=short
Выглядит это примерно так:

РЕЗУЛЬТАТ:
	$ git log --pretty=format:"%h %ad | %s%d [%an]" --graph --date=short
	* fa3c141 2011-03-09 | Added HTML header (HEAD, master) [Alexander Shvets]
	* 8c32287 2011-03-09 | Added standard HTML page tags [Alexander Shvets]
	* 43628f7 2011-03-09 | Added h1 tag [Alexander Shvets]
	* 911e8c9 2011-03-09 | First Commit [Alexander Shvets]
Давайте рассмотрим его в деталях:

--pretty="..." — определяет формат вывода.
%h — укороченный хэш коммита
%d — дополнения коммита («головы» веток или теги)
%ad — дата коммита
%s — комментарий
%an — имя автора
--graph — отображает дерево коммитов в виде ASCII-графика
--date=short — сохраняет формат даты коротким и симпатичным
Таким образом, каждый раз, когда вы захотите посмотреть лог, вам придется много печатать. К счастью, мы узнаем о git алиасах в следующем уроке.

05 Другие инструменты
Оба gitx (для Mac) и gitk (для любой платформы) полезны в изучении истории изменений.