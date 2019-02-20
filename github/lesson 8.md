9. Изменения, а не файлы
Цели:
Понять, что git работает с изменениями, а не файлами.
Большинство систем версионного контроля работают с файлами. Вы добавляете файл в версионный контроль, а система отслеживает изменения файла с этого момента.

Git фокусируется на изменениях в файле, а не самом файле. Когда вы осуществляете команду git add file, вы не говорите git добавить файл в репозиторий. Скорее вы говорите, что git надо отметить текущее состояние файла, коммит которого будет произведен позже.

Мы попытаемся исследовать эту разницу в данном уроке.

01 Первое изменение: Добавьте стандартные теги страницы
Измените страницу «Hello, World», чтобы она содержала стандартные теги  <html> и <body>.

ФАЙЛ: hello.html
	<html>
  	   <body>
    	      <h1>Hello, World!</h1>
  	   </body>
	</html>

02 Добавьте это изменение
Теперь добавьте это изменение в индекс git.

ВЫПОЛНИТЕ:

git add hello.html

03 Второе изменение: Добавьте заголовки HTML
Теперь добавьте заголовки HTML (секцию <head>) к странице «Hello, World».

ФАЙЛ: hello.html
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
04 Проверьте текущий статус
ВЫПОЛНИТЕ:

	git status

Вы увидите…

РЕЗУЛЬТАТ:

	$ git status
	# On branch master
	# Changes to be committed:
	#   (use "git reset HEAD <file>..." to unstage)
	#
	#   modified:   hello.html
	#
	# Changes not staged for commit:
	#   (use "git add <file>..." to update what will be committed)
	#   (use "git checkout -- <file>..." to discard changes in working directory)
	#
	#   modified:   hello.html
	#

Обратите внимание на то, что hello.html указан дважды в состоянии. Первое изменение (добавление стандартных тегов) проиндексировано и готово к коммиту. Второе изменение (добавление заголовков HTML) является непроиндексированным. Если бы вы делали коммит сейчас, заголовки не были бы сохранены в репозиторий.

Давайте проверим.

05 Коммит
Произведите коммит проиндексированного изменения (значение по умолчанию), а затем еще раз проверьте состояние.

ВЫПОЛНИТЕ:

	git commit -m "Added standard HTML page tags"
	git status
Вы увидите…


РЕЗУЛЬТАТ:

	$ git commit -m "Added standard HTML page tags"
[master 8c32287] Added standard HTML page tags
 	1 files changed, 3 insertions(+), 1 deletions(-)
	$ git status
	# On branch master
	# Changes not staged for commit:
	#   (use "git add <file>..." to update what will be committed)
	#   (use "git checkout -- <file>..." to discard changes in working directory)
	#
	#   modified:   hello.html
	#
no changes added to commit (use "git add" and/or "git commit -a")
Состояние команды говорит о том, что hello.html имеет незафиксированные изменения, но уже не в буферной зоне.

06 Добавьте второе изменение
Теперь добавьте второе изменение в индекс, а затем проверьте состояние с помощью команды git status.

ВЫПОЛНИТЕ:

	git add .
	git status

Примечание: В качестве файла для добавления, мы использовали текущий каталог («.»). Это самый краткий и удобный путь для добавления всех изменений в файлы текущего каталога и его подкаталоги. Но поскольку он добавляет все, не лишним будет проверить состояние перед запуском add, просто чтобы убедиться, что вы не добавили какой-то файл, который добавлять было не нужно.

Я хотел показать вам трюк с add, далее мы будем на всякий случай продолжать добавлять явные файлы.

Вы увидите…

РЕЗУЛЬТАТ:

	$ git status
	# On branch master
	# Changes to be committed:
	#   (use "git reset HEAD <file>..." to unstage)
	#
	#   modified:   hello.html
	#

Второе изменение было проиндексировано и готово к коммиту.

07 Сделайте коммит второго изменения
ВЫПОЛНИТЕ:

	git commit -m "Added HTML header"