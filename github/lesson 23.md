24. Создание ветки
Цели
Научиться создавать локальную ветку в репозитории
Пора сделать наш hello world более выразительным. Так как это может занять некоторое время, лучше переместить эти изменения в отдельную ветку, чтобы изолировать их от изменений в ветке master.

01 Создайте ветку
Давайте назовем нашу новую ветку «style».

ВЫПОЛНИТЕ:
git checkout -b style
git status
Примечание: git checkout -b <имяветки> является шорткатом для git branch <имяветки> за которым идет  git checkout <имяветки>.

Обратите внимание, что команда git status сообщает о том, что вы находитесь в ветке «style».

02Добавьте файл стилей style.css
ВЫПОЛНИТЕ:
touch lib/style.css
ФАЙЛ: lib/style.css
h1 {
  color: red;
}
ВЫПОЛНИТЕ:
git add lib/style.css
git commit -m "Added css stylesheet"
03Измените основную страницу
Обновите файл hello.html, чтобы использовать стили style.css.

ФАЙЛ: lib/hello.html
<!-- Author: Al (art-line@yandex.ru) -->
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="all" href="style.css" />
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
ВЫПОЛНИТЕ:
git add lib/hello.html
git commit -m "Hello uses style.css"
04Измените index.html
Обновите файл index.html, чтобы он тоже использовал style.css

ФАЙЛ: index.html
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="all" href="lib/style.css" />
  </head>
  <body>
    <iframe src="lib/hello.html" width="200" height="200" />
  </body>
</html>
ВЫПОЛНИТЕ:
git add index.html
git commit -m "Updated index.html"