# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around OpenVDB, if not found on the system, will compile from source"
AUTHOR = "Tim Clephas <tim.clephas@nobleo.nl>"
ROS_AUTHOR = "Ignacio Vizzo <ignaciovizzo@gmail.com>"
HOMEPAGE = "https://github.com/AcademySoftwareFoundation/openvdb"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPL v2.1 & MPL-2.0 license"
LICENSE = "LGPL-2.1-only & MPL-2.0-license"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=458541e94fd1d7768ee3dd330b592bd3"

ROS_CN = "spatio_temporal_voxel_layer"
ROS_BPN = "openvdb_vendor"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libblosc-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    boost \
    tbb \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libblosc-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    boost \
    tbb \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libblosc-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    boost \
    tbb \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/spatio_temporal_voxel_layer-release/archive/release/jazzy/openvdb_vendor/2.5.4-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/openvdb_vendor"
SRC_URI = "git://github.com/SteveMacenski/spatio_temporal_voxel_layer-release;${ROS_BRANCH};protocol=https"
SRCREV = "dcfb0be5293e8246ad203acef0726b74e7b61052"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
