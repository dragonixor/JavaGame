Here's a list of linux bash commands: https://ss64.com/bash/
Here's the git documentation: https://git-scm.com/docs

Warning: A $ symbol means the beginning of a command. You do not need to write $
in front of every command in the console. This is just to differentiate text from a command.

Here's how you should routinely use git whenever you're in a team:

1. Start by doing 
	$git pull

This command will "pull" the content from the repo into your local repo that you have cloned.
It's important to always pull from the repo before starting to work because some people are idiots
and they change stuff without telling anyone and if someone tries to push without being up to
date with the repo (i.e. they haven't pulled yet), conflicts happen and they are often a bitch to resolve.

Warning: If you have changes in your current working directory that you want to keep for later,
use 
	$git stash

before pulling from the repo.

This command will save your changes and you can reapply them by doing
	$git stash apply

2. Once you have done some work that has been ***TESTED THOUROUGHLY*** to make sure it is ***FUNCTIONAL***
do the following commands:
	
	$git add .
This command adds all your files to the commit stage. The space (" ") and the period (".") specifies
that you will add all the files.

	$git commit -m"Your initials- A message detailing what you commited to the repo"
This command will commit all your changes. Make sure to always make a message in the format 
described here and shown above:
Start with your initials and follow it with the description so we can see who commited what.
Being concise is highly advised because some people that are also idiots might completely 
ignore the commit message.

	$git push
This command updates the repo with the files you have previously commited.