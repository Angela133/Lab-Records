# Prompt the user to enter a number
echo "Enter a number: "
read num

# Initialize the factorial to 1
factorial=1

# Calculate the factorial using a for loop
for (( i=1; i<=$num; i++ ))
do
    factorial=$((factorial * i))
done

# Output the result
echo "The factorial of $num is $factorial."
