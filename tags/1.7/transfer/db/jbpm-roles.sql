CREATE ROLE jbpm_role NOSUPERUSER NOINHERIT NOCREATEDB NOCREATEROLE;
CREATE ROLE jbpm_user WITH PASSWORD 'jbpm_user_passwd' NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE LOGIN;
GRANT jbpm_role TO jbpm_user;
