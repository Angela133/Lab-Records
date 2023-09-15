# Define the function to calculate the sum of digits
sum_of_digits() {
    num=$1
    sum=0
    while [ $num -gt 0 ]
    do
        digit=$((num % 10))
        sum=$((sum + digit))
        num=$((num / 10))
    done
    echo $sum
}

# Prompt the user to enter a number
echo "Enter a number: "
read num

# Call the function to calculate the sum of digits
result=$(sum_of_digits $num)

# Output the result
echo "The sum of digits of $num is $result."
