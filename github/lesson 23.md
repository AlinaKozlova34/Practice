24. �������� �����
����
��������� ��������� ��������� ����� � �����������
���� ������� ��� hello world ����� �������������. ��� ��� ��� ����� ������ ��������� �����, ����� ����������� ��� ��������� � ��������� �����, ����� ����������� �� �� ��������� � ����� master.

01 �������� �����
������� ������� ���� ����� ����� �style�.

���������:
git checkout -b style
git status
����������: git checkout -b <��������> �������� ��������� ��� git branch <��������> �� ������� ����  git checkout <��������>.

�������� ��������, ��� ������� git status �������� � ���, ��� �� ���������� � ����� �style�.

02�������� ���� ������ style.css
���������:
touch lib/style.css
����: lib/style.css
h1 {
  color: red;
}
���������:
git add lib/style.css
git commit -m "Added css stylesheet"
03�������� �������� ��������
�������� ���� hello.html, ����� ������������ ����� style.css.

����: lib/hello.html
<!-- Author: Al (art-line@yandex.ru) -->
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="all" href="style.css" />
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
���������:
git add lib/hello.html
git commit -m "Hello uses style.css"
04�������� index.html
�������� ���� index.html, ����� �� ���� ����������� style.css

����: index.html
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="all" href="lib/style.css" />
  </head>
  <body>
    <iframe src="lib/hello.html" width="200" height="200" />
  </body>
</html>
���������:
git add index.html
git commit -m "Updated index.html"