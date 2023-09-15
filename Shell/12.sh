echo "Enter a number: "
read number

# Initialize the sum to 0
sum=0

# Loop through the digits of the number and calculate the sum of their squares
while [ $number -ne 0 ]
do
    digit=$((number % 10))
    sum=$((sum + digit * digit))
    number=$((number / 10))
done

# Output the result
echo "The sum of the squares of the digits is $sum."
