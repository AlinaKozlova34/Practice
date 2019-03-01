18. Удаление тега oops
Цели
Удаление тега oops (уборка)
01 Удаление тега oops
Тег oops свою функцию выполнил. Давайте удалим его и коммиты, на которые он ссылался, сборщиком мусора.

ВЫПОЛНИТЕ:
git tag -d oops
git hist --all
РЕЗУЛЬТАТ:
$ git tag -d oops
Deleted tag 'oops' (was 45fa96b)
$ git hist --all
* fa3c141 2011-03-09 | Added HTML header (HEAD, v1, master) [Al]
* 8c32287 2011-03-09 | Added standard HTML page tags (v1-beta) [Al]
* 43628f7 2011-03-09 | Added h1 tag [Al]
* 911e8c9 2011-03-09 | First Commit [Al]
Тег «oops» больше не будет отображаться в репозитории.