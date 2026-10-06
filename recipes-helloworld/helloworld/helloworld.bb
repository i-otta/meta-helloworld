DESCRIPTION = "Hello World prog"

# HOMEPAGE = "??? dont know what is this"

LICENSE = "CLOSED"

SECTION = "examples"

# DEPENDS = ""

# LIC_FILES_CHKSUM = ""


SRC_URI = "file://hellow.cpp"

S = "${WORKDIR}"

do_compile() {

    ${CXX} ${CXXFLAGS} ${LDFLAGS} -o helloworld hellow.cpp

}

do_install() {

    install -d ${D}${bindir}

    install -m 0755 ${S}/helloworld ${D}${bindir}

}

FILES${PN} += "${bindir}/helloworld"