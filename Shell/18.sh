echo "Enter a set of numbers separated by spaces: "
read numbers

# Convert the space-separated string to an array
arr=($numbers)

# Sort the array in descending order
sorted_arr=($(echo "${arr[@]}" | tr " " "\n" | sort -rn))

# Output the second highest number
echo "The second highest number is ${sorted_arr[1]}."
