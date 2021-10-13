cmake_minimum_required(VERSION 3.6)
project("tcpsniffer")

add_library(tcpsniffer SHARED src/main/cpp/tcpsniffer.cpp)

add_library(libpcap STATIC IMPORTED)
set_target_properties(libpcap PROPERTIES IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libpcap.a)
target_link_libraries(tcpsniffer libpcap)

find_library(log-lib log)
target_link_libraries(tcpsniffer ${log-lib})

include_directories(${CMAKE_SOURCE_DIR}/jni/libpcap/include/)