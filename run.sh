#!/bin/bash

## packaging
mvn clean package

## clean screen

clear


## run 

java -cp target/SimpleCmdTetris-0.0.1-SNAPSHOT.jar dxglide.apps.games.cmd.tetris.CmdGameApp
