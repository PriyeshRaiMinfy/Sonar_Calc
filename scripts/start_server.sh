#!/bin/bash

# Give the ec2-user ownership of the entire app directory
# This is the crucial step that fixes the permissions issue
sudo chown -R ec2-user:ec2-user /home/ec2-user/app

# Navigate to app directory
cd /home/ec2-user/app

# Kill any existing Java process to ensure a clean start
pkill -f 'java -jar' || true

# Start the new JAR in background. 
# The log file can now be created successfully by the ec2-user.
nohup java -jar java-calc-1.0.0.jar > app.log 2>&1 &
