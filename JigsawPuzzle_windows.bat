@echo off

java -classpath "dist;dist/lib;dist/JigsawPuzzle.jar" -Dsun.java2d.noddraw=true -Djava.library.path="dist;dist/lib/windows;dist/JigsawPuzzle.jar" com.bianisoft.games.jigsawpuzzle.AppJigsawPuzzle
