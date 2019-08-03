#!/bin/bash
declare path=./
declare keyfile=coa-zc-mall-*.jar
result=$(find $path -type f -name ${keyfile})

java \
-javaagent:/pp-agent/pinpoint-bootstrap-1.6.2.jar \
-Dpinpoint.agentId=`[ ${#HOSTNAME} -ge 24 ] && echo ${HOSTNAME:0-24:24} ||echo ${HOSTNAME}` \
-Dpinpoint.applicationName=$SVC \
-Xmx2048M -Xms2048M -Xmn512M -XX:PermSize=256M -XX:MaxPermSize=256M \
-Dspring.profiles.active=online \
-Dkube.logpath=$LOGPATH \
-Dkube.svc=$SVC \
-Dkube.hostname=$HOSTNAME
-server \
-jar ${result} \
