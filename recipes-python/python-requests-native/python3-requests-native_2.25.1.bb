SUMMARY = "Python HTTP Requests for Humans"
HOMEPAGE = "https://github.com/psf/requests"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            ${PYTHON_PN}-certifi-native \
            ${PYTHON_PN}-chardet-native \
            ${PYTHON_PN}-idna-native \
            ${PYTHON_PN}-urllib3-native \
           "

PYPI_PACKAGE = "requests"

SRC_URI[md5sum] = "514d6f7eba77ada0b8c98ec7818828db"
SRC_URI[sha256sum] = "27973dd4a904a4f13b263a19c866c13b92a39ed1c964655f025f3f8d3d75b804"

inherit pypi
inherit native
inherit setuptools3
