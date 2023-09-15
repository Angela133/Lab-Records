echo "Enter the number of terms to generate: "
read num


a=0
b=1


echo -n "$a $b"


for (( i=3; i<=$num; i++ ))
do
   
    c=$((a + b))

    
    echo -n " $c"

    
    a=$b
    b=$c
done

echo
