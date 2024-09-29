begin
DECLARE @a int = 2;
IF(@a % 2 = 0)
 BEGIN
 PRINT 'OK'
 END
 ELSE
 BEGIN
 PRINT 'NOT'
 END
end
