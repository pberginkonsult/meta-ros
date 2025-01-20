# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "SE(3) pose and twist path data fusion estimator"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://github.com/MOLAorg/mola/tree/develop/mola_navstate_fuse"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=e9f2deaa804a16d9e0d3965ef77e171e"

ROS_CN = "mola"
ROS_BPN = "mola_navstate_fg"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libboost-timer-dev} \
    boost \
    gtsam \
    mola-common \
    mola-imu-preintegration \
    mola-kernel \
    mrpt-libobs \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    mola-common \
    mola-imu-preintegration \
    mola-kernel \
    mrpt-libobs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mola-common \
    mola-imu-preintegration \
    mola-kernel \
    mrpt-libobs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mola-release/archive/release/jazzy/mola_navstate_fg/1.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/mola_navstate_fg"
SRC_URI = "git://github.com/ros2-gbp/mola-release;${ROS_BRANCH};protocol=https"
SRCREV = "49f2ed9f9b32f93f393be4ee5b01cf7affc3e24f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
