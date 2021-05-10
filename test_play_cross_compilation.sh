#!/bin/bash -xe

export PLAY_VERSION="2.6"
sbt "; version; show libraryDependencies; clean; test"

export PLAY_VERSION="2.7"
sbt "; version; show libraryDependencies; clean; test"

export PLAY_VERSION="2.8"
sbt "; version; show libraryDependencies; clean; test"
