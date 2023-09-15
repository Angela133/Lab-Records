echo "Enter a number: "
read num

# Initialize the min variable to the first digit of the number
min=${num:0:1}

# Loop through the remaining digits of the number and update min as needed
for (( i=1; i<${#num}; i++ ))
do
    digit=${num:$i:1}
    if (( digit < min )); then
        min=$digit
    fi
done

# Output the result
echo "The smallest digit in $num is $min."
