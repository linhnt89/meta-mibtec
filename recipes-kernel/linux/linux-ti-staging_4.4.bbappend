FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-4.4:"

KERNEL_DEVICETREE_ti43x = "am437x-misdimm-evm.dtb am437x-mispanel070f.dtb \
			am437x-mispanel070h.dtb am437x-mispanel070g.dtb \
			am437x-mispanel120b.dtb"

SRCREV = "61972389e3f3de13208dae31a4929b05945f501a"
PV = "4.4.15"
BRANCH = "mis-4.4.y"

KERNEL_GIT_URI = "git://github.com/rob-w/mibtec-kernel"
KERNEL_GIT_PROTOCOL = "git"
SRC_URI = "${KERNEL_GIT_URI};protocol=${KERNEL_GIT_PROTOCOL};branch=${BRANCH} \
            file://defconfig \
            file://configs/empty \
           "
