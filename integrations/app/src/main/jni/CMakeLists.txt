cmake_minimum_required(VERSION 3.22.1)
project(biliroamingx)

enable_language(CXX C)
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_C_STANDARD 11)

macro(SET_OPTION option value)
    set(${option} ${value} CACHE INTERNAL "" FORCE)
endmacro()

set(LIBS_DIR ../../../../libs)

SET_OPTION(DOBBY_DEBUG OFF)
SET_OPTION(DOBBY_GENERATE_SHARED OFF)
SET_OPTION(Plugin.SymbolResolver OFF)
add_subdirectory(${LIBS_DIR}/Dobby dobby)

add_library(${PROJECT_NAME} SHARED biliroamingx.cc)
find_library(log-lib log)

target_link_libraries(${PROJECT_NAME} PUBLIC dobby ${log-lib})
