# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "A visualizer for doors and lifts"
AUTHOR = "Yadunund <yadunund@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_visualization"
ROS_BPN = "rmf_visualization_building_systems"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_visualization-release/archive/release/galactic/rmf_visualization_building_systems/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/rmf_visualization_building_systems"
SRC_URI = "git://github.com/ros2-gbp/rmf_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "9c4d550adccb3b64a16b81a31fd8372be31d93db"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
