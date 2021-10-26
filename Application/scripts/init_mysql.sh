mysql_password=password
mysql_root_password=root
mysql_user=bank
mysql_port=4444
while [ $# -gt 0 ]; do
	case "$1" in
		--mysql_password*)
			mysql_password=$2
			shift 2
			;;
		--mysql_root_password*)
			mysql_root_password=$2
			shift 2
			;;
		--mysql_user*)
			mysql_user=$2
			shift
			;;
		--mysql_port*)
			mysql_port=$2
			shift 2
			;;
		*)
			printf "Invalid argument %s" "$1"
			exit 1
	esac
done

docker stop bank_mysql >/dev/null
docker rm bank_mysql >/dev/null
docker rmi bank_mysql_docker >/dev/null

docker build -t bank_mysql_docker . \
  --build-arg mysql_user="$mysql_user" --build-arg mysql_password="$mysql_password" \
  --build-arg mysql_root_password="$mysql_root_password"

docker run --name bank_mysql -p "$mysql_port":3306 -d bank_mysql_docker:latest