12. Получение старых версий
Цели
Научиться возвращать рабочий каталог к любому предыдущему состоянию.
Возвращаться назад в историю очень просто. Команда checkout скопирует любой снимок из репозитория в рабочий каталог.

01 Получите хэши предыдущих версий
ВЫПОЛНИТЕ:
git hist
Примечание: Вы не забыли задать hist в вашем файле .gitconfig? Если забыли, посмотрите еще раз урок по алиасам.

РЕЗУЛЬТАТ:
$ git hist
* fa3c141 2011-03-09 | Added HTML header (HEAD, master) [Alexander Shvets]
* 8c32287 2011-03-09 | Added standard HTML page tags [Alexander Shvets]
* 43628f7 2011-03-09 | Added h1 tag [Alexander Shvets]
* 911e8c9 2011-03-09 | First Commit [Alexander Shvets]
Изучите данные лога и найдите хэш для первого коммита. Он должен быть в последней строке данных git hist. Используйте этот хэш-код (достаточно первых 7 знаков) в команде ниже. Затем проверьте содержимое файла  hello.html.

ВЫПОЛНИТЕ:
git checkout <hash>
cat hello.html
Примечание: Многие команды зависят от хэшевых значений в репозитории. Поскольку ваши хеш-значения будут отличаться от моих, когда вы видите что-то вроде <hash> или <treehash> в команде, подставьте необходимое значение хэш для вашего репозитория.

Вы увидите…

РЕЗУЛЬТАТ:
$ git checkout 911e8c9
Note: checking out '911e8c9'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by performing another checkout.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -b with the checkout command again. Example:

  git checkout -b new_branch_name

HEAD is now at 911e8c9... First Commit
$ cat hello.html
Hello, World
Выходные данные команды checkout очень хорошо объясняют ситуацию. Старые версии git будут ругаться, что не расположены в локальной ветке. В любом случае, сейчас об этом не беспокойтесь.

Обратите внимание на то, что содержимое файла hello.html является значением по умолчанию.

02 Вернитесь к последней версии в ветке master
ВЫПОЛНИТЕ:
git checkout master
cat hello.html
Вы увидите…

РЕЗУЛЬТАТ:
$ git checkout master
Previous HEAD position was 911e8c9... First Commit
Switched to branch 'master'
$ cat hello.html
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
«master» — имя ветки по умолчанию. Переключая имена веток, вы попадаете на последнюю версию выбранной ветки.

