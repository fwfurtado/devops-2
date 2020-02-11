#!/bin/bash

if [ -z "$1" ]; then
  wait-for-it $DATABASE_HOST:$DATABASE_PORT -t 30 -s -- java -jar app.jar
else
  exec "$@"
fi