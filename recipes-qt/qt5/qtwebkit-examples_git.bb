require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 & BSD & ( GPL-3.0 & The-Qt-Company-GPL-Exception-1.0 | The-Qt-Company-Commercial ) & ( GPL-2.0+ | LGPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=c96076271561b0e3785dad260634eaa8 \
    file://LICENSE.LGPLv21;md5=4bfd28363f541b10d9f024181b8df516 \
    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
    file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705 \
    file://examples/webkitwidgets/scroller/wheel/main.cpp;endline=39;md5=b0739af76072fbe303dc04b6941e054f \
    file://examples/webkitwidgets/imageanalyzer/imageanalyzer.cpp;endline=39;md5=b0739af76072fbe303dc04b6941e054f \
"

PACKAGECONFIG ?= "examples"

DEPENDS += "qtwebkit qtxmlpatterns"
RDEPENDS_${PN}-examples += "qtwebkit-qmlplugins"
RDEPENDS_${PN}-examples += "${@bb.utils.contains('PACKAGECONFIG_OPENSSL', 'openssl', 'ca-certificates', '', d)}"

SRCREV = "1ac4ee240214a0e36b504fa1bcbc0c716d50620f"
