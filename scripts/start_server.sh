#!/bin/bash
# Navigate to app directory
cd /home/ec2-user/app

# Kill any existing Java process
pkill -f 'java -jar' || true

# Start the new JAR in background
nohup java -jar java-calc-1.0.0.jar > app.log 2>&1 &
