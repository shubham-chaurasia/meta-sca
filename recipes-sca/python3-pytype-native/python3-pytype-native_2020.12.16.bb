SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-ninja-native \
            ${PYTHON_PN}-pybind11-native \
            ${PYTHON_PN}-pylint-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-typed-ast-native \
            cmake-native \
            "

SRC_URI_append = " file://pytype.sca.description"
SRC_URI[md5sum] = "211d5435daf2f8a80ba12601136cce65"
SRC_URI[sha256sum] = "8d6210aa5631b6c276a4dbec459d71078fa44c49036796631b76e65e1024ef47"

PYPI_PACKAGE = "pytype"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_configure_prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
