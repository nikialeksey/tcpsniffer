#include <jni.h>
#include <string>
#include "pcap.h"

extern "C" jstring Java_com_nikialeksey_tcpsniffer_NativeLib_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}