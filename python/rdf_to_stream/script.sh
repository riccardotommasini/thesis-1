mkdir -p results
FILE="results/result_$(date +"%s")"
script_full_path=$(dirname "$0")
echo ${FILE}
python3 -u $script_full_path/script.py $3 n3 $4 $5 $1 $2 > ${FILE}.txt
jq -s  -c 'sort_by(.ts) | .[]' < ${FILE}.txt > ${FILE}_sorted.txt
du -h ${FILE}_sorted.txt ${FILE}.txt
rm ${FILE}.txt
echo generated ${FILE}_sorted.txt from: $(ls $3 | sort | head -n $2)
