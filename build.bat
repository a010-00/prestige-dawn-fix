@echo off
setlocal

if not defined JAVA_HOME (
    set "JAVAC=javac"
    set "JAR=jar"
) else (
    set "JAVAC=%JAVA_HOME%\bin\javac.exe"
    set "JAR=%JAVA_HOME%\bin\jar.exe"
)

if exist build rmdir /s /q build
mkdir build\classes 2>nul
if not exist release mkdir release 2>nul

echo compiling stubs from source...
dir /s /b src\main\java\*.java > build\sources.txt
"%JAVAC%" -d "build\classes" @build\sources.txt || exit /b 1

xcopy /s /e /y /i /q "src\main\resources" "build\classes" >nul

echo packaging jar...
if exist "release\prestige-dawn-fix-1.0.0.jar" del /f /q "release\prestige-dawn-fix-1.0.0.jar"
"%JAR%" -cf "release\prestige-dawn-fix-1.0.0.jar" -C "build\classes" . || exit /b 1

echo build completed: release\prestige-dawn-fix-1.0.0.jar
