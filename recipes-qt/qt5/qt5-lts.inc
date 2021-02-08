require qt5-git.inc

QT_GIT = "git://codereview.qt-project.org/${QT_GIT_PROJECT}"
QT_LTS_GIT_PROTOCOL ?= "ssh"
QT_GIT_PROTOCOL = "${QT_LTS_GIT_PROTOCOL}"
QT_MODULE_BRANCH = "tqtc/lts-5.15"
QT_MODULE_REPO = "tqtc-${QT_MODULE}.git"

# Default to commercially licensed Qt LTS
QT_EDITION = "commercial"
