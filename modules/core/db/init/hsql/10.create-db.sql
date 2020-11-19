-- begin SEC_USER
alter table SEC_USER add column ADDRESS varchar(100) ^
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'extenduser_MyExtUser' where DTYPE is null ^
-- end SEC_USER
