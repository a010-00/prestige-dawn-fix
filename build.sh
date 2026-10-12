#!/usr/bin/env bash
set -e

JAVAC="javac"
JAR="jar"

if [ -n "$JAVA_HOME" ]; then
    JAVAC="$JAVA_HOME/bin/javac"
    JAR="$JAVA_HOME/bin/jar"
fi

rm -rf build
mkdir -p build/classes release

echo "compiling stubs from source..."
find src/main/java -name "*.java" > build/sources.txt
"$JAVAC" -d "build/classes" @build/sources.txt

cp src/main/resources/fabric.mod.json build/classes/

echo "packaging jar..."
rm -f release/prestige-dawn-fix-1.0.0.jar
"$JAR" -cf "release/prestige-dawn-fix-1.0.0.jar" -C "build/classes" .

echo "build completed: release/prestige-dawn-fix-1.0.0.jar"
