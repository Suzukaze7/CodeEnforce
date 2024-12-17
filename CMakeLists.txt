cmake_minimum_required(VERSION 3.21)

set(PROJ P0werEngine)

project(${PROJ})

include_directories(${PROJ}/include)
file(GLOB_RECURSE SRC ${PROJ}/src/*.cpp)

set(CMAKE_EXPORT_COMPILE_COMMANDS TRUE)
# set(CMAKE_VERBOSE_MAKEFILE ON)

set(CMAKE_CXX_STANDARD 23)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wno-c++98-compat-pedantic -Wno-undef -Wno-newline-eof")
if (NOT WIN32 AND CMAKE_CXX_COMPILER_ID STREQUAL "Clang")
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -stdlib=libc++ -fexperimental-library")
endif()

file(GLOB_RECURSE ALL ${PROJ}/*.cpp ${PROJ}/*.hpp)
add_custom_target(tidy COMMAND clang-tidy --config-file ${PROJECT_SOURCE_DIR}/.clang-tidy -p ${PROJECT_BINARY_DIR} ${ALL})

add_library(P0werEngine-Library SHARED ${SRC})
target_compile_options(P0werEngine-Library PUBLIC -DUNICODE)

add_executable(P0werEngine-Example Example/P0werEngine/Main.cpp ${SRC})
target_compile_options(P0werEngine-Example PRIVATE -DUNICODE)