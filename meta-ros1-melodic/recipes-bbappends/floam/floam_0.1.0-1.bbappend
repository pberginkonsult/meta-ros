# Copyright (c) 2021 LG Electronics, Inc.

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-append-to-CMAKE_CXX_FLAGS-instead-of-.patch \
    file://0002-src-odom_estimation_node.cpp-include-chrono.patch \
    file://0003-src-lidar_scanner_node.cpp-use-boost-make_shared-to-.patch \
"
