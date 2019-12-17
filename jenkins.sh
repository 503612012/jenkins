#!/bin/bash

env_args="-Xms128M -Xmx128M -XX:NewRatio=2 -Xverify:none"
sleeptime=0
arglen=$#

get_pid(){
    pname="`find .. -name 'jenkins*.jar'`"
    pname=${pname:3}
    pid=`ps -ef | grep ${pname} | grep -v grep | awk '{print $2}'`
    echo "$pid"
}

startup(){
    pid=$(get_pid)
    if [[ "$pid" != "" ]]
    then
        echo "App already startup!"
    else
        jar_path=`find .. -name 'jenkins*.jar'`
        echo "jarfile=$jar_path"
        cmd="java $1 -jar $jar_path > ./log.out < /dev/null &"
        echo "cmd: $cmd"
        java $1 -jar ${jar_path} > ./log.out < /dev/null &
        show_log
    fi
}

shut_down(){
    pid=$(get_pid)
    if [[ "$pid" != "" ]]
    then
        kill -9 ${pid}
        echo "App is stop!"
    else
        echo "App already stop!"
    fi
}

show_log(){
    tail -f log.out
}

show_help(){
    echo -e "\r\n\t欢迎使用JENKINS"
    echo -e "\r\nUsage: sh jenkins.sh start|stop|reload|status|log"
    exit
}

show_status(){
    pid=$(get_pid)
    if [[ "$pid" != "" ]]
    then
        echo "App is running with pid: $pid"
    else
        echo "App is stop!"
    fi
}

if [[ ${arglen} -eq 0 ]]
 then
    show_help
else
    if [[ "$2" != "" ]]
    then
        env_args="$2"
    fi
    case "$1" in
        "start")
            startup "$env_args"
            ;;
        "stop")
            shut_down
            ;;
        "reload")
            echo "reload"
            ;;
        "status")
            show_status
            ;;
        "log")
            show_log
            ;;
    esac
fi