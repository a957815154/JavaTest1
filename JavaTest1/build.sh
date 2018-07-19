mvn package
for((i=1;i<4;i++));
do
cd Exam$i/target
echo "this is answer $i"
java -jar Exam$i.jar
cd ../..
done