# Define the function to reverse a number
reverse_number() {
    num=$1
    rev=0
    while [ $num -gt 0 ]
    do
        digit=$((num % 10))
        rev=$((rev * 10 + digit))
        num=$((num / 10))
    done
    echo $rev
}

# Prompt the user to enter a number
echo "Enter a number: "
read num

# Call the function to reverse the number
result=$(reverse_number $num)

# Output the result
echo "The reverse of $num is $result."
