arr=(1 2 3)

for i in "${arr[@]}"; do
    for j in "${arr[@]}"; do
        for k in "${arr[@]}"; do
            
            echo "$i$j$k"
        done
    done
done

