echo $1
nw=$1
for n in $(seq 1 $nw) ; do
#echo "start worker"
java --class-path /Users/elya/Desktop/RMIJava-task4/out/production/RMIJava-task4 com.dctask4.RMIClient &
done && wait
