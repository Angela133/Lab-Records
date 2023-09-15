find . -type f | while read file; do
  
  if [ ! -x "$file" ]; then
    
    chmod +x "$file"
    echo "Made $file executable"
  fi
done

