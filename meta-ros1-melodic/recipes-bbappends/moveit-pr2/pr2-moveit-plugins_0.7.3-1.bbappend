# Copyright (c) 2020 LG Electronics, Inc.

do_configure_append() {
    # Fixes this:
    # pr2-moveit-plugins/0.7.3-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cstdlib:75:15: fatal error: stdlib.h: No such file or directory
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}
