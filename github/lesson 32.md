25. ��������� �� ������
����
��������� ������������ ����� ������� �����������
������ � ����� ������� ���� ��� �����:

���������:
git hist --all
���������:
$ git hist --all
* 07a2a46 2011-03-09 | Updated index.html (HEAD, style) [Al]
* 649d26c 2011-03-09 | Hello uses style.css [Al]
* 1f3cbd2 2011-03-09 | Added css stylesheet [Al]
* 8029c07 2011-03-09 | Added index.html. (master) [Al]
* 567948a 2011-03-09 | Moved hello.html to lib [Al]
* 6a78635 2011-03-09 | Add an author/email comment [Al]
* fa3c141 2011-03-09 | Added HTML header (v1) [Al]
* 8c32287 2011-03-09 | Added standard HTML page tags (v1-beta) [Al]
* 43628f7 2011-03-09 | Added h1 tag [Al]
* 911e8c9 2011-03-09 | First Commit [Al]
01 ������������ �� ����� Master
������ ����������� ������� git checkout ��� ������������ ����� �������.

���������:
git checkout master
cat lib/hello.html
���������:
$ git checkout master
Switched to branch 'master'
$ cat lib/hello.html
<!-- Author: Al (art-line@yandex.ru) -->
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
������ �� ��������� �� ����� Master. ��� ������� �� ����, ��� ���� hello.html �� ���������� ����� style.css.

02 �������� � ����� �style�.
���������:
git checkout style
cat lib/hello.html
���������:
$ git checkout style
Switched to branch 'style'
$ cat lib/hello.html
<!-- Author: Al(art-line@yandex.ru) -->
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="all" href="style.css" />
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
���������� lib/hello.html ������������, ��� �� ��������� � ����� style.