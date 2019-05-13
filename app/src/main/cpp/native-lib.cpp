#include <jni.h>
#include <string>

extern "C"
{
    #include <liba.h>
}


extern "C" JNIEXPORT jstring JNICALL
Java_com_mayulive_myapplication_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */)
{
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hellostr());
}
