13. �������� ����� ������
����
������, ��� ��������� ���� ��� �������� ��� ������������� � �������
������� ������� ������� ������ �������� hello ������ (v1).

01 �������� ��� ������ ������
���������:
git tag v1
������ ������� ������ �������� ���������� v1.

02 ���� ��� ���������� ������
������� �������� ��� ��� ������, ������� ���� ����� ������� ������� � ������� ��� v1-beta. � ������ ������� ��� ���� ������������� �� ���������� ������. ������ ������ �� ���, �� ����� ������������ ^, ������������ ��������� v1�.

���� ����������� v1^ �������� � ��� �����-�� ��������, ���������� �����  v1~1, ����������� �� �� �� ������. ��� ����������� ����� ���������� ��� ������� ������ �������������� v1�.

���������:
git checkout v1^
cat hello.html
���������:
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
��� ������ c ������ <html> � <body>, �� ��� ���� ���  <head>. ������� ������� �� ������� v1-beta.

���������:
git tag v1-beta
03 ������������ �� ����� ����
������ ���������� ��������������� ����� ����� ����������� ��������.

���������:
git checkout v1
git checkout v1-beta
���������:
$ git checkout v1
Previous HEAD position was 8c32287... Added standard HTML page tags
HEAD is now at fa3c141... Added HTML header
$ git checkout v1-beta
Previous HEAD position was fa3c141... Added HTML header
HEAD is now at 8c32287... Added standard HTML page tags
04 �������� ����� � ������� ������� tag
�� ������ �������, ����� ���� ��������, ��������� ������� git tag.

���������:
git tag
���������:
$ git tag
v1
v1-beta
05 �������� ����� � �����
�� ����� ������ ���������� ���� � ����.

���������:
git hist master --all
���������:
$ git hist master --all
* fa3c141 2011-03-09 | Added HTML header (v1, master) [Alexander Shvets]
* 8c32287 2011-03-09 | Added standard HTML page tags (HEAD, v1-beta) [Alexander Shvets]
* 43628f7 2011-03-09 | Added h1 tag [Alexander Shvets]
* 911e8c9 2011-03-09 | First Commit [Alexander Shvets]
�� ������ ������ ���� (v1 � v1-beta) � ���� ������ � ������ ����� (master). ����� ���� HEAD ���������� ������, �� ������� �� ������������� (�� ������ ������ ��� v1-beta).

