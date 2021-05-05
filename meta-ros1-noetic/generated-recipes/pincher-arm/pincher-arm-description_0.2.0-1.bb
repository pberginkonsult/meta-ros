# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "URDF Description package for PhantomX Pincher arm"
AUTHOR = "Fictionlab <support@fictionlab.pl>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & CC BY-NC-SA 4.0"
LICENSE = "BSD & CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pincher_arm"
ROS_BPN = "pincher_arm_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fictionlab-gbp/pincher_arm-release/archive/release/noetic/pincher_arm_description/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pincher_arm_description"
SRC_URI = "git://github.com/fictionlab-gbp/pincher_arm-release;${ROS_BRANCH};protocol=https"
SRCREV = "1968a308e25943e41a220b57524cd6d2d21b315a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
