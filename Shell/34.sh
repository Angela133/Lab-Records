#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Usage: $0 directory"
    exit 1
fi

directory=$1

if [ ! -d $directory ]; then
    echo "Error: $directory is not a directory"
    exit 1
fi

num_files=$(find $directory -maxdepth 1 -type f | wc -l)
num_dirs=$(find $directory -maxdepth 1 -type d | wc -l)

echo "Number of files in $directory: $num_files"
echo "Number of directories in $directory: $((num_dirs - 1))"

