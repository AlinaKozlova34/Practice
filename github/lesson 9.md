10. �������
����
��������� ������������� ������� �������.
��������� ������ ������������� ��������� � ������� ������� git log.

���������:

	git log
�� �������

���������:
	$ git log
	commit fa3c1411aa09441695a9e645d4371e8d749da1dc
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		Added HTML header

	commit 8c3228730ed03116815a5cc682e8105e7d981928
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		Added standard HTML page tags

	commit 43628f779cb333dd30d78186499f93638107f70b
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

   	 	Added h1 tag

	commit 911e8c91caeab8d30ad16d56746cbd6eef72dc4c
	Author: Alexander Shvets <alex@githowto.com>
	Date:   Wed Mar 9 10:27:54 2011 -0500

    		First Commit
��� ������ ���� ������� �������� � �����������, ������� �� ������ ���������.

01 ������������ �������
�� ��������� ������������� ��, ��� ���������� log. ���, ��������, �������� ������������ ������:

���������:

	git log --pretty=oneline
�� �������

���������:

	$ git log --pretty=oneline
	fa3c1411aa09441695a9e645d4371e8d749da1dc Added HTML header
	8c3228730ed03116815a5cc682e8105e7d981928 Added standard HTML page tags
	43628f779cb333dd30d78186499f93638107f70b Added h1 tag
	911e8c91caeab8d30ad16d56746cbd6eef72dc4c First Commit
02 �������� ����������� �������
���� ����� ��������� ������, ����� �������� ������������ � ����. ��������� �� ���������� �����������:

git log --pretty=oneline --max-count=2
git log --pretty=oneline --since='5 minutes ago'
git log --pretty=oneline --until='5 minutes ago'
git log --pretty=oneline --author=<your name>
git log --pretty=oneline --all
� unix-�������� �������� ���������� �������� man git log.

03 ����������
��� ��� � ��������� ��� ��������� ���������, ��������� �� ��������� ������. � ������� --author=alex, ���� � ���� ������� ������ ���������, ������� ������ �.

git log --all --pretty=format:"%h %cd %s (%an)" --since='7 days ago'
04 �������� ������ ����
�� ��������, � �����, ��� ��� ������� ����� ���� ������ ��� �������� ��������� ������ ����.

���������:
	git log --pretty=format:"%h %ad | %s%d [%an]" --graph --date=short
�������� ��� �������� ���:

���������:
	$ git log --pretty=format:"%h %ad | %s%d [%an]" --graph --date=short
	* fa3c141 2011-03-09 | Added HTML header (HEAD, master) [Alexander Shvets]
	* 8c32287 2011-03-09 | Added standard HTML page tags [Alexander Shvets]
	* 43628f7 2011-03-09 | Added h1 tag [Alexander Shvets]
	* 911e8c9 2011-03-09 | First Commit [Alexander Shvets]
������� ���������� ��� � �������:

--pretty="..." � ���������� ������ ������.
%h � ����������� ��� �������
%d � ���������� ������� (�������� ����� ��� ����)
%ad � ���� �������
%s � �����������
%an � ��� ������
--graph � ���������� ������ �������� � ���� ASCII-�������
--date=short � ��������� ������ ���� �������� � �����������
����� �������, ������ ���, ����� �� �������� ���������� ���, ��� �������� ����� ��������. � �������, �� ������ � git ������� � ��������� �����.

05 ������ �����������
��� gitx (��� Mac) � gitk (��� ����� ���������) ������� � �������� ������� ���������.