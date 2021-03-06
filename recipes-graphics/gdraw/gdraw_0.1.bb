DESCRIPTION =	"simple gtk draw test"
HOMEPAGE = "http://github.com/rob-w/gdraw"
AUTHOR = "Robert Woerle"
MAINTAINER = "Robert Woerle <rwoerle@mibtec.de>"
DEPENDS = "libgpewidget gtk+ glib-2.0"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
SRCREV = "958b77fa1a76b4d21377f40d8482a8ea742c6667"

S = "${WORKDIR}/git"

#Remove the dash below when 0.1 changes in PV
PV = "0.1"

inherit autotools pkgconfig
SRC_URI = "git://github.com/rob-w/gdraw.git;protocol=git"
CFLAGS_append += " -DBUILDDATE=${DATE}"
