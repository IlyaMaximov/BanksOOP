FROM mysql:8.0
ARG mysql_user=bank
ARG mysql_password=password
ARG mysql_root_password=root

ENV MYSQL_USER=$mysql_user
ENV MYSQL_PASSWORD=$mysql_password
ENV MYSQL_ROOT_PASSWORD=$mysql_root_password

ADD sql/* /docker-entrypoint-initdb.d
ENTRYPOINT ["docker-entrypoint.sh"]
EXPOSE 3306 33060
CMD ["mysqld"]