# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "The autoware_lanelet2_extension_python package contains Python bindings for lanelet2_extension package"
AUTHOR = "Mamoru Sobue <mamoru.sobue@tier4.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "autoware_lanelet2_extension"
ROS_BPN = "autoware_lanelet2_extension_python"

ROS_BUILD_DEPENDS = " \
    autoware-lanelet2-extension \
    boost \
    geometry-msgs \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-python \
    lanelet2-routing \
    lanelet2-traffic-rules \
    lanelet2-validation \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    autoware-cmake-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    autoware-lanelet2-extension \
    boost \
    geometry-msgs \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-python \
    lanelet2-routing \
    lanelet2-traffic-rules \
    lanelet2-validation \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    autoware-lanelet2-extension \
    boost \
    geometry-msgs \
    lanelet2-core \
    lanelet2-io \
    lanelet2-projection \
    lanelet2-python \
    lanelet2-routing \
    lanelet2-traffic-rules \
    lanelet2-validation \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-ros \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/autoware_lanelet2_extension-release/archive/release/jazzy/autoware_lanelet2_extension_python/0.6.2-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/autoware_lanelet2_extension_python"
SRC_URI = "git://github.com/ros2-gbp/autoware_lanelet2_extension-release;${ROS_BRANCH};protocol=https"
SRCREV = "4dd945722949829d71132475b2a7fd239e895f54"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
