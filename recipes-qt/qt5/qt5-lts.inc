require qt5-git.inc

QT_GIT = "git://codereview.qt-project.org:29418/${QT_GIT_PROJECT}"
QT_GIT_PROTOCOL = "ssh"
QT_MODULE_BRANCH = "tqtc/lts-5.15"
QT_MODULE_REPO = "tqtc-${QT_MODULE}.git"

# Default to commercially licensed Qt LTS
QT_EDITION = "commercial"
