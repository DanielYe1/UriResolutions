cmake_minimum_required(VERSION 3.6)
project(C__Resolutions)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES
        #DataStructures/1215.cpp
        #DataStructures/1527.cpp
        #DataStructures/1451.cpp
        #DataStructures/1023.cpp
        #DataStructures/1110.cpp
        #DataStructures/1088.cpp
        #Beginner/1837.cpp
        #Beginner/1828.cpp
        #Beginner/1858.cpp
        #Beginner/1864.cpp
        #Beginner/1924.cpp
        #Beginner/1985.cpp
        #Beginner/1962.cpp
        #Beginner/1933.cpp
        #Beginner/1930.cpp
        #Beginner/1865.cpp
        #Beginner/1866.cpp
        #Math/1028.cpp
        #Paradigms/2243.cpp
        #DataStructures/1261.cpp
        #DataStructures/1449.cpp
        #Strings/1243.cpp
        #DataStructures/2091.cpp
        #Ad-Hoc/1136.cpp
        #Ad-Hoc/2090.cpp
        )
add_executable(C__Resolutions ${SOURCE_FILES})