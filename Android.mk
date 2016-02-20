LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_STATIC_JAVA_LIBRARIES := protobuf grpc

LOCAL_PACKAGE_NAME := GrpcBridge
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true
LOCAL_PROGUARD_ENABLED := disabled

include $(BUILD_PACKAGE)
include $(CLEAR_VARS)

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := \
    protobuf:libs/protobuf-java-3.0.0-beta-2.jar \
    grpc:libs/grpc-all-0.12.0.jar

include $(BUILD_MULTI_PREBUILT)

