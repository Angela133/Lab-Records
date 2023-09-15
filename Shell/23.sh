if [ $# -ne 2 ]
then
  echo "Usage: $0 file1 file2"
  exit 1
fi

if [ ! -f "$1" ] || [ ! -f "$2" ]
then
  echo "Error: File does not exist."
  exit 1
fi

if cmp -s "$1" "$2"
then
  echo "Files have identical contents. Deleting $2"
  rm "$2"
else
  echo "Files have different contents."
fi
