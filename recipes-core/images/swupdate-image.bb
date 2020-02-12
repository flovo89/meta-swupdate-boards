SUMMARY = "Basic swu image"
DESCRIPTION = "Contains all the tools to use swupdate"
AUTHOR = "Florian Vogel <flovo89@hotmail.com>"
HOMEPAGE = "https://github.com/flovo89"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require recipes-core/images/core-image-base-network-setup.bb

IMAGE_FSTYPES += "ext4.gz wic"

WKS_FILE = "wic/swupdate-image.wks"

IMAGE_INSTALL += " \
    swupdate \
    swupdate-www \
    swupdate-tools \
    u-boot-fw-utils \
    lua \
    parted \
    "
