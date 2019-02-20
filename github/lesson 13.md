14. Отмена локальных изменений (до индексации)
Цели
Научиться отменять изменения в рабочем каталоге
01 Переключитесь на ветку Master
Убедитесь, что вы находитесь на последнем коммите ветки master, прежде чем продолжить работу.

ВЫПОЛНИТЕ:
git checkout master
02 Измените hello.html
Иногда случается, что вы изменили файл в рабочем каталоге, и хотите отменить последние коммиты. С этим справится команда checkout.

Внесите изменение в файл hello.html в виде нежелательного комментария.

ФАЙЛ: hello.html
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
    <!-- This is a bad comment.  We want to revert it. -->
  </body>
</html>
03 Проверьте состояние
Сначала проверьте состояние рабочего каталога.

ВЫПОЛНИТЕ:
git status
РЕЗУЛЬТАТ:
$ git status
# On branch master
# Changes not staged for commit:
#   (use "git add <file>..." to update what will be committed)
#   (use "git checkout -- <file>..." to discard changes in working directory)
#
#   modified:   hello.html
#
no changes added to commit (use "git add" and/or "git commit -a")
Мы видим, что файл hello.html был изменен, но еще не проиндексирован.

04 Отмена изменений в рабочем каталоге
Используйте команду checkout для переключения в версию файла  hello.html в репозитории.

ВЫПОЛНИТЕ:
git checkout hello.html
git status
cat hello.html
РЕЗУЛЬТАТ:
$ git checkout hello.html
$ git status
# On branch master
nothing to commit (working directory clean)
$ cat hello.html
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
Команда status показывает нам, что не было произведено никаких изменений, не зафиксированных в рабочем каталоге. И «нежелательный комментарий» больше не является частью содержимого файла.