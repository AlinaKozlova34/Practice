9. ���������, � �� �����
����:
������, ��� git �������� � �����������, � �� �������.
����������� ������ ����������� �������� �������� � �������. �� ���������� ���� � ���������� ��������, � ������� ����������� ��������� ����� � ����� �������.

Git ������������ �� ���������� � �����, � �� ����� �����. ����� �� ������������� ������� git add file, �� �� �������� git �������� ���� � �����������. ������ �� ��������, ��� git ���� �������� ������� ��������� �����, ������ �������� ����� ���������� �����.

�� ���������� ����������� ��� ������� � ������ �����.

01 ������ ���������: �������� ����������� ���� ��������
�������� �������� �Hello, World�, ����� ��� ��������� ����������� ����  <html> � <body>.

����: hello.html
	<html>
  	   <body>
    	      <h1>Hello, World!</h1>
  	   </body>
	</html>

02 �������� ��� ���������
������ �������� ��� ��������� � ������ git.

���������:

git add hello.html

03 ������ ���������: �������� ��������� HTML
������ �������� ��������� HTML (������ <head>) � �������� �Hello, World�.

����: hello.html
<html>
  <head>
  </head>
  <body>
    <h1>Hello, World!</h1>
  </body>
</html>
04 ��������� ������� ������
���������:

	git status

�� �������

���������:

	$ git status
	# On branch master
	# Changes to be committed:
	#   (use "git reset HEAD <file>..." to unstage)
	#
	#   modified:   hello.html
	#
	# Changes not staged for commit:
	#   (use "git add <file>..." to update what will be committed)
	#   (use "git checkout -- <file>..." to discard changes in working directory)
	#
	#   modified:   hello.html
	#

�������� �������� �� ��, ��� hello.html ������ ������ � ���������. ������ ��������� (���������� ����������� �����) ���������������� � ������ � �������. ������ ��������� (���������� ���������� HTML) �������� ��������������������. ���� �� �� ������ ������ ������, ��������� �� ���� �� ��������� � �����������.

������� ��������.

05 ������
����������� ������ ������������������� ��������� (�������� �� ���������), � ����� ��� ��� ��������� ���������.

���������:

	git commit -m "Added standard HTML page tags"
	git status
�� �������


���������:

	$ git commit -m "Added standard HTML page tags"
[master 8c32287] Added standard HTML page tags
 	1 files changed, 3 insertions(+), 1 deletions(-)
	$ git status
	# On branch master
	# Changes not staged for commit:
	#   (use "git add <file>..." to update what will be committed)
	#   (use "git checkout -- <file>..." to discard changes in working directory)
	#
	#   modified:   hello.html
	#
no changes added to commit (use "git add" and/or "git commit -a")
��������� ������� ������� � ���, ��� hello.html ����� ����������������� ���������, �� ��� �� � �������� ����.

06 �������� ������ ���������
������ �������� ������ ��������� � ������, � ����� ��������� ��������� � ������� ������� git status.

���������:

	git add .
	git status

����������: � �������� ����� ��� ����������, �� ������������ ������� ������� (�.�). ��� ����� ������� � ������� ���� ��� ���������� ���� ��������� � ����� �������� �������� � ��� �����������. �� ��������� �� ��������� ���, �� ������ ����� ��������� ��������� ����� �������� add, ������ ����� ���������, ��� �� �� �������� �����-�� ����, ������� ��������� ���� �� �����.

� ����� �������� ��� ���� � add, ����� �� ����� �� ������ ������ ���������� ��������� ����� �����.

�� �������

���������:

	$ git status
	# On branch master
	# Changes to be committed:
	#   (use "git reset HEAD <file>..." to unstage)
	#
	#   modified:   hello.html
	#

������ ��������� ���� ���������������� � ������ � �������.

07 �������� ������ ������� ���������
���������:

	git commit -m "Added HTML header"