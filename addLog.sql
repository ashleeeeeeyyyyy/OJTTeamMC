CREATE PROCEDURE `addLog`(date date, time_in time(6), idnumber int(11))
BEGIN
	insert into log(date, time_in, idnumber)
		values(date, time_in, idnumber);
END