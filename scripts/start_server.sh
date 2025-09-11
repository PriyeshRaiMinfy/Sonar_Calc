#!/bin/bash
cd /home/ec2-user/app

# Kill old process if running
pkill -f 'JavaCalculator-1.0-SNAPSHOT.jar' || true

# Start new process
nohup java -jar JavaCalculator-1.0-SNAPSHOT.jar > app.log 2>&1 &
