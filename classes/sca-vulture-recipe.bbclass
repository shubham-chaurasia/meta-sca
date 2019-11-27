## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

SCA_DEPLOY_TASK = "do_sca_deploy_vulture_recipe"

python do_sca_deploy_vulture_recipe() {
   sca_conv_deploy(d, "vulture", "txt")
}

addtask do_sca_vulture_core before do_install after do_compile
addtask do_sca_deploy_vulture_recipe before do_package after do_sca_vulture_core

do_sca_vulture_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_vulture_recipe[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-recipe-vulture-rules-native"