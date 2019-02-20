11. Алиасы
Цели
Научиться настраивать алиасы и шорткаты для команд git
01 Общие алиасы
Для пользователей Windows:

ВЫПОЛНИТЬ:
	git config --global alias.co checkout
	git config --global alias.ci commit
	git config --global alias.st status
	git config --global alias.br branch
	git config --global alias.hist "log --pretty=format:'%h %ad | %s%d [%an]' --graph --date=short"
	git config --global alias.type 'cat-file -t'
	git config --global alias.dump 'cat-file -p'
Также, для пользователей Unix/Mac:

git status, git add, git commit, git checkout — общие команды, для которых полезно иметь сокращения.

Добавьте следующее в файл .gitconfig в вашем $HOME каталоге.

ФАЙЛ: .gitconfig
[alias]
  co = checkout
  ci = commit
  st = status
  br = branch
  hist = log --pretty=format:\"%h %ad | %s%d [%an]\" --graph --date=short
  type = cat-file -t
  dump = cat-file -p
Мы уже успели рассмотреть команды commit и status, в предыдущем уроке рассмотрели команду log и совсем скоро познакомимся с checkout. Главное, что стоит запомнить из этого урока, так это то, что теперь вы можете вводить  git st там, где раньше приходилось использовать git status. Аналогичным образом, пишем git co вместо git checkout и git ci вместо git commit. Что лучше всего, команда git hist позволит избежать ввода очень длинной команды log.

Попробуйте использовать новые команды.

02 Задайте алиас hist в файле .gitconfig
По большей части, я буду продолжать печатать полные команды в этом руководстве. Единственным исключением будет использование алиаса hist, указанного выше, когда мне понадобится посмотреть git лог. Если вы хотите повторять мои действия, убедитесь, что алиас hist установлен в вашем файле .gitconfig.

03Type и Dump
Мы добавили несколько алиасов для команд, которых мы еще не рассматривали. С командой git branch разберемся чуть позже, а команда  git cat-file используется для исследования git, в чем мы вскоре убедимся.

04 Алиасы команд (опционально)
Если ваша оболочка поддерживает алиасы или шорткаты, вы можете добавить алиасы и на этом уровне. Я использую:

ФАЙЛ: .profile
alias gs='git status '
alias ga='git add '
alias gb='git branch '
alias gc='git commit'
alias gd='git diff'
alias go='git checkout '
alias gk='gitk --all&'
alias gx='gitx --all'

alias got='git '
alias get='git '
Сокращение go для команды git checkout особенно полезно. Оно позволяет мне вводить:

go <branch>
для переключения в отдельную ветку.

И да, я достаточно часто пишу вместо git get или got, поэтому создам алиасы и для них.

