DESCRIPTION = "Example image demonstrating how to build SWUpdate compound image"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = "\
    file://emmcsetup.lua \
    file://sw-description \
"

# images to build before building swupdate image
IMAGE_DEPENDS = "swupdate-image"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "swupdate-image"

SWUPDATE_IMAGES_FSTYPES[swupdate-image] = ".ext4.gz"

do_update_versions_in_description() {
    sed -i 's/##MACHINE_PLACEHOLDER##/'${MACHINE}'/g' ${WORKDIR}/sw-description
}
addtask do_update_versions_in_description after do_unpack before do_swuimage