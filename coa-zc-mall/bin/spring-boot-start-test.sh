#!/bin/bash
declare path=./
declare keyfile=coa-zc-mall-*.jar

PID=$(ps -ef|grep ${keyfile}|grep -v grep|awk '{print $2}')
if [ -z $PID ]; then
  echo "process provider not exist"
else
  echo "process id: $PID"
  kill -9 ${PID}
  echo "process provider killed"
fi
result=$(find $path -type f -name ${keyfile})
echo find the jar file:${result}
echo exec command nohup java -jar -Dspring.profiles.active=test ${result} &
nohup java -jar -Dspring.profiles.active=test ${result} > catalina.out 2>&1 &
