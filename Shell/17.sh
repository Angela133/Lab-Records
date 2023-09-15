sum=0

# Loop through the numbers between 50 and 100
for (( num=50; num<=100; num++ ))
do
    # Check if the number is divisible by 3 and not divisible by 5
    if (( num % 3 == 0 && num % 5 != 0 )); then
        sum=$((sum + num))
    fi
done

# Output the result
echo "The sum of all numbers between 50 and 100, which are divisible by 3 and not divisible by 5, is $sum."
