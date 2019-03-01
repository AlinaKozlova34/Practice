19. Внесение изменений в коммиты
Цели
Научиться изменять существующие коммиты
01 Измените страницу, а затем сделайте коммит
Добавьте в страницу комментарий автора.

ФАЙЛ: hello.html
<!-- Author: Al -->
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
ВЫПОЛНИТЕ:
git add hello.html
git commit -m "Add an author comment"
02 Ой... необходим email
После совершения коммита вы понимаете, что любой хороший комментарий должен включать электронную почту автора. Обновите страницу hello, включив в нее email.

ФАЙЛ: hello.html
<!-- Author: Al (alex@githowto.com) -->
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
03 Измените предыдущий коммит
Мы действительно не хотим создавать отдельный коммит только ради электронной почты. Давайте изменим предыдущий коммит, включив в него адрес электронной почты.

ВЫПОЛНИТЕ:
git add hello.html
git commit --amend -m "Add an author/email comment"
РЕЗУЛЬТАТ:
$ git add hello.html
$ git commit --amend -m "Add an author/email comment"
[master 6a78635] Add an author/email comment
 1 files changed, 2 insertions(+), 1 deletions(-)
04 Просмотр истории
ВЫПОЛНИТЕ:
git hist
РЕЗУЛЬТАТ:
$ git hist
* 6a78635 2011-03-09 | Add an author/email comment (HEAD, master) [Al]
* fa3c141 2011-03-09 | Added HTML header (v1) [Al]
* 8c32287 2011-03-09 | Added standard HTML page tags (v1-beta) [Al]
* 43628f7 2011-03-09 | Added h1 tag [Al]
* 911e8c9 2011-03-09 | First Commit [Al]
Мы можем увидеть, что оригинальный коммит «автор» заменен коммитом «автор/email». Этого же эффекта можно достичь путем сброса последнего коммита в ветке, и повторного коммита новых изменений.