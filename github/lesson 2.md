����:
��������� ��������� git ����������� � ����.

�������� �������� �Hello, World�
������� ������ � ������ ������� �������� (�������� Work, ���� �� ������� ����� � ����������� ����) � �������� ������� �������� � ������ �hello�, 
����� ������� � ���� � �������� ��� ���� � ������ hello.html � ����� �����������.

���������:

	mkdir hello
	cd hello
	touch hello.html

����: hello.html
	Hello, World
�������� �����������
������ � ��� ���� ������� � ����� ������. ����� ������� git ����������� �� ����� ��������, ��������� ������� git init.

���������:
	git init

���������:
	$ git init
	Initialized empty Git repository in /Users/Alina/Documents/Presentations/githowto/auto/hello/.git/

 �������� �������� � �����������
������ ������� ������� � ����������� �������� �Hello, World�.

���������:
	git add hello.html
	git commit -m "First Commit"

�� ������� �

���������:
	$ git add hello.html
	$ git commit -m "First Commit"
	[master (root-commit) 911e8c9] First Commit
 	1 files changed, 1 insertions(+), 0 deletions(-)
 	create mode 100644 hello.html