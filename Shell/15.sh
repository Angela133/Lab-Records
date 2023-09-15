echo "Enter a list of numbers separated by spaces: "
read numbers

# Convert the input string to an array of numbers
IFS=' ' read -ra nums <<< "$numbers"

# Initialize the min and max variables to the first number in the array
min=${nums[0]}
max=${nums[0]}

# Loop through the remaining numbers in the array and update min and max as needed
for num in "${nums[@]}"
do
    if (( num < min )); then
        min=$num
    fi
    if (( num > max )); then
        max=$num
    fi
done

# Output the result
echo "The smallest number is $min."
echo "The largest number is $max."

