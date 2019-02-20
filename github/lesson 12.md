13. Создание тегов версий
Цели
Узнать, как создавать теги для коммитов для использования в будущем
Давайте назовем текущую версию страницы hello первой (v1).

01 Создайте тег первой версии
ВЫПОЛНИТЕ:
git tag v1
Теперь текущая версия страницы называется v1.

02 Теги для предыдущих версий
Давайте создадим тег для версии, которая идет перед текущей версией и назовем его v1-beta. В первую очередь нам надо переключиться на предыдущую версию. Вместо поиска до хэш, мы будем использовать ^, обозначающее «родитель v1».

Если обозначение v1^ вызывает у вас какие-то проблемы, попробуйте также  v1~1, указывающее на ту же версию. Это обозначение можно определить как «первую версию предшествующую v1».

ВЫПОЛНИТЕ:
git checkout v1^
cat hello.html
РЕЗУЛЬТАТ:
$ git checkout v1^
Note: checking out 'v1^'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by performing another checkout.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -b with the checkout command again. Example:

  git checkout -b new_branch_name

HEAD is now at 8c32287... Added standard HTML page tags
$ cat hello.html
<html>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
Это версия c тегами <html> и <body>, но еще пока без  <head>. Давайте сделаем ее версией v1-beta.

ВЫПОЛНИТЕ:
git tag v1-beta
03 Переключение по имени тега
Теперь попробуйте попереключаться между двумя отмеченными версиями.

ВЫПОЛНИТЕ:
git checkout v1
git checkout v1-beta
РЕЗУЛЬТАТ:
$ git checkout v1
Previous HEAD position was 8c32287... Added standard HTML page tags
HEAD is now at fa3c141... Added HTML header
$ git checkout v1-beta
Previous HEAD position was fa3c141... Added HTML header
HEAD is now at 8c32287... Added standard HTML page tags
04 Просмотр тегов с помощью команды tag
Вы можете увидеть, какие теги доступны, используя команду git tag.

ВЫПОЛНИТЕ:
git tag
РЕЗУЛЬТАТ:
$ git tag
v1
v1-beta
05 Просмотр Тегов в логах
Вы также можете посмотреть теги в логе.

ВЫПОЛНИТЕ:
git hist master --all
РЕЗУЛЬТАТ:
$ git hist master --all
* fa3c141 2011-03-09 | Added HTML header (v1, master) [Alexander Shvets]
* 8c32287 2011-03-09 | Added standard HTML page tags (HEAD, v1-beta) [Alexander Shvets]
* 43628f7 2011-03-09 | Added h1 tag [Alexander Shvets]
* 911e8c9 2011-03-09 | First Commit [Alexander Shvets]
Вы можете видеть теги (v1 и v1-beta) в логе вместе с именем ветки (master). Кроме того HEAD показывает коммит, на который вы переключились (на данный момент это v1-beta).

