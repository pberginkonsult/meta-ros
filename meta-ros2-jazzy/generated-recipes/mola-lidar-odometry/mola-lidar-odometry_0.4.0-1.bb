# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "LIDAR odometry system based on MOLA and MRPT components"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://docs.mola-slam.org/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mola_lidar_odometry"
ROS_BPN = "mola_lidar_odometry"

ROS_BUILD_DEPENDS = " \
    ament-cmake-xmllint \
    mola-common \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-navstate-fuse \
    mola-pose-list \
    mp2p-icp \
    mrpt-libmaps \
    mrpt-libtclap \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-gtest-native \
    ament-cmake-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    mola-common \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-navstate-fuse \
    mola-pose-list \
    mp2p-icp \
    mrpt-libmaps \
    mrpt-libtclap \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mola-common \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-launcher \
    mola-navstate-fuse \
    mola-pose-list \
    mola-viz \
    mp2p-icp \
    mrpt-libmaps \
    mrpt-libtclap \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-xmllint \
    ament-lint-auto \
    ament-lint-cmake \
    mola-metric-maps \
    mola-test-datasets \
    rosbag2-storage-mcap \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mola_lidar_odometry-release/archive/release/jazzy/mola_lidar_odometry/0.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/mola_lidar_odometry"
SRC_URI = "git://github.com/ros2-gbp/mola_lidar_odometry-release;${ROS_BRANCH};protocol=https"
SRCREV = "9daf612582984c83e4b53765b37c74976e1a1ac9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
