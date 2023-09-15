echo "Select an option:"
echo "1. List current directory"
echo "2. Print working directory"
echo "3. Display date"
echo "4. Display users logged in"

read option

case $option in
  1)
    ls -l
    ;;
  2)
    pwd
    ;;
  3)
    date
    ;;
  4)
    who
    ;;
  *)
    echo "Invalid option selected"
    ;;
esac

