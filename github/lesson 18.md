19. �������� ��������� � �������
����
��������� �������� ������������ �������
01 �������� ��������, � ����� �������� ������
�������� � �������� ����������� ������.

����: hello.html
<!-- Author: Al -->
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
���������:
git add hello.html
git commit -m "Add an author comment"
02 ��... ��������� email
����� ���������� ������� �� ���������, ��� ����� ������� ����������� ������ �������� ����������� ����� ������. �������� �������� hello, ������� � ��� email.

����: hello.html
<!-- Author: Al (alex@githowto.com) -->
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
03 �������� ���������� ������
�� ������������� �� ����� ��������� ��������� ������ ������ ���� ����������� �����. ������� ������� ���������� ������, ������� � ���� ����� ����������� �����.

���������:
git add hello.html
git commit --amend -m "Add an author/email comment"
���������:
$ git add hello.html
$ git commit --amend -m "Add an author/email comment"
[master 6a78635] Add an author/email comment
 1 files changed, 2 insertions(+), 1 deletions(-)
04 �������� �������
���������:
git hist
���������:
$ git hist
* 6a78635 2011-03-09 | Add an author/email comment (HEAD, master) [Al]
* fa3c141 2011-03-09 | Added HTML header (v1) [Al]
* 8c32287 2011-03-09 | Added standard HTML page tags (v1-beta) [Al]
* 43628f7 2011-03-09 | Added h1 tag [Al]
* 911e8c9 2011-03-09 | First Commit [Al]
�� ����� �������, ��� ������������ ������ ������ ������� �������� ������/email�. ����� �� ������� ����� ������� ����� ������ ���������� ������� � �����, � ���������� ������� ����� ���������.